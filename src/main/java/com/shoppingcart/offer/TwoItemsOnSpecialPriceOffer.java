package com.shoppingcart.offer;

import com.google.common.collect.Lists;
import com.shoppingcart.item.Item;

import java.util.List;

/**
 * Created by binita on 24/04/15.
 */
public class TwoItemsOnSpecialPriceOffer implements OfferRules {

    /* Give 50% discount for 2 similar items in the offer*/
    @Override
    public void applyOffer(List<Item> items) {

        int count = 0;
        List<Integer> duplicateItemsList = Lists.newArrayList();
        //offer id is 2

     for(Item item:items){

         if(item.getOfferId()==2) {
             count++;
             if(duplicateItemsList.contains(item.getItemID())) {
                 if (count == 2) {
                     System.out.println("Buy 2 items get 50% discount on second item");
                     item.setPrice(item.getPrice() * 0.5);
                 }
             }
         }
         duplicateItemsList.add(item.getItemID());


     }

    }
}
