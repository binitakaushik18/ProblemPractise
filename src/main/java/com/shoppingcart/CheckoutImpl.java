package com.shoppingcart;

import com.shoppingcart.item.Item;
import com.shoppingcart.offer.MultipleOfferRules;
import com.shoppingcart.offer.OfferRules;

import java.util.List;

/**
 * Created by binita on 24/04/15.
 */
public class CheckoutImpl implements Checkout {
    OfferRules rules = new MultipleOfferRules();

    @Override
    public double checkOut(List<Item> shoppingList) {
        if(shoppingList == null || shoppingList.isEmpty()){
            throw new IllegalArgumentException("Your shopping basket is empty");
        }
        return calculateBill(shoppingList);
    }

    public double calculateBill(List<Item> shoppingList){

        double amount =0.0;
        rules.applyOffer(shoppingList);

        for(Item item:shoppingList){

            System.out.println(item.getName()+ " Price: "+item.getPrice());
            amount += item.getPrice();
        }
        return amount;
    }

}
