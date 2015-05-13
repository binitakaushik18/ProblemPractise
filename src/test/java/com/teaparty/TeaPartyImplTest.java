package com.teaparty;

import com.teaparty.TeaParty;
import com.teaparty.TeaPartyImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 Create a class (TeaParty) with the following interface:
 String welcome(String lastName, boolean isWoman, boolean isSir);
 The welcome messages follow the pattern: Hello {title} {lastName}.
 {title} has the following rules:
 Ms. for a woman
 Sir for a knight
 Mr. otherwise
 * Created by binita on 05/03/15.
 */
public class TeaPartyImplTest {
    TeaParty teaParty = null;
    public static final String MR_OTHERIWSE ="Hello Mr. otherwise";
    public static final String MISS ="Hello Ms. ";
    public static final String MR ="Hello Mr. ";

    @Before
    public void setUp() throws Exception {
        teaParty = new TeaPartyImpl();

    }

    @Test
    public void testForNullInputAndMaleInput() throws Exception {
        assertEquals("Should return otherwise Mr.",MR_OTHERIWSE,teaParty.welcome(null,false,true));

    }

    @Test
    public void testForEmptyInput() throws Exception {
        assertEquals("Should return otherwise Mr.", MR_OTHERIWSE, teaParty.welcome("", false, true));

    }

    @Test
    public void testForMaleInput() throws Exception {
        assertEquals("Should return  Mr.", new String(MR).concat("Kulkarni"), teaParty.welcome("Kulkarni", false, true));

    }

    @Test
    public void testForFemaleInput() throws Exception {
        assertEquals("Should return  Miss.", new String(MISS).concat("Kaushik"), teaParty.welcome("Kaushik",true,false));

    }

    @Test
    public void testForNeitherMaleNorFemaleInput() throws Exception {
        assertEquals("Should return otherwise Mr.",MR_OTHERIWSE,teaParty.welcome("Myer",false,false));

    }

    @Test
    public void testForBothMaleAndFemaleInput() throws Exception {
        assertEquals("Should return otherwise Mr.", MR_OTHERIWSE, teaParty.welcome("Santander", true, true));
    }

    @Test
    public void testForBothMaleAndFemaleAndNullLastname() throws Exception {
        assertEquals("Should return  Mr. otherwise", MR_OTHERIWSE, teaParty.welcome(null, false,false));

    }
}
