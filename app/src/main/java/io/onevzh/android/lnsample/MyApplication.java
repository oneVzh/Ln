package io.onevzh.android.lnsample;

import android.app.Application;
import android.content.Context;

import io.onevzh.android.ln.Ln;

/**
 * Created by onevzh on 2017/12/24.
 */

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Ln.init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Ln.d("a%s", "b");
    }
}
