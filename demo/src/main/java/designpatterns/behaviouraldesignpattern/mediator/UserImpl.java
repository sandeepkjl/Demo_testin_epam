package designpatterns.behaviouraldesignpattern.mediator;

public class UserImpl extends User {

    IChatBox iChatBox;

    public UserImpl(String userId, String userName, IChatBox iChatBox) {
        super(userId, userName);
        this.iChatBox = iChatBox;
    }

    @Override
    public void sendMsg(String msg, User toUser) {
        System.out.println(this.getUserName() + " : "+"send the message");
        iChatBox.sendMessage(msg,toUser);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(msg+" received by user "+ this.getUserName());
        System.out.println("----------------------------");
    }
}
