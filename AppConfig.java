public class AppConfig {
    public static void main(String[] args) {
        System.out.println("Application started.");
        System.out.println("Version: 1.0");
        System.out.println("Environment: Development");

        enableDebugMode();
    }

    private static void enableDebugMode() {
        System.out.println("Debug mode enabled.");
    }
}
