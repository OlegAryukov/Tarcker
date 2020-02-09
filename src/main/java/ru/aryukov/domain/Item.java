package ru.aryukov.domain;

import java.time.LocalDateTime;

public class Item {
    private int uniqId;
    private String description;
    private ItemStatus itemStatus;
    private LocalDateTime createDate;
    private LocalDateTime closeDate;

    public Item(int uniqId, String description) {
        this.uniqId = uniqId;
        this.description = description;
        this.createDate = LocalDateTime.now();
        this.itemStatus = ItemStatus.CREATED;
    }

    public int getUniqId() {
        return uniqId;
    }

    public String getDescription() {
        return description;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public LocalDateTime getCloseDate() {
        return closeDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

    @Override
    public String toString() {
        return "Item{" +
                "uniqId=" + uniqId +
                ", description='" + description + '\'' +
                ", itemStatus=" + itemStatus +
                ", createDate=" + createDate +
                ", closeDate=" + closeDate +
                '}';
    }
}
