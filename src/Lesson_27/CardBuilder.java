package Lesson_27;

public interface CardBuilder {
    enum CardTupe{
        HUMO, UZKARD, VISA, MASTER
    }
    void setCardTupe(CardTupe cardTupe);
    void setCardNumber(String number);
    void setExpireDate(String expireDate);
    void setOwnerName(String ownerName);
}
