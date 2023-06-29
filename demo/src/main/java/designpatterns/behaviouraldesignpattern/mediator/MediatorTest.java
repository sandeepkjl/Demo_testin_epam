package designpatterns.behaviouraldesignpattern.mediator;

/**
 * Mediator design pattern is used to when two objects intract directly, take help of a mediator to interact.
 *
 * like ATC is used by pilots
 *
 * or what's app platform used by people.
 *
 *
 *
 * **/

public class MediatorTest {
    public static void main(String args[]){
        IChatBox iChatBox = new IChatBox();

        User user1 = new UserImpl("U01","Sandeep",iChatBox);
        User user2 = new UserImpl("U02","Akita",iChatBox);

        iChatBox.adduser(user1);
        iChatBox.adduser(user2);

        user1.sendMsg("How are you ?", user2);
        user2.sendMsg("I am good, Thanks",user1);
    }

}
