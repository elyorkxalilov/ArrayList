package Lesson_10.NotePad;

import java.util.Arrays;

public class NotePed {      // noteped=blaknot;  note=eslatma
    // node=tugun;
    private Pen pen;
    private String note;
    private NotePed[] notes;

    private int noteIndex = 0;


    public NotePed(Pen pen, String note) {
        this.pen = pen;
        this.note = note;
    }

    public NotePed(int size) {
        notes = new NotePed[size];
    }


    public void addNote(Pen pen, String node) {
        if (notes[notes.length - 1] != null) {
            System.out.println("Note pad to`lib qolgan!");
            return;
        }
        notes[noteIndex++] = new NotePed(pen, note);
    }

    public void editNote(Pen pen, String note) {
        for (NotePed notePed : notes) {
            if (notePed.getNote().equals(note)) {
                notePed.setPen(pen);
            }
        }
    }

    public void editNote(String oldNote, String newNote) {
        for (NotePed notePed : notes) {
            if (notePed.getNote().equals(oldNote)) {
                notePed.setNote(newNote);
            }
        }
    }

    public void showInfo() {
        System.out.println(Arrays.toString(notes));
    }

    public void removeNote(String note) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getNote().equals(note)) {
                notes[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "NotePed{" +
                "pen=" + pen +
                ", note='" + note + '\'' +
                '}';
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
