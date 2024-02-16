package Lesson_11.Text;

public class Text {
    private Pen pen;

    StringBuilder tex = new StringBuilder();
    public Text(Pen pen) {
        this.pen = pen;
    }
    
    void add(String str){
        tex.append(str);
        tex.append(" ");
    }
    void show(){
        System.out.println(tex);
    }
    int count(){
       String[] sr = tex.toString().split(" ");
       return sr.length;
    }
    void clear(){
        tex.setLength(0);
    }
    public boolean removeLine(String s){
        String s1 = tex.toString().replaceFirst(s,"");
        clear();
        tex.append(s1);
        return true;
    }
}
