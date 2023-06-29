package designpatterns.behaviouraldesignpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class IChatBox implements IChat{

    static List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

    @Override
    public void adduser(User user) {
        userList.add(user);
    }


    @Override
    public void sendMessage(String msg, User toUser) {
        if(userList.contains(toUser)){
            toUser.receiveMsg(msg);
        }
    }


}
