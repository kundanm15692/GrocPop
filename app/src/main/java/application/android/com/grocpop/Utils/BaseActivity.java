package application.android.com.grocpop.Utils;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements IBaseView{

    BaseViewUtility mBaseViewUtility;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBaseViewUtility = new BaseViewUtility(this);

    }

    public void SetTitle(String title){
        getSupportActionBar().setTitle(title);
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
    public Context getContext() {
        return null;
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
