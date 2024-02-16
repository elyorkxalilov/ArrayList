package Lesson_9.App;

public class App {    // app=ilova

    private final String appName;
    private final int appCapacity;

    public App(String appName, int appCapacity) {
        this.appName = appName;
        this.appCapacity = appCapacity;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppCapacity() {
        return appCapacity;
    }

}
