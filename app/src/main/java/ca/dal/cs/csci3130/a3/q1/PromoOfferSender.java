package ca.dal.cs.csci3130.a3.q1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PromoOfferSender {
    public boolean sendOffer(IPromoOffer offer) {
        //buggy method, identify the bug and fix it!
        String expiredDateString = offer.getExpiredDate();
        Date expiredDate = convertToDate(expiredDateString);

        Date goodDate;
        try{
            goodDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse("2022-01-06");
        }catch (Exception e){
            goodDate = null;
        }
        return expiredDate.after(goodDate);
    }

    public Date convertToDate(String dateString) {
        //convert the date string to a date class!
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date;
        try{
            date =  format.parse(dateString);
        }catch (Exception e){
            date = null;
        }
        return date;
    }

}
