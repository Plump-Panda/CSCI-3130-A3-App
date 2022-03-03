package ca.dal.cs.csci3130.a3.q3;

public class SmallTask extends Item {

    @Override
    public String getName() {
        return "Walk a dog";
    }

    public int getDuration() {
        return 1;
    }

    public int getCompensation() {
        return 25;
    }
}
