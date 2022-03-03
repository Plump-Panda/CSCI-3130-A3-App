package ca.dal.cs.csci3130.a3.q3;

public class Transaction extends Item {

    SmallTask smallTask = new SmallTask();

    public int getTransactionAmount() {
        return smallTask.getCompensation();
    }

}
