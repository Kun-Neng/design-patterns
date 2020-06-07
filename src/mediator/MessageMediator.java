package src.mediator;

import java.util.ArrayList;
import java.util.List;

public class MessageMediator implements Mediator {
    private static List<VIPUser> vipUserList = new ArrayList<>();
    private static List<CommonUser> userList = new ArrayList<>();

    public static void joinChat(User user) {
        if (user.getClass().getSimpleName().equals("VIPUser")) {
            vipUserList.add((VIPUser) user);
        } else if (user.getClass().getSimpleName().equals("CommonUser")) {
            userList.add((CommonUser) user);
        }
    }
    
    @Override
    public void send(String message, String from, User to) {
        for (User user : vipUserList) {
            if (user.getName().equals(from)) {
                System.out.println(from + "->" + to.getName() + ":" + message);
            }
        }

        for (User user : userList) {
            if (user.getName().equals(from)) {
                System.out.println(from + "->" + to.getName() + ":" + message);
            }
        }
    }

    @Override
    public void sendToAll(String from, String message) {
        for (User user : vipUserList) {
            if (!user.getName().equals(from)) {
                System.out.println(from + "->" + user.getName() + ":" + message);
            }
        }

        for (User user : userList) {
            if (!user.getName().equals(from)) {
                System.out.println(from + "->" + user.getName() + ":" + message);
            }
        }
    }
}
