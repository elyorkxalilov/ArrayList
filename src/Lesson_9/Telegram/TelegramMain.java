package Lesson_9.Telegram;

public class TelegramMain {
    public static void main(String[] args) {

        User user1 = new User("Xalilov","Elyor",22,"+998902899201");
        User user2 = new User("Xalilov1","Elyor1",22,"+998902899200");
        Telegram telegram = new Telegram();
        telegram.createAccount(user1);
        telegram.createAccount(user2);
        telegram.deleteAccount(user2.getPhoneNumber());
    }
}
