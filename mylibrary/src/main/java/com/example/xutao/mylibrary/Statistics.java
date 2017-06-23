package com.example.xutao.mylibrary;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by admin on 2017/6/21.
 */

public class Statistics {

    public static void StartStatistics(Context context) {
        SharedPreferences sharedPreferences = MyStatisticsSharedPreferences.getSharedPreferences(context);
        int xixi = sharedPreferences.getInt("xi", 1);
        //判断是否有网；
        boolean hasNet = NetUtils.hasInternet(context);
        //如果有网 上传数据到服务器，否则不上传;
        if (hasNet) {
            // UploadData();
        }


        Log.i("xi", hasNet + "");
        Log.i("xixi", xixi + "");
        SharedPreferences.Editor editor = MyStatisticsSharedPreferences.getEditor(context);
        editor.putInt("xi", xixi + 1);
        editor.commit();

    }

    public static void UploadData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                httpPost();


                Log.i("ysq", "xxxxxxxxxxxxxx");
            }


        }).start();


    }

    private static void httpPost() {

        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody body = new FormBody.Builder()
                .add("xxxx", "xxx")
                .build();
        Request request = new Request.Builder().post(body).url("").build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
            }
        });
    }
}
