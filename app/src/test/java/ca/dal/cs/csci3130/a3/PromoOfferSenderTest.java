package ca.dal.cs.csci3130.a3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import ca.dal.cs.csci3130.a3.q1.IPromoOffer;
import ca.dal.cs.csci3130.a3.q1.PromoOfferSender;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.Silent.class)
public class PromoOfferSenderTest {

    static IPromoOffer firstOffer = null;
    static IPromoOffer secondOffer = null;

    @BeforeClass
    public static void setup() {
        //mock the IPromoOffer interface
    }

    @Test
    public void testSendOffer() {
        PromoOfferSender sender = new PromoOfferSender();
        assertTrue(sender.sendOffer(firstOffer));
        assertEquals("This is a cool offer!", firstOffer.getOffer());
        assertEquals("2022-04-30", firstOffer.getExpiredDate());
        assertEquals(10, firstOffer.getDiscountRate());
        Mockito.verify(firstOffer, Mockito.atLeastOnce()).getExpiredDate();
        Mockito.verify(firstOffer, Mockito.atLeastOnce()).getDiscountRate();
        Mockito.verify(firstOffer, Mockito.atLeastOnce()).getOffer();
    }

    @Test
    public void testDoNotSendOffer() {
        PromoOfferSender sender = new PromoOfferSender();
        assertFalse(sender.sendOffer(secondOffer));
        assertEquals("2022-01-05", secondOffer.getExpiredDate());
        Mockito.verify(secondOffer, Mockito.atLeastOnce()).getExpiredDate();
        Mockito.verify(secondOffer, Mockito.times(0)).getDiscountRate();
        Mockito.verify(secondOffer, Mockito.times(0)).getOffer();
    }
}
