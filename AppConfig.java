public class AppConfig {
    public static void main(String[] args) {
        System.out.println("Application started.");
        System.out.println("Version: 1.1");
        System.out.println("Environment: Production");

        checkSecurity();
    }

    private static void checkSecurity() {
        System.out.println("Security checks passed.");
    }
}
