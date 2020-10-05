package application.android.com.grocpop.Utils;

import android.app.Application;

public class App extends Application {

    private static App sInstance;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static App getsInstance() {
        return sInstance;
    }
}
