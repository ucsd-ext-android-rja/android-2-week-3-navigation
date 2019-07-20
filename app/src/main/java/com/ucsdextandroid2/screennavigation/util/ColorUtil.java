package com.ucsdextandroid2.screennavigation.util;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by rjaylward on 2019-07-19
 */
public class ColorUtil {

    public static int getRandomColor() {
        Random random = new Random();
        return Color.rgb(
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255)
        );
    }

}
