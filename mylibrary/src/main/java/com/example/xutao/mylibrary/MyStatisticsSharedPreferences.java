package com.example.xutao.mylibrary;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by admin on 2017/6/21.
 */

public class MyStatisticsSharedPreferences {

    public static SharedPreferences.Editor getEditor(Context context){


        SharedPreferences  sharedPreferences = context.getSharedPreferences("main", Context.MODE_PRIVATE);

        //获得editor
        SharedPreferences.Editor edit = sharedPreferences.edit();

        return edit;
    }
    public static SharedPreferences getSharedPreferences(Context context){

        SharedPreferences  sharedPreferences = context.getSharedPreferences("main", Context.MODE_PRIVATE);
        return  sharedPreferences;
    }
}
