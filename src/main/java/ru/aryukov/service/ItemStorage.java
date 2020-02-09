package ru.aryukov.service;

import ru.aryukov.domain.Item;

public class ItemStorage {
    private final int INIT_CAPACITY = 50;
    private Item[] items = new Item[INIT_CAPACITY];
    private int indexForNextItem = 0;

    public void addItem(Item item){
        if(indexForNextItem < items.length){
            items[indexForNextItem] = item;
        }
        indexForNextItem++;
    }

    public Item updateItem(Item item){
        for (int i = 0; i < indexForNextItem - 1; i++) {
            if(items[i].getUniqId() == item.getUniqId()){
                items[i] = item;
                return item;
            }
        }
        return null;
    }

    public void printAllItems(){
        for (int i = 0; i < indexForNextItem; i++) {
            System.out.println(items[i].toString());
        }
    }
}
