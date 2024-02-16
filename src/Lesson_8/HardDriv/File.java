package Lesson_8.HardDriv;

public class File {

    String fileName;
    int fileSize;

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
