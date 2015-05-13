package com.shoppingcart.offer;

import com.shoppingcart.item.Item;

import java.util.Collections;
import java.util.List;

/**
 * Created by binita on 24/04/15.
 */
public class ThreeInASetOffer implements OfferRules {

    @Override
    // offerID 4 cheapest item free

    public void applyOffer(List<Item> items) {

        int count = 0;

// sort items on price and deduct the cheapest one
        Collections.sort(items);
        Collections.reverse(items);

        for(Item item: items){

            if(item.getGroupID()==4){
                count++;
                if(count==3){
                    System.out.println("3 in a set Offer");
                    item.setPrice(0.0);
                }

            }
        }

    }
}
