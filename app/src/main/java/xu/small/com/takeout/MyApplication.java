package xu.small.com.takeout;

import android.app.Application;
import android.content.Context;

/**
 * author: senseLo
 * date: 2018/3/13
 */

public class MyApplication extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
