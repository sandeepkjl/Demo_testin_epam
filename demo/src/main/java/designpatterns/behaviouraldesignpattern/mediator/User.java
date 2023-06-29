package designpatterns.behaviouraldesignpattern.mediator;

public abstract class User {

    String userId;

    String userName;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public abstract void sendMsg(String msg, User toUser);

    public abstract void receiveMsg(String msg);

}
