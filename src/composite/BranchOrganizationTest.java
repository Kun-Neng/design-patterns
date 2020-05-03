package src.composite;

public class BranchOrganizationTest {
    public static void main(String[] args) {
        AbstractAssociation root = new Association("Adventure Headquarter");
        root.add(new HumanResource("HQ - human resource"));
        root.add(new ServiceDepartment("HQ - service department"));

        AbstractAssociation mars = new Association("Mars Association");
        mars.add(new HumanResource("Mars - human resource"));
        mars.add(new ServiceDepartment("Mars - service department"));
        root.add(mars);

        AbstractAssociation saturn = new Association("Saturn Association");
        saturn.add(new HumanResource("Saturn - human resource"));
        saturn.add(new ServiceDepartment("Saturn - service department"));
        root.add(saturn);

        AbstractAssociation saturnB1 = new Association("Saturn branch 1");
        saturnB1.add(new HumanResource("Saturn branch 1 - human resource"));
        saturnB1.add(new ServiceDepartment("Saturn branch 1 - service department"));
        saturn.add(saturnB1);

        AbstractAssociation saturnB2 = new Association("Saturn branch 2");
        saturnB2.add(new HumanResource("Saturn branch 2 - human resource"));
        saturn.add(saturnB2);

        System.out.println("Organizations:");
        root.display(1);

        System.out.println("Duties:");
        root.lineOfDuty();
    }
}
