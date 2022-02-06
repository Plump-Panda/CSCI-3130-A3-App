package ca.dal.cs.csci3130.a3;

import org.junit.Test;

import ca.dal.cs.csci3130.a3.q2.AccessLevel;
import ca.dal.cs.csci3130.a3.q2.AppUser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AppUserTest {

    @Test
    public void testBuyerAccess() {
        //new constructor is allowed
        AppUser appUser = new AppUser("buyer");
        appUser.setAccessLevel();
        assertEquals(AccessLevel.buyerAccessLevel, appUser.getAccessLevel());
        assertTrue(appUser.canPlaceOnlineOrder());
        assertFalse(appUser.hasAdminAccess());
        assertFalse(appUser.canPlaceOnlineAd());
    }

    @Test
    public void testSellerAccess() {
        //new constructor is allowed
        AppUser appUser = new AppUser("seller");
        appUser.setAccessLevel();
        assertEquals(AccessLevel.sellerAccessLevel, appUser.getAccessLevel());
        assertTrue(appUser.canPlaceOnlineAd());
        assertFalse(appUser.hasAdminAccess());
        assertFalse(appUser.canPlaceOnlineOrder());
    }

    @Test
    public void testAdminAccess() {
        //new constructor is allowed
        AppUser appUser = new AppUser("admin");
        appUser.setAccessLevel();
        assertEquals(AccessLevel.adminAccessLevel, appUser.getAccessLevel());
        assertTrue(appUser.hasAdminAccess());
        assertTrue(appUser.canPlaceOnlineAd());
        assertTrue(appUser.canPlaceOnlineOrder());
    }

    @Test
    public void testAllUserAccess() {
        //new constructors are allowed
        AppUser appUser1 = new AppUser("buyer");
        AppUser appUser2 = new AppUser("seller");
        AppUser appUser3 = new AppUser("admin");
        appUser1.setAccessLevel();
        appUser2.setAccessLevel();
        appUser3.setAccessLevel();
        assertFalse(appUser1.canPlaceOnlineAd());
        assertFalse(appUser2.canPlaceOnlineOrder());
        assertTrue(appUser3.hasAdminAccess());
    }


}
