package src.proxy;

import java.text.DateFormat;
import java.util.Date;

public class ProxyFightManager extends FightManager {
    private FightManager source;

    public ProxyFightManager(FightManager source) {
        this.source = source;
    }

    public void fightAction(String userName) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance();

        System.out.println("Start at " + dateFormat.format(new Date()));
        source.fightAction(userName);
        System.out.println("End at " + dateFormat.format(new Date()));
    }
}
