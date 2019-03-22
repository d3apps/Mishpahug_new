package com.dennisdavydov.mishpahug.singletons;

import android.content.Context;
import android.graphics.Typeface;

public class SingletonFonts {
    private static Typeface font1;
    private static Typeface font2;
    private static Typeface font3;
    private static Typeface font4;
    private static Typeface font5;

    public Typeface getFont1() {
        return font1;
    }
    public Typeface getFont2() {
        return font2;
    }
    public Typeface getFont3() {
        return font3;
    }

    public Typeface getFont4() {
        return font4;
    }
    public Typeface getFont5() {
        return font5;
    }


    private static void setFont1(Typeface font1) {
        SingletonFonts.font1 = font1;
    }
    private static void setFont2(Typeface font2) {
        SingletonFonts.font2 = font2;
    }
    private static void setFont3(Typeface font3) {
        SingletonFonts.font3 = font3;
    }
    private static void setFont4(Typeface font4) {
        SingletonFonts.font4 = font4;
    }
    private static void setFont5(Typeface font5) {
        SingletonFonts.font5 = font5;
    }
    private static volatile SingletonFonts instance;
    private SingletonFonts() {}

    public static SingletonFonts getInstance(Context activity) {
        SingletonFonts localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonFonts.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonFonts();
                }
            }
            setFont1(Typeface.createFromAsset(activity.getAssets(),
                    "fonts/raleway_extralight.ttf"));
            setFont2(Typeface.createFromAsset(activity.getAssets(),
                    "fonts/raleway_light.ttf"));
            setFont3(Typeface.createFromAsset(activity.getAssets(),
                    "fonts/raleway_medium.ttf"));
            setFont4(Typeface.createFromAsset(activity.getAssets(),
                    "fonts/raleway_regular.ttf"));
            setFont5(Typeface.createFromAsset(activity.getAssets(),
                    "fonts/raleway_semibold.ttf"));
        }
        return localInstance;
    }
}
