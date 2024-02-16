package Lesson_11.Computer;

public class MSI extends Computer {
    public MSI(String processesModel, int diskSize) {
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
