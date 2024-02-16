package Lesson_9.Telegram;

import java.util.Scanner;

public class Telegram {
    private User[] users = new User[]{};

    private boolean isUserExist(String phoneNumber) {
        boolean isUserExist = false;
        for (User user : users) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                isUserExist = true;
                break;
            }
        }
        return isUserExist;
    }
    public void createAccount(User user) {
        boolean isUserExist = isUserExist(user.getPhoneNumber());
        if (isUserExist) {
            System.out.println("Bunday user mavjud");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Codni kiriting");
            String code = scanner.nextLine();
            boolean checkSMSCode = checkSMSCode(code, user.getPhoneNumber());
            if (checkSMSCode) {
                User[] newUsers = new User[users.length + 1];
                int index = 0;
                for (User user1 : users) {
                    newUsers[index++] = user1;
                }
                users = new User[]{user};
                users = newUsers;
                System.out.println("User count = " + getUserCount());
            }
        }
    }

    private boolean checkSMSCode(String code, String phoneNumber) {
        if (code.equals(phoneNumber)) {
            System.out.println("User yaratildi");
            return true;
        } else {
            System.out.println("User ysratilmadi");
            return false;
        }
    }

    public int getUserCount() {
        return users.length;
    }

    public void deleteAccount(String phoneNumber) {
        boolean isUserExist = isUserExist(phoneNumber);
        System.out.println(isUserExist);
        if (isUserExist) {
            User[] newUsers = new User[users.length - 1];
            int index = 0;
            for (User user1 : users) {
                if (user1.getPhoneNumber().equals(phoneNumber)) {
                    continue;
                }
                newUsers[index++] = user1;
            }
            users = newUsers;
            System.out.println("User o`chirildi. User count = " + getUserCount());
        } else {
            System.out.println("User mavjud emas");
        }
    }
}
