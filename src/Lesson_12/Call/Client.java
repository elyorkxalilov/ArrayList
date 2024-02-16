package Lesson_12.Call;

public class Client {

    private int callPrice;  // qo`ng`iroq narxi
    private int smsPrice;   // sms narxi
    private int haveMoney;   // telda bor pul

    public Client(int callPrice, int smsPrice, int haveMoney) {
        this.callPrice = callPrice;
        this.smsPrice = smsPrice;
        this.haveMoney = haveMoney;
    }

    public void addSum(int a) {
        setHaveMoney(a);
        System.out.println("Pul qo`shildi!");
    }

    public boolean isActive() {
        int countCall;
        int countSms;
        if (getCallPrice() < getHaveMoney() || getSmsPrice() < getHaveMoney()) {
            countCall = getHaveMoney() / getCallPrice();
            countSms = getHaveMoney() / getSmsPrice();
            System.out.println("Sizda " + countCall + " marta qo`ng`iroq qilish yoki " + countSms + " marta sms yozish imkoniyati bor");
            return true;
        }
        return false;
    }

    public boolean call(int time) {
        if (getHaveMoney() >= getCallPrice() * time) {
            return true;
        }
        return false;
    }

    public boolean sms(int smsCount) {
        if (getCallPrice() >= getSmsPrice() * smsCount) {
            return true;
        }
        return false;
    }

    public int getCallPrice() {
        return callPrice;
    }

    public int getSmsPrice() {
        return smsPrice;
    }

    public int getHaveMoney() {
        return haveMoney;
    }

    public void setHaveMoney(int haveMoney) {
        this.haveMoney += haveMoney;
    }
}
