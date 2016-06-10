package com.teamd.doctorsaab.doctorsaab.helpers;

import com.teamd.doctorsaab.doctorsaab.R;

public class Random {

    private static final java.util.Random RANDOM = new java.util.Random();

//    public static final String[] sTankStrings = {
//            "Hobbies", "Skills", "Favourites", "Status", "Nature"
//    };

    public static int getRandomTankDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.a;
            case 1:
                return R.drawable.b;
            case 2:
                return R.drawable.c;
            case 3:
                return R.drawable.d;
            case 4:
                return R.drawable.e;
        }
    }


}
