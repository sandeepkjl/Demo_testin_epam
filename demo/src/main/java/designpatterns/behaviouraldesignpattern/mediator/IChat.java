package designpatterns.behaviouraldesignpattern.mediator;

public interface IChat {

    void adduser(User user);
    void sendMessage(String msg,User fromUser);
}
