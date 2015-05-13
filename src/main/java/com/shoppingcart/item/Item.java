package com.shoppingcart.item;

/**
 * Created by binita on 24/04/15.
 */
public class Item implements Comparable<Item>{
    private String name;
    private double price;
    // represents
    private int itemID;
    // 1 for NType Items get M type free
    // 2 for Two item offer
    // 3 for Three item cheapest free offer
    // 4 for Three in a setoffer
    // An item can also be applcable to multiple offers but this will be considered as an enhancement later on
    private int offerId;
    //for considering the items in a set so
    private int groupID;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }


    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }



    public Item(String name, double price, int typeID, int offerId) {
        this.name = name;
        this.price = price;
        this.itemID = typeID;
        this.offerId = offerId;
    }

    public Item(String name, double price, int itemID, int offerId, int groupID) {
        this.name = name;
        this.price = price;
        this.itemID = itemID;
        this.offerId = offerId;
        this.groupID = groupID;
    }


    public static Item getItem(String name,double price, int typeID){

        return new Item(name,price,typeID);
    }
    private Item(String name, double price, int typeID) {
        this.name = name;
        this.price = price;
        this.itemID = typeID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int typeID) {
        this.itemID = typeID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (itemID != item.itemID) return false;
        if (Double.compare(item.price, price) != 0) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + itemID;
        return result;
    }

    @Override
    public int compareTo(Item item) {

        double diff = this.getPrice() - item.getPrice();
        return (int) diff;
    }
}
