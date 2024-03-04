package CopyDeepShellow;

public class ClonMain {
    public static void main(String[] args) throws CloneNotSupportedException {


        Card card = new Card(Cards.ATTO,"32543");
        User user = new User(card,"Elyor", 23);
        User user1 = (User) user.clone();
        user1.setUserName("Islom oka");
        user1.getCard().setCardNumber("89797");
        System.out.println(user);
        System.out.println(user1);
    }
}
  // sinchronayzd in practayz java