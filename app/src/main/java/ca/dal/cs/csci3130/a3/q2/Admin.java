package ca.dal.cs.csci3130.a3.q2;

public class Admin extends AppUser {
    public Admin(String userType) {
        super(userType);
    }

    public void setAccessLevel(){
        this.accessLevel = AccessLevel.adminAccessLevel;
    }
}
