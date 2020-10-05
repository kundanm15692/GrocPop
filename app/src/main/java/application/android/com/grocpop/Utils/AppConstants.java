package application.android.com.grocpop.Utils;

public class AppConstants {

    public static String Add_FRAGMENT = "addFragment";
    public static String REPLACE_FRAGMENT = "replaceFragment";

    public static class Action {

        public static String VALIDATE_USER = "validateUser"; // validateUser
        public static String VALIDATE_OTP = "validateOTP";
        public static String ITEM_LIST = "getItemList";
        public static String ADD_ADDRESS = "AddAddress";
        public static String GET_MY_ADDRESS = "getMyAddress";
        public static String CONFIRM_ORDER = "confirmOrder";
        public static String GET_MY_ORDER = "getMyOrder";
        public static String ADD_TO_CART = "addToCart";
        public static String GET_MY_CART = "getCartItem";
        public static String GET_PAYMENT_CHECKSUM = "getPaymentCheckSum";

    }

    public static class SHARED_PREF {
        public static String USER_ID = "userId";
        public static String FULL_NAME = "fullname";
        public static String SELECTED_ADDRESS = "SelectedAddress";

    }

    public static class CART_ACTION {
        public static String ADD_ITEM = "Add";
        public static String REMOVE_ITEM = "Remove";

    }

    public static class GOOGLE_LOCATION{

        public static final String GOOGLE_KEY = "AIzaSyAEU370LbU5yE64m6aNKrnw2zkzzWpj9mA";
        //public static final String GOOGLE_KEY = "AIzaSyAwdggjC0weZWgSHFqOpmF8ym7HHR9Pu3w";
        public static final String CHANNEL_ID = "my_channel_01";
        public static final String CHANNEL_NAME = "Shofer Notification";
        public static final String CHANNEL_DESCRIPTION = "www.shofer.co.in";
        public static final String DEVICE_TYPE = "android";
        public static final int LOCATION_REQUEST = 1000;
        public static final int GPS_REQUEST = 1001;
    }

}
