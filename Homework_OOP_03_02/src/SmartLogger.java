import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int index = 1;
    private String text = "INFO";

    @Override
    public void log(String msg) {
        if (msg.toLowerCase().contains("error")) {
            text = "ERROR";
        }
        System.out.println(text + "#" + index + " [" + LocalDateTime.now() + "] " + msg);
        index += 1;
        text = "INFO";
    }
}
