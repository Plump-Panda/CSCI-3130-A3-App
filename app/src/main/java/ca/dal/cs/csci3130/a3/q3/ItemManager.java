package ca.dal.cs.csci3130.a3.q3;

import java.util.ArrayList;

public class ItemManager {

    ArrayList<Item> inMemoryDatabase;

    public ItemManager() {
        inMemoryDatabase = new ArrayList<>();
        Item baseItem = new Item();
        inMemoryDatabase.add(baseItem);
        UsedGoods usedGoods = new UsedGoods();
        inMemoryDatabase.add(usedGoods);
        SmallTask smallTask = new SmallTask();
        inMemoryDatabase.add(smallTask);
    }

    public Item deliverTopItem() {
        if (inMemoryDatabase.isEmpty()) {
            return null;
        } else {
            Item topItem = inMemoryDatabase.get(0);
            inMemoryDatabase.remove(topItem);
            return topItem;
        }
    }

}
