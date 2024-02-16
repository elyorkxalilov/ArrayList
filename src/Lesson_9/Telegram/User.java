package Lesson_9.Telegram;

public class User {
    private final String listName;
    private final String firstName;
    private final int age;
    private final String phoneNumber;

    public User(String listName, String firstName , int age, String phoneNumber) {
        this.listName = listName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getListName() {
        return listName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
