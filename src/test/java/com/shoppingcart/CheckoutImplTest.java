package com.shoppingcart;
import com.google.common.collect.Lists;
import com.shoppingcart.item.Item;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
/**
 * Created by binita on 24/04/1A
 * Implement a Supermarket checkout that calculates the total price of a number of items.
 Some items have multiple prices based on price rules such as:
 - buy 3 (equals) items and pay for 2
 - buy 2 (equals) items for a special price
 - buy 3 (in a set of items) and the cheapest is free
 - for each N (equals) items X, you get K items Y for free
 The output required is the receipt with the actual price of every item and the grand total.
 You should not spend more than a few hours on this problem.
 You may choose any means of accepting input and producing output, including the use of a test harness.
 The code should be simple and flexible so that any new rule should be added with the minimum effort.
 */
public class CheckoutImplTest {

    Checkout cart = null;
    List<Item> shoppingList = null;

    @Before
    public void setUp() throws Exception {
        cart = new CheckoutImpl();
        shoppingList = Lists.newArrayList();
    }

    @Test
    public void testForEmptyCheckout() throws Exception {
        try {
            cart.checkOut(shoppingList);
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Your shopping basket is empty",e.getMessage());
        }
    }

    @Test
    public void testForOneItem() throws Exception {

        assertEquals("Should return original price for one item",cart.checkOut(testSetForTwoItemsOfferId2()),500,0.1);

    }

    @Test
    public void testForNullCheckout() throws Exception {
        try {
            cart.checkOut(null);
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Your shopping basket is empty",e.getMessage());
        }

    }

    @Test
    public void testForTwoItems() throws Exception {
        testSetForTwoItemsOfferId2();
        testSetForItemsOfferId3();
        assertEquals("Should return amount without applying any offers", 600, cart.checkOut(shoppingList), 0.1);

    }

    @Test
    public void testForThreeDifferentItems() throws Exception {

        testSetForTwoItemsOfferId2();
        testSetForItemsOfferId3();
        testSetForItemsOfferId4();
        assertEquals("Three different items with no qualifying offer",700,cart.checkOut(shoppingList),0.1);
    }

    @Test
    public void testForThreeEqualQualifyingItems() throws Exception {
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        assertEquals("Should return amount applying offers, third item free",200,cart.checkOut(shoppingList),0.1);
    }

    @Test
    public void testForTwoEqualQualifyingItems() throws Exception {
        testSetForTwoItemsOfferId2();
        testSetForTwoItemsOfferId2();
        assertEquals("Should return amount applying any offers",750,cart.checkOut(shoppingList),0.1);

    }

    @Test
    public void testForTwoDifferentItems() throws Exception {
        testSetForTwoItemsOfferId2();
        testSetForItemsOfferId3();
        assertEquals("Should return amount applying no offers",600,cart.checkOut(shoppingList),0.1);
    }

    @Test
    public void testForThreeItemsInASet() throws Exception {
        shoppingList.add(new Item("Philips Juicer", 100, 1,4,4));
        shoppingList.add(new Item("HP Camera", 70, 3,4,4));
        shoppingList.add(new Item("HP Laptop",500,2,4,4));

        // cheapest item free
        assertEquals("Should return the total amount as 600",600,cart.checkOut(shoppingList),0.1);

    }

    @Test
    public void testForFourEqualItems() throws Exception {
        // offer id 3 deduct the price of the third item
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        assertEquals("Should return amount applying no offers", 300, cart.checkOut(shoppingList), 0.1);

    }

    @Test
    public void testForFiveEqualItems() throws Exception {
     //offer id 3 for 3 equal items and offer id 2 for 2 items
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        testSetForItemsOfferId3();
        testSetForTwoItemsOfferId2();
        testSetForTwoItemsOfferId2();
        assertEquals("Should return amount applying no offers",950,cart.checkOut(shoppingList),0.1);


    }

    @Test
    public void testForNItemsGetMFreeOffer() throws Exception {
        // offer id 4 and on 3 items of itemid 1, buyer receives 2 items of item id 4 free
        // item id 4 is automatically added to the shopping basket free of charge
        testFor3ItemsOfferID4();
        assertEquals("Should return amount including no price for free items",33,cart.checkOut(shoppingList),0.1);
    }

    private List<Item> testFor3ItemsOfferID4() {
        shoppingList.add(new Item("Baby Diapers",11,1,4));
        shoppingList.add(new Item("Baby Diapers",11,1,4));
        shoppingList.add(new Item("Baby Diapers",11,1,4));
        shoppingList.add(new Item("Baby Wipes",4,4,4));
        shoppingList.add(new Item("Baby Wipes",4,4,4));
        return shoppingList;
    }

    public List<Item> testSetForTwoItemsOfferId2() throws Exception {
        // offer id 2 for 2 items on 50 % discount

        shoppingList.add(new Item("HP Laptop",500,1,2));
        return shoppingList;

    }

    public List<Item> testSetForItemsOfferId3() throws Exception {
        /* three for 2 special offer */
        shoppingList.add(new Item("Philips Juicer",100,2,3));
        return shoppingList;
    }


    public List<Item> testSetForItemsOfferId4() throws Exception {
        /* N type items get M items free*/
        shoppingList.add(new Item("Philips Food Processor",100,2,4));
        return shoppingList;
    }

    public List<Item> testForFiveItemsInASet() throws Exception {
        shoppingList.add(Item.getItem("Philips Juicer",100,1));
        shoppingList.add(Item.getItem("HP Camera", 70, 1));
        shoppingList.add(Item.getItem("HP Laptop",500,1));
        shoppingList.add(Item.getItem("HP Laptop",500,1));
        shoppingList.add(Item.getItem("HP Laptop",500,1));
        return shoppingList;
    }


}

