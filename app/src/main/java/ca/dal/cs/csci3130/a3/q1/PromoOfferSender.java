package ca.dal.cs.csci3130.a3.q1;

import java.util.Date;

public class PromoOfferSender {
    public boolean sendOffer(IPromoOffer offer) {
        //buggy method, identify the bug and fix it!
        String expiredDateString = offer.getExpiredDate();
        Date expiredDate = convertToDate(expiredDateString);
        return false;
    }

    public Date convertToDate(String dateString) {
        //convert the date string to a date class!
        return null;
    }

}
