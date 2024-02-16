import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/**
Lambda expressions
 *
 *  lambda expression - lambda
 *
 *  lambdalarni - anonymous function lar deya olamiz y'ani lambdalar - aynan funksiyani nomiga
 *  bog'lanib qolmagan lekin variablega bog'langan desak bo'ladi
 *
 *  lambda declare general form usually - (parameters) -> { body };
 *
 *  1) bu yerda -> dan oldingi qism parametrlar ya'ni argumentlar hisoblanadi xuddiki methodni invoke
 *  qilganimizda berib yuboriladigan argumentlarga o'xshagan.
 *
 *  2) bu yerda -> dan keyingi qism esa qiymatni qaytarish mumkin bo'lgan body hisoblanadi. Ya'ni bu {} body
 *  odatda ko'p qatorli lambda ifodalari uchun foydalaniladi.
 *
 *  Ba'zan lambdalarda parametrlar(argumentlar) yoki qaytariladigan qiymatlar(return values) yoki hatto ikkalasi ham
 *  bo'lmasligi mumkin.
 *  Lambda qaytariladigan qiymatga ega bo'lmasa ham, u ba'zi foydali harakatlarni(action larni)
 *  bajaradigan tanaga ega (masalan, biror narsani chop etadi yoki saqlaydi).
 *
 *  Lambda ifodasi dataType ega hisoblanadi.
 *
 *  O'zimiz custom lambda dan foydalanish uchun interfacedan foydalangan holatda qilsak bo'ladi inline example_1 package
 *
 *  Bilamizki Javani o'zinining standart kutubxonalarining ichida ko'plab turlar mavjud
 *  Biz uchun lambdadan qulay foydalanishligimiz un bir nechta turlar mavjud qilib qoyilingan
 *  Masalan Function, BiFunction - ikkalasi ham java.util.function packageda hisoblanadi
 */

        /**
         Method reference
 *
 * Ma'lumki lambda expression ma'lumotni qayta ishlab natijani qaytarib yuborish imkoniga ega ekan. Lamda
 * ifodasi standart methodlarga mos kelsa lambda ifodalaridan ko'ra biz method referencelardan foydalanganimiz juda samarali
 * bo'ladi ya'ni codeni qisqaroq, tushunarliroq, testdan o'tishini osonroq qilishga yordami juda katta hisoblanadi.
 *
 * Lambda expression va method referencelar dan foydalanish dasturchi uchun readable code yozish,
 * qisqa va tushunarli code yozish imkonini beradi.
 *
 * Method referencelar orqali codeni toza yozish mumkin ya'ni clean code ga erishishning 1 yo'li hisoblanadi
 *
 * Method reference deganda biz uning nomi orqali ma'lum bir methodga murojaat qiladigan va bizga kerak
 * bo'lganda uni chaqirish(call qilish) mumkin bo'lgan funktsiyani nazarda tutamiz. Syntax quyidagicha
 *
 *             objectOrClass :: methodName
 *
 * bu erda objectOrClass class nomi yoki classning alohida instance bo'lishi mumkin.
 *
 * Mana bir misol, biz Integer sinfining max standart statik methodi uchun reference yaratamiz.
 *
 *  BiFunction<Integer, Integer, Integer> max = Integer::max;
 *  Bu erda Integer::max statik methodga reference hisoblanadi.
 *
 *  Bu kod to'g'ri ishlaydi, chunki int max(int a, int b) methodining BiFunction<Integer, Integer, Integer> ning
 *  apply methodiga mos keladi: ikkalasi ham ikkita butun son argumentini olishni va butun son qiymatini qaytarishni o'zida
 *  joriy qilgan.
 *
 *  Method referencelar turlari
 *
 *  Ham statik, ham statik bo'lmagan methodlarga method referencelarini yozish mumkin.
 *
 *  Umuman olganda, to'rt xil method referencelar mavjud:
 *   1) reference to a static method (static method un reference)
 *   2) reference to an instance method of an existing object (xotirada mavjud obyektning methodi un reference)
 *   3) reference to an instance method of an object of a particular type (muayyan turdagi ob'ektning methodi un reference);
 *   4) reference to a constructor
 *
 *   examples -> inline types package
 *
 *   Demak lambda expressionlar va method referencelar doimo birga yuriydi.
         */

        char[] chars = new char[]{'H','e','l','l','o'};
        char[] mass = new char[]{'e','l','l'};
        char[] mass1 = new char[]{'e','l','o'};
        first:
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if ((int) chars[i] == (int) mass[j]) {
                    break first;
                } else {
                    j = 0;
                }
                if (j == mass.length - 1) {
                    System.out.println("1");
                }
            }
        }
        System.out.println("0");
    }
}