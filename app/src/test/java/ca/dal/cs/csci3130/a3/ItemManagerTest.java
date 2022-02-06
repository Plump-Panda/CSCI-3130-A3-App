package ca.dal.cs.csci3130.a3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ca.dal.cs.csci3130.a3.q3.Item;
import ca.dal.cs.csci3130.a3.q3.ItemManager;
import ca.dal.cs.csci3130.a3.q3.SmallTask;
import ca.dal.cs.csci3130.a3.q3.Transaction;
import ca.dal.cs.csci3130.a3.q3.UsedGoods;

public class ItemManagerTest {

    ItemManager manager;

    @Before
    public void setup() {
        manager = new ItemManager();
    }

    @Test
    public void testItemLocation() {
        Item firstItem = manager.deliverTopItem();
        Assert.assertEquals("Halifax", firstItem.getItemLocation());
        Item secondItem = manager.deliverTopItem();
        Assert.assertEquals("Halifax", secondItem.getItemLocation());
        Item thirdItem = manager.deliverTopItem();
        Assert.assertEquals("Halifax", thirdItem.getItemLocation());
    }

    @Test
    public void testItemName() {
        Item firstItem = manager.deliverTopItem();
        Assert.assertEquals("Item", firstItem.getName());
        Item secondItem = manager.deliverTopItem();
        Assert.assertEquals("Laptop", secondItem.getName());
        Item thirdItem = manager.deliverTopItem();
        Assert.assertEquals("Walk a dog", thirdItem.getName());
    }

    @Test
    public void testItemCompensation() {
        Item firstItem = manager.deliverTopItem();
        Item secondItem = manager.deliverTopItem();
        SmallTask thirdItem = (SmallTask) manager.deliverTopItem();
        Assert.assertEquals(25, thirdItem.getCompensation());
    }

    @Test
    public void testItemDuration() {
        Item firstItem = manager.deliverTopItem();
        Item secondItem = manager.deliverTopItem();
        SmallTask thirdItem = (SmallTask) manager.deliverTopItem();
        Assert.assertEquals(1, thirdItem.getDuration());
    }

    @Test
    public void testItemManufacturer() {
        Item firstItem = manager.deliverTopItem();
        UsedGoods secondItem = (UsedGoods) manager.deliverTopItem();
        Assert.assertEquals("Lenovo", secondItem.getManufacturer());
    }

    @Test
    public void testItemManufacturingYear() {
        Item firstItem = manager.deliverTopItem();
        UsedGoods secondItem = (UsedGoods) manager.deliverTopItem();
        Assert.assertEquals(2019, secondItem.getManufacturingYear());
    }

    @Test
    public void testGetTransactionAmount() {
        Transaction transaction = new Transaction();
        Assert.assertEquals(25, transaction.getTransactionAmount());
    }
}
