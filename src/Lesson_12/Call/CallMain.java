package Lesson_12.Call;

public class CallMain {
    public static void main(String[] args) {

        Client client = new Client(5,1,1000);
        client.addSum(20);
        System.out.println(client.isActive());
        System.out.println(client.call(5));
        client.sms(10);
    }
}
