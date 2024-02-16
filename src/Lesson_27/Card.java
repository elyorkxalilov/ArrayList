package Lesson_27;

public class Card {
    private final CardBuilder.CardTupe cardTupe;
    private final String cardNumber;
    private final String cardExpireDate;
    private final String cardOwnerName;

    public Card(CardBuilder.CardTupe cardTupe, String cardNumber, String cardExpireDate, String cardOwnerName) {
        this.cardTupe = cardTupe;
        this.cardNumber = cardNumber;
        this.cardExpireDate = cardExpireDate;
        this.cardOwnerName = cardOwnerName;
    }

    public CardBuilder.CardTupe getCardTupe() {
        return cardTupe;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpireDate() {
        return cardExpireDate;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardTupe=" + cardTupe +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardExpireDate='" + cardExpireDate + '\'' +
                ", cardOwnerName='" + cardOwnerName + '\'' +
                '}';
    }
}
