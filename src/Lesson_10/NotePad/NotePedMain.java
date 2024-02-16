package Lesson_10.NotePad;

public class NotePedMain {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Qizil");
        Pen pen2 = new Pen("Sariq");
        Pen pen3 = new Pen("Yashil");
        NotePed notePed = new NotePed(3);
        String note1 = "Elyor";
        notePed.addNote(pen1, note1);
        notePed.addNote(pen2, "Sherzod");
        notePed.addNote(pen3, "Umid");
        notePed.addNote(new Pen("bnascdfb"), "ddfasd");
        notePed.showInfo();

        notePed.editNote(new Pen("SHDBHSD"), "Usmon");
        notePed.showInfo();

        notePed.editNote("Umid", "Murod");
        notePed.showInfo();

        notePed.removeNote("Murod");
        System.out.println();
        notePed.showInfo();
    }
}
