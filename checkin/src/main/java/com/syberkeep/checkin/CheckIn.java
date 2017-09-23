package com.syberkeep.checkin;

import android.content.Context;
import android.widget.Toast;

public class CheckIn {

    public static void shortToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
