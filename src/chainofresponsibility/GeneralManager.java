package src.chainofresponsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void apply(ApplyRequest request) {
        if (request.getRequestType().equals("DayOff")) {
            System.out.println(request.getRequestType() + ":" + request.getRequestContent());
            System.out.println(this.name + " apply " + request.getRequestCount() + " days");
        } else {
            if (request.getRequestCount() <= 1000) {
                System.out.println(request.getRequestType() + ":" + request.getRequestContent());
                System.out.println(this.name + " apply $" + request.getRequestCount());
            } else {
                System.out.println(request.getRequestType() + ":" + request.getRequestContent());
                System.out.println(this.name + " doesn't apply $" + request.getRequestCount());
            }
        }
    }
}
