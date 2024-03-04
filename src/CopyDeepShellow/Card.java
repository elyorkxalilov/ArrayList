package CopyDeepShellow;

public class Card implements Cloneable {
    private Cards cardName;
    private String cardNumber;

    public Card(Cards cardName, String cardNumber) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardName=" + cardName +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Cards getCardName() {
        return cardName;
    }

    public void setCardName(Cards cardName) {
        this.cardName = cardName;
    }
}
