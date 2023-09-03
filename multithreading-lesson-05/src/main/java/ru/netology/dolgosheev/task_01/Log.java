package ru.netology.dolgosheev.task_01;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Log {
    public static Log INSTANCE = null;

    private Map<String, Integer> freqs = new HashMap<>();

    private Log() {}

    public static Log getInstance() {
        if (INSTANCE == null) {
            synchronized (Log.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Log();
                }
            }
        }
        return INSTANCE;
    }

    public void log(String level, String msg) {
        if (!freqs.containsKey(level)) {
            freqs.put(level, 0);
        }
        freqs.put(level, freqs.get(level) + 1);
        System.out.println("[" + level + "#" + freqs.get(level) + "] " + LocalDateTime.now() + " === " + msg);
    }
}
