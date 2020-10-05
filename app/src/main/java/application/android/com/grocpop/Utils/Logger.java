package application.android.com.grocpop.Utils;

import android.text.TextUtils;
import android.util.Log;

public class Logger {

    public final static boolean isDebugEnabled = true;

    public static void verbose(String tag, String message) {
        if (isDebugEnabled && !TextUtils.isEmpty(message)) {
            Log.v(tag, message);
        }
    }

    public static void error(String tag, String message) {
        if (isDebugEnabled && !TextUtils.isEmpty(message)) {
            Log.e(tag, message);
        }
    }

    public static void debug(String tag, String message) {
        if (isDebugEnabled && !TextUtils.isEmpty(message)) {
            Log.d(tag, message);
        }
    }

    public static void info(String tag, String message) {
        if (isDebugEnabled && !TextUtils.isEmpty(message)) {
            Log.i(tag, message);
        }
    }

    public static void warn(String tag, String message) {
        if (isDebugEnabled && !TextUtils.isEmpty(message)) {
            Log.w(tag, message);
        }
    }
}
