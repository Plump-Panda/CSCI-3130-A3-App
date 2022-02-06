package ca.dal.cs.csci3130.a3.q3;

public class Transaction extends Item {

    public int getTransactionAmount() {
        return this.getCompensation();
    }

}
