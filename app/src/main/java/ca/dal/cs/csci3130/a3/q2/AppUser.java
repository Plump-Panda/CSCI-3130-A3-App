package ca.dal.cs.csci3130.a3.q2;

public abstract class AppUser {

    String userType;
    AccessLevel accessLevel;

    public AppUser(String userType) {
        this.userType = userType;
    }

    public abstract void setAccessLevel();

    public AccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public boolean canPlaceOnlineOrder() {
        if (this.accessLevel.equals(AccessLevel.buyerAccessLevel)) {
            return true;
        } else if (accessLevel.equals(AccessLevel.adminAccessLevel)) {
            return true;
        }
        return false;
    }

    public boolean canPlaceOnlineAd() {
        if (this.accessLevel.equals(AccessLevel.sellerAccessLevel)) {
            return true;
        } else if (accessLevel.equals(AccessLevel.adminAccessLevel)) {
            return true;
        }
        return false;
    }

    public boolean hasAdminAccess() {
        if (this.accessLevel.equals(AccessLevel.adminAccessLevel)) {
            return true;
        }
        return false;
    }
}
