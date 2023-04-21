public class Main {
    public static void main(String[] args) throws Exception {
        SimpleLogger simpleLogger = new SimpleLogger();
        simpleLogger.log("Hello, world!");
        Thread.sleep(1000);

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("Hello, world!");
        Thread.sleep(1000);
        smartLogger.log("Hello, world!");
        Thread.sleep(1000);
        smartLogger.log("Oh, there is an error in your text!");
        Thread.sleep(1000);
        smartLogger.log("Hello, world!");
    }
}
