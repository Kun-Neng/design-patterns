package src.proxy;

public class AOPTest {
    public static void main(String[] args) {
        System.out.println("Without Proxy:");
        FightManager fightManager = new FightManager();
        fightManager.fightAction("Adventure Kun");

        System.out.println("With Proxy:");
        ProxyFightManager proxyFightManager = new ProxyFightManager(new FightManager());
        proxyFightManager.fightAction("Adventure Kun");
    }
}
