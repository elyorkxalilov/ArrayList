package CopyDeepShellow;

public class User implements Cloneable {

    private String userName;
    private int age;
    private Card card;

    public User(Card card, String userName, int age) {
        this.userName = userName;
        this.age = age;
        this.card = card;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.setCard((Card) card.clone());
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", card=" + card +
                '}';
    }
}
