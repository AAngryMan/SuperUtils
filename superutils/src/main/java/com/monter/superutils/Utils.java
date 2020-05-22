package com.monter.superutils;

public class Utils {
    private static final Utils utils = new Utils();

    public static Utils getInstance(){
        return utils;
    }
    public String getContent(){
        return "hahaha";
    }

}
