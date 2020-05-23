package src.chainofresponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Manager pm = new CommonManager("PM");
        Manager mm = new MajorManager("MM");
        Manager gm = new GeneralManager("GM");

        pm.setSuperior(mm);
        mm.setSuperior(gm);

        ApplyRequest request = new ApplyRequest();
        request.setRequestType("DayOff");
        request.setRequestContent("A person take a dayoff");
        request.setRequestCount(2);
        pm.apply(request);

        request.setRequestCount(4);
        pm.apply(request);

        request.setRequestType("Salary");
        request.setRequestContent("A person asks for money");
        request.setRequestCount(2000);
        pm.apply(request);

        request.setRequestCount(900);
        pm.apply(request);
    }
}
