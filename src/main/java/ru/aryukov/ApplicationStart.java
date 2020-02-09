package ru.aryukov;

import ru.aryukov.domain.Item;
import ru.aryukov.service.ItemStorage;

public class ApplicationStart {
    public static void main(String[] args) {
        ItemStorage storage = new ItemStorage();

        Item item1 = new Item(1, "Our first Item. Just for testsing");
        Item item2 = new Item(2, "Our second Item. Just for debugging");

        storage.addItem(item1);
        storage.addItem(item2);

        storage.printAllItems();
    }
}
