package com.shoppingcart.offer;

import com.shoppingcart.item.Item;

import java.util.List;

/**
 * Created by binita on 24/04/15.
 */
public class ThreeForTwoOffer implements OfferRules {

//offerID is 3
    @Override
    public void applyOffer(List<Item> items) {

        int count = 0;
        for(Item item: items){
            if(item.getOfferId()==3){
                count++;
                if(count==3){
                    System.out.println("3 for 2 Offer");
                    item.setPrice(0.0);
                }

            }
        }

    }
}
