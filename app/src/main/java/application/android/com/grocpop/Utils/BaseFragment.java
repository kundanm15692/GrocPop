package application.android.com.grocpop.Utils;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment implements IBaseView {
    protected BaseViewUtility mBaseViewUtility;
    public DataProccessor sharedPrefObject;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        sharedPrefObject = new DataProccessor(context);
        mBaseViewUtility = new BaseViewUtility(this);
    }

    @Override
    public void showToastMessage(String message) {
       mBaseViewUtility.showToastMessage(message);
    }

    @Override
    public void showDialog(DialogInterface.OnClickListener okClickListener, String okText, String title, String message, boolean isCancelOnOutsideTouch) {

    }

    @Override
    public void showDialog(DialogInterface.OnClickListener okClickListener, String okText, String title, String message, boolean isCancelOnOutsideTouch, boolean isContentHtml) {

    }

    @Override
    public void showDialog(DialogInterface.OnClickListener okClickListener, DialogInterface.OnClickListener cancelListener, String okText, String cancelText, String title, String message, boolean isCancelOnOutsideTouch) {

    }

    @Override
    public void showCustomDialog(DialogInterface.OnClickListener onClickListener, DialogInterface.OnCancelListener onCancelListener, Drawable imgId, String dialogTitle, String dialogText, String buttonText, String cancelButtonText, boolean cancellable, boolean cancelOnOutsideTouch) {

    }

    @Override
    public void showLoading(String loadingText) {
        if (mBaseViewUtility != null) {
            mBaseViewUtility.showLoading(loadingText);
        }
    }

    @Override
    public void hideLoading() {
        if (mBaseViewUtility != null) {
            mBaseViewUtility.hideLoading();
        }
    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void dismissCustomDialog() {

    }

    @Override
    public void requestPermission(String permission) {

    }

    @Override
    public void requestMultiplePermission(String... permission) {

    }

    @Override
    public void showNoNetworkSnackBar(Context context) {

    }

    @Override
    public void showSnackBar(Context context, String message) {

    }

    @Override
    public void showSnackBar(Context context, String message, int duration) {

    }

    @Override
    public void showNoNetworkSnackBar(Context context, ViewGroup snackBarContainerLayout) {

    }

    @Override
    public void hideSnackBar() {

    }
}
