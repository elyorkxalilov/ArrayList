package Lesson_9.App;

public class Device {       // Device=qurulma

    App app;
    private int deviceCapacity;
    Device[] devices = new Device[]{};

    public Device(App app, int deviceCapacity) {
        this.app = app;
        this.deviceCapacity = deviceCapacity;
    }

    private boolean checkThere(String appName) {    // dastur bor yoki yo`qlikka tekshirish
        for (Device device : devices) {
            if (device.equals(appName)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkMemory(int appCapacity) {  // xotirani tekshirish
        if (getDeviceCapacity() >= appCapacity) {
            return true;
        }
        return false;
    }

    public boolean install(App app) {
        if (checkThere(app.getAppName()) && checkMemory(app.getAppCapacity())) {
            int index1 = 0;
            Device[] devices1 = new Device[devices.length + 1];
            for (Device device : devices) {
                devices1[index1++] = device;
            }
//            devices = new Device[]{app};
            devices = devices1;
            setDeviceCapacity(getDeviceCapacity());
            System.out.println("Dastur qurilmaga qo`shildi!");
        }
        System.out.println("Dastur qurilmaga qo`shilmadi!");
        return false;
    }

    public void showApps() {
        for (int i = 0; i < devices.length; i++) {
            System.out.println("Qurilmada " + app.getAppName() + " nomli " + app.getAppCapacity() + " sig`imli dastur bor!");
        }
    }

    public boolean uninstall(String appName) {
        if (checkThere(appName)) {
            Device[] devices2 = new Device[devices.length - 1];
            int index2 = 0;
            for (int i = 0; i < devices.length; i++) {
                if (devices[i].equals(appName)) {
                    continue;
                }
                devices2[index2++] = devices[i];
            }
            devices = devices2;
            setDeviceCapacity(-1 * app.getAppCapacity());
            System.out.println("Dastur qurilmadan o`chirildi!");
            return true;
        }
        System.out.println("Dastur qurulmada topilmadi!");
        return false;
    }

    public void run(App app){
        System.out.println("Dastur nomi-> " + app.getAppName() + " va hajmi-> " + app.getAppCapacity());
    }
    public int info(){
        return devices.length;
    }
    public int getDeviceCapacity() {
        return deviceCapacity;

    }

    public void setDeviceCapacity(int deviceCapacity) {
        this.deviceCapacity -= deviceCapacity;
    }
}
