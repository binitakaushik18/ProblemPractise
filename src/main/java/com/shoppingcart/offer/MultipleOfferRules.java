package com.shoppingcart.offer;

import com.google.common.collect.Lists;
import com.shoppingcart.item.Item;

import java.util.List;

/**
 * Created by binita on 24/04/15.
 */
public class MultipleOfferRules implements OfferRules {
    List<OfferRules> offerRulesList = Lists.newArrayList();
    
    @Override
    public void applyOffer(List<Item> items) {
        offerRulesList.add(new TwoItemsOnSpecialPriceOffer());
        offerRulesList.add(new ThreeForTwoOffer());
        offerRulesList.add(new ThreeInASetOffer());
        offerRulesList.add(new NTypeItemsGetMTypeOffer());

        for(OfferRules rules : offerRulesList){
            rules.applyOffer(items);
        }


    }
}
