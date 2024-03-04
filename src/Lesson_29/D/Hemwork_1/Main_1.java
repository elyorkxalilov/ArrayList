package Lesson_29.D.Hemwork_1;

public class Main_1 {
    public static void main(String[] args) {

        Chef salad = new SaladMaker();
        Chef cook = new TheCook();

        CaseManager guard = new Guard();
        CaseManager storekeeper = new Storekeeper();
        CaseManager waiter = new TheWaiter();

        OfficeChief officeChief1 = new OfficeChief(salad, waiter);
        officeChief1.startOfficeChief();
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

        OfficeChief officeChief2 = new OfficeChief(cook, storekeeper);
        officeChief2.startOfficeChief();
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

        OfficeChief officeChief3 = new OfficeChief(cook, guard);
        officeChief3.startOfficeChief();
    }
}
