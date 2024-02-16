package Lesson_11.Computer;

public class Acer extends Computer{
    public Acer(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    public void showInfo() {
        System.out.println(getProcessesModel() + " nomli " + getDiskSize() + " Gb");
    }

    @Override
    public String getProcessesModel() {
        return super.getProcessesModel();
    }

    @Override
    public int getDiskSize() {
        return super.getDiskSize();
    }
}
