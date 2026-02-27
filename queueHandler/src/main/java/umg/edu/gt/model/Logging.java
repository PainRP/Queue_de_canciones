package umg.edu.gt.model;

public class Logging {
    public static void log(String message) {
        System.out.println("[log] " + message);
    }

    public static void error(String message) {
        System.out.println("[error] " + message);
    }
}
