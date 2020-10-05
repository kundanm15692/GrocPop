package application.android.com.grocpop.Utils;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public interface IBaseView {

    /**
     * General Toast message method
     *
     * @param message
     */
    void showToastMessage(String message);

    /**
     * Method to show dialog with single ok button
     *
     * @param okClickListener
     * @param okText
     * @param title
     * @param message
     * @param isCancelOnOutsideTouch
     */
    void showDialog(DialogInterface.OnClickListener okClickListener, String okText, String title, String message, boolean isCancelOnOutsideTouch);

    /**
     * Method to show dialog with single ok button and HTML content
     *
     * @param okClickListener
     * @param okText
     * @param title
     * @param message
     * @param isCancelOnOutsideTouch
     */
    void showDialog(DialogInterface.OnClickListener okClickListener, String okText, String title, String message, boolean isCancelOnOutsideTouch, boolean isContentHtml);

    /**
     * Method to show dialog with both positive and negative button
     *
     * @param okClickListener        positive button click listener
     * @param cancelListener         Negative button click listener
     * @param okText                 positive button Text
     * @param cancelText             Negative Button Text
     * @param title                  Title
     * @param message                Message to display
     * @param isCancelOnOutsideTouch Boolean to enable or disable dialog dismiss on touching the outside
     */
    void showDialog(DialogInterface.OnClickListener okClickListener, DialogInterface.OnClickListener cancelListener, String okText, String cancelText, String title, String message, boolean isCancelOnOutsideTouch);

    /**
     * Dialog with custom UI
     *
     * @param onClickListener Click listener
     * @param imgId           Drawable Id
     * @param dialogTitle     Title
     * @param dialogText      Display Text
     * @param buttonText      Button Text
     */
    void showCustomDialog(DialogInterface.OnClickListener onClickListener, DialogInterface.OnCancelListener onCancelListener, Drawable imgId, String dialogTitle, String dialogText, String buttonText, String cancelButtonText, boolean cancellable, boolean cancelOnOutsideTouch);

    /**
     * Method to show loading dialog
     *
     * @param loadingText
     */
    void showLoading(String loadingText);

    /**
     * hide the loading dialog
     */
    void hideLoading();

    /**
     * Dismiss dialog
     */
    void dismissDialog();

    void dismissCustomDialog();


    /**
     * Called the when the required permission is not enabled
     *
     * @param permission
     */
    void requestPermission(String permission);

    /**
     * Called the when the required permissions are not enabled
     *
     * @param permission
     */
    void requestMultiplePermission(String... permission);

    Context getContext();

    /**
     * Method to show No Network Snackbar
     *
     * @param context
     */
    void showNoNetworkSnackBar(Context context);

    /**
     * Method to show SnackBar
     *
     * @param context
     */
    void showSnackBar(Context context, String message);

    /**
     * Method to show SnackBar
     *
     * @param context
     */
    void showSnackBar(Context context, String message, int duration);

    /**
     * Method to show Snackbar
     *
     * @param context
     * @param snackBarContainerLayout
     */
    void showNoNetworkSnackBar(Context context, ViewGroup snackBarContainerLayout);

    /**
     * To hide snack bar
     */
    void hideSnackBar();

}
