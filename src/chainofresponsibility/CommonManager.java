package src.chainofresponsibility;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void apply(ApplyRequest request) {
        if (request.getRequestType().equals("DayOff") && request.getRequestCount() <= 2) {
            System.out.println(request.getRequestType() + ":" + request.getRequestContent());
            System.out.println(this.name + " apply " + request.getRequestCount() + " days");
        } else {
            if (this.superior != null) {
                this.superior.apply(request);
            }
        }
    }
}
