package com.example.xuepeng.checkpermissionincode;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by xuepeng on 18/3/22.
 */

public class hello {
    public static final String PERMISSION_SAY_HELLO="com.example.xuepeng.checkpermissionincode.permission.SAY_HELLO";


    public static void sayhello(Context context){
        int CheckResult=context.checkCallingOrSelfPermission(PERMISSION_SAY_HELLO);
        if(CheckResult!= PackageManager.PERMISSION_GRANTED){
            throw new SecurityException("执行sayhello需要com.example.xuepeng.checkpermissionincode.permission.SAY_HELLO权限");
        }
        System.out.println("hello hello");

    }
}
