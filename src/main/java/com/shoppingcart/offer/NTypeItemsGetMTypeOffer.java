package com.shoppingcart.offer;

import com.google.common.collect.Lists;
import com.shoppingcart.item.Item;

import java.util.List;

/**
 * Buy N items consider item id's and get M item id's free
 *
 * Created by binita on 24/04/15.
 */
public class NTypeItemsGetMTypeOffer implements OfferRules {

    @Override
    public void applyOffer(List<Item> items) {

        //contain a group of item id's for which the offer is available
        // contain a group of item id's which u can get free

        List<Integer> offerItemsList = Lists.newArrayList();
        List<Integer> freeItemList = Lists.newArrayList();

        offerItemsList.add(1);
        freeItemList.add(4);
        //offer id is 4
        // consider M to be 3 and N to be 2 offer
        int m = 3;
        int n = 2;
        int mCount = 0 ;
        int nCount = 0;

        // M and N can be configurable or picked by a property file
        for(Item item: items) {
            if (item.getOfferId() == 4) {
                if (item.getItemID() == 1) {
                    mCount++;
                }
                if (mCount >= 3) {
                    if (item.getItemID() == 4) {
                        nCount++;
                        // only allowing n items to be free
                        if (nCount <= 2) {
                            item.setPrice(0.0);
                        }
                    }
                }
            }
        }

    }
}
