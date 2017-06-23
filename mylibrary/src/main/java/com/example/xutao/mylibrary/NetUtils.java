package com.example.xutao.mylibrary;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by admin on 2017/6/21.
 */

public class NetUtils {

    public static boolean hasInternet(Context context) {

        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
//        if (info == null || !info.isConnected()) {
//            return false;
//        }
//        if (info.isRoaming()) {
//            return true;
//        }
        if (info != null) {
            if (info.isAvailable() && info != null) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
