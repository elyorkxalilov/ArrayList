package casting;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Parent parent= new Parent();


        Child child=new Child();


        Function<Object, Object> function = new Function<>() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        Function<String,Child> dd= s -> null;




        showinfo();




    }

    public  static   void showinfo(){
        System.out.println("salom");
    }
}
