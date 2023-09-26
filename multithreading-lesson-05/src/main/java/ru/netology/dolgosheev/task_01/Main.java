package ru.netology.dolgosheev.task_01;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Log log = new Log();
        Log.getInstance();
        Log.INSTANCE.log("INFO", "Hello");
        Log.INSTANCE.log("ERROR", "Error");
        Log.INSTANCE.log("INFO", "Bye");
    }
}