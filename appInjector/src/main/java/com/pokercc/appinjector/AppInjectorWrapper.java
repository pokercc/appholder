package com.pokercc.appinjector;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Cisco on 2017/11/21.
 */

public class AppInjectorWrapper implements IAppEntry {

    private final OnAppCreateMethod mIAppEntry;

    public AppInjectorWrapper(OnAppCreateMethod mIAppEntry) {
        this.mIAppEntry = mIAppEntry;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppInjectorWrapper) {
            return TextUtils.equals(((AppInjectorWrapper) obj).getName(), this.getName());
        } else {
            return super.equals(obj);
        }
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    public String getName() {
        return mIAppEntry.toString();
    }

    @Override
    public void onAppCreate(Application app) {
        long beginTime = System.currentTimeMillis();
        this.mIAppEntry.onAppCreate(app);
        long endTime = System.currentTimeMillis();
        Log.i("AppInjector", "start " + mIAppEntry.toString() + " +" + (endTime - beginTime) + "ms");
    }

}