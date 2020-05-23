package src.chainofresponsibility;

public class MajorManager extends Manager {
    public MajorManager(String name) {
        super(name);
    }

    @Override
    public void apply(ApplyRequest request) {
        if (request.getRequestType().equals("DayOff") && request.getRequestCount() <= 5) {
            System.out.println(request.getRequestType() + ":" + request.getRequestContent());
            System.out.println(this.name + " apply " + request.getRequestCount() + " days");
        } else {
            if (this.superior != null) {
                this.superior.apply(request);
            }
        }
    }
}
