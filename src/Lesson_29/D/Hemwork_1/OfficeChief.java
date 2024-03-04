package Lesson_29.D.Hemwork_1;

public class OfficeChief {

    private Chef chef;
    private CaseManager caseManager;

    public OfficeChief(Chef chef, CaseManager caseManager) {
        this.chef = chef;
        this.caseManager = caseManager;
    }
    public void startOfficeChief(){
        chef.startChef();
        caseManager.startCaseManager();
    }
}
