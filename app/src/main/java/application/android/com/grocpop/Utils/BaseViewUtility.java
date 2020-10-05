package application.android.com.grocpop.Utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

import application.android.com.grocpop.R;

/**
 *
 * @param <ViewT>
 */
public class BaseViewUtility<ViewT>  {

    ViewT view;
    private static AlertDialog alertDialog;
    private ProgressDialog mProgressDialog;

    public BaseViewUtility(ViewT view) {
        this.view = view;
    }

    public Activity getActivity() {
        if (view != null) {
            if (view instanceof AppCompatActivity) {
                return ((AppCompatActivity) view);
            } else if (view instanceof DialogFragment) {
                return ((BaseDialogFragment) view).getActivity();
            } else {
                return ((BaseFragment) view).getActivity();

            }
        }
        return null;
    }

    void showToastMessage(String message) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
        }
    }

    public void showDialog(DialogInterface.OnClickListener okClickListener, DialogInterface.OnClickListener cancelListener, String okText, String cancelText, String title, String message, boolean isCancelOnOutsideTouch, boolean isContentHtml) {

        if (getActivity() != null && !getActivity().isFinishing()) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity(), R.style.AlertDialogTheme);

            if (title != null)
                alertDialogBuilder.setTitle(CommonUtils.getColoredSpannableText(title, ContextCompat.getColor(getActivity(), R.color.color_ff2c2a2d), 0, title.length()));
            else
                alertDialogBuilder.setTitle(null);


            // Initialize a new spannable string builder instance
            if (!TextUtils.isEmpty(message)) {
                alertDialogBuilder
                        .setMessage(isContentHtml ?
                                CommonUtils.fromHtml(message) : CommonUtils.getColoredSpannableText(message, ContextCompat.getColor(getActivity(), R.color.color_FF8E8C90), 0, message.length()));
            }

            if (!isCancelOnOutsideTouch) {
                alertDialogBuilder.setCancelable(false);
            } else {
                alertDialogBuilder.setCancelable(true);
            }
            alertDialogBuilder.setPositiveButton(okText, okClickListener)
                    .setNegativeButton(cancelText, cancelListener);

            if (alertDialog != null) {
                alertDialog.dismiss();
                alertDialog.cancel();
            }

            alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    public void dismissDialog() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }
    }


    public void showLoading(String loadingText) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (mProgressDialog != null && mProgressDialog.isShowing()) {
                mProgressDialog.setMessage(loadingText);
                return;
            }
            mProgressDialog = new ProgressDialog(getActivity());
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setMessage(loadingText);
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setCanceledOnTouchOutside(false);
            mProgressDialog.setCancelable(false);
            mProgressDialog.show();
        }
    }


    public void hideLoading() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (mProgressDialog != null && mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
        }
    }
}
