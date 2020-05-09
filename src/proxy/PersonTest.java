package src.proxy;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Without Proxy:");
        Person realPerson = new PersonBean();
        realPerson.setName("realPerson");
        realPerson.setLikeCount(10);
        System.out.println(realPerson.getName() + " got like count " + realPerson.getLikeCount());

        System.out.println("With Proxy:");
        ProxyPersonBean proxyPerson = new ProxyPersonBean(new PersonBean());
        proxyPerson.setName("proxyPerson");
        proxyPerson.setLikeCount(9999);
        System.out.println(proxyPerson.getName() + " got like count " + proxyPerson.getLikeCount());
    }
}
