package com.designpattern.stringreversal;

import  junit.framework.Assert;
import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by binita on 20/02/15.
 */
public class StringReversalTest  {

    StringReversal reversal = null;
    @Before
    public void setUp() throws Exception {
        reversal = new StringReversalImpl();

    }

    @Test
    public void testStringReverseForGoodInput() throws Exception {
        String temp = "Binita";
        org.junit.Assert.assertEquals("Should be true",reversal.reverseCustom(temp), StringUtils.reverse(temp));
    }

}
