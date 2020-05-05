package com.bunny.instagramclone.Utils;

/**
 * Created by BuNnY on 27-03-2018.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(" ",".");
    }

    public static String condenseUsername(String username){
        return username.replace("."," ");
    }
}
