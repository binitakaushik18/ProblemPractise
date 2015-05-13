package com.shoppingcart.offer;

import com.shoppingcart.item.Item;

import java.util.List;

/**
 * Created by binita on 24/04/15.
 */
public interface OfferRules {
    void applyOffer(List<Item> items);
}
