package com.sahurjt.apref;


import android.content.Context;
import android.content.SharedPreferences;

final class PrefBase {


    private static final int SP_MODE = Context.MODE_PRIVATE;
    private static final String EMPTY_STRING = "";
    private Context appContext;
    private String fileName;

    PrefBase(Context appContext, String fileName) {
        this.appContext = appContext;
        this.fileName = fileName;
    }

    private SharedPreferences getPreferences() {
        return appContext.getSharedPreferences(fileName, SP_MODE);
    }

    private SharedPreferences.Editor getPreferenceEditor() {
        return getPreferences().edit();
    }

    String getString(String key) {
        return getPreferences().getString(key, EMPTY_STRING);
    }

    void setString(String key, String value) {
        getPreferenceEditor().putString(key, value).apply();
    }

    //// TODO: create a callback event,which will notify if some data is commited

}
