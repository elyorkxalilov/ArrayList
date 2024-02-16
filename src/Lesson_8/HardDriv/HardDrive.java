package Lesson_8.HardDriv;

public class HardDrive extends File {

    private int maxSize;
    int son;
    int count = 0;
    File[] files = new File[100];

    public HardDrive(String fileName, int fileSize, int maxSize) {
        super(fileName, fileSize);
        this.maxSize = maxSize;
        son = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void write(File file) {
        if (getMaxSize() > 0 && getMaxSize() >= getFileSize()){
            files[count++] = file;
            setMaxSize(getMaxSize() - file.getFileSize());
        }
    }

    void remove(int a) {
        setMaxSize(getMaxSize() + a);
    }

    void clear() {
        setMaxSize(son);
    }

    public boolean isEmpty() {
        return son == getMaxSize();
    }

    public boolean isFull() {
        return getMaxSize() == 0;
    }

    public int getUsebSapce() {
        return son - getMaxSize();
    }

    public int getFreeSapce() {
        return getMaxSize();
    }
}
