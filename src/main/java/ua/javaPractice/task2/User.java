package ua.javaPractice.task2;

public class User {
    private final int userId;
    private final String userFirstName;
    private final String userLastName;
    private double userAmountOfMoney;

    public User(int userId, String userFirstName, String userLastName, double userAmountOfMoney) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userAmountOfMoney = userAmountOfMoney;
    }

    public int getUserId() {
        return userId;
    }

    public double getUserAmountOfMoney() {
        return userAmountOfMoney;
    }

    public void setUserAmountOfMoney(double userAmountOfMoney) {
        this.userAmountOfMoney = userAmountOfMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userAmountOfMoney=" + userAmountOfMoney +
                '}';
    }
}
