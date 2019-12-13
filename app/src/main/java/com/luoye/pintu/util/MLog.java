package com.luoye.pintu.util;

import android.util.Log;

public class MLog {
    private static  final  String PROCESS = "Puzzle";
    private static boolean DEBUG = true;
    public static final  void d(String tag,String log){
        if(DEBUG){
            Log.d(PROCESS+"_"+tag,log);
        }
    }

    public static final  void i(String tag,String log){
        if(DEBUG){
            Log.i(PROCESS+"_"+tag,log);
        }
    }

    public static final  void w(String tag,String log){
        if(DEBUG){
            Log.w(PROCESS+"_"+tag,log);
        }
    }

    public static final  void e(String tag,String log){
        if(DEBUG){
            Log.e(PROCESS+"_"+tag,log);
        }
    }
}