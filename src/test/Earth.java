package test;

public class Earth {
    private static Earth earthInstance = new Earth();

    private Earth() {
    }

    public static Earth getEarthInstance() {
        return earthInstance;
    }

    public void hello() {
        System.out.println("hello");
    }
}
