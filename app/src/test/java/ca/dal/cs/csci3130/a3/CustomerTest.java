package ca.dal.cs.csci3130.a3;

import org.junit.Test;

import ca.dal.cs.csci3130.a3.q4.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerName() {
        Customer firstCustomer = new Customer("John", "Doe");
        assertEquals("John Doe", firstCustomer.getFullName());

        Customer secondCustomer = new Customer("Jane", "Doe");
        assertEquals("Jane Doe", secondCustomer.getFullName());
    }

    @Test
    public void testCustomerLoyaltyCardNumber() {
        Customer customer1 = new Customer("John", "Doe");
        customer1.setLoyaltyCard(306, 123456, 100);
        assertEquals("306-123456", customer1.getFullCardNumber());

        Customer customer2 = new Customer("Jane", "Doe");
        customer2.setLoyaltyCard(902, 123456, 200);
        assertEquals("902-123456", customer2.getFullCardNumber());
    }

    @Test
    public void testCustomerLoyaltyPoints() {
        Customer customer1 = new Customer("John", "Doe");
        customer1.setLoyaltyCard(306, 123456, 100);
        assertEquals(100, customer1.getLoyaltyPoints());

        Customer customer2 = new Customer("Jane", "Doe");
        customer2.setLoyaltyCard(902, 123456, 200);
        assertEquals(200, customer2.getLoyaltyPoints());
    }

}
