package com.pairprogramming.movieticket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * void startPurchase();
 * void addTicket(int age, boolean isStudent);
 * double finishPurchase();
 * <p/>
 * General Admission $11.00
 * Student  $8.00
 * Senior Citizen (65 & older)  $6.00
 * Children (under 13)  $5.50
 * Group (20 people or more)  $6.00
 * Created by binita on 06/03/15.
 */
public class MovieTicketImplTest {
    Transaction movieTicketTransaction = null;

    @Before
    public void setUp() throws Exception {
        movieTicketTransaction = new MovieTicket();

    }

    @Test
    public void testForZeroAgeStudent() throws Exception {
        try {
            movieTicketTransaction.startPurchase();
            movieTicketTransaction.addTicket(0, true);
            movieTicketTransaction.finishPurchase();
            fail("Should not reach here");
        } catch (IllegalArgumentException e) {
            assertEquals("Should throw exception", "Invalid age specified", e.getMessage());
        }

    }

    @Test
    public void testForNegativeAgePerson() throws Exception {
        try {
            movieTicketTransaction.startPurchase();
            movieTicketTransaction.addTicket(-2, true);
            movieTicketTransaction.finishPurchase();
            fail("Should not reach here");
        } catch (IllegalArgumentException e) {
            assertEquals("Should throw exception", "Invalid age specified", e.getMessage());
        }
    }

    @Test
    public void testForGeneralAdmission() throws Exception {
        movieTicketTransaction.startPurchase();
        movieTicketTransaction.addTicket(22, false);
        movieTicketTransaction.addTicket(32, false);
        assertEquals("Should return the for 2 general tickets i.e 22", 22, movieTicketTransaction.finishPurchase(), 0);


    }

    @Test
    public void testFor19Students() throws Exception {
        movieTicketTransaction.startPurchase();
        for (int i = 0; i < 19; i++) {
            movieTicketTransaction.addTicket(19, true);

        }
        assertEquals("Should return the for 19 student tickets i.e 152", 152, movieTicketTransaction.finishPurchase(), 0);


    }

    @Test
    public void testFor21SeniorCitizen() throws Exception {
        movieTicketTransaction.startPurchase();
        for (int i = 0; i < 21; i++) {
            movieTicketTransaction.addTicket(63, false);
        }
        assertEquals("Should return  for 21 senior citizen tickets i.e ", 126, movieTicketTransaction.finishPurchase(), 0);

    }

    @Test
    public void testFor2Children1Adult() throws Exception {
        movieTicketTransaction.startPurchase();

        movieTicketTransaction.addTicket(2, false);//2 child
        movieTicketTransaction.addTicket(2, false);//2 child
        movieTicketTransaction.addTicket(24, false);
        assertEquals("Should return  for 2 children 1 adult tickets i.e ", 22, movieTicketTransaction.finishPurchase(), 0);

    }

    @Test
    public void testFor25MixedFamilyTicket() throws Exception {
        movieTicketTransaction.startPurchase();
        for (int i = 0; i < 11; i++) {
            movieTicketTransaction.addTicket(5, false);//2 child
            movieTicketTransaction.addTicket(20, false);//2 child
        }
        movieTicketTransaction.addTicket(25, false);//2 child
        movieTicketTransaction.addTicket(51, false);//2 child
        movieTicketTransaction.addTicket(60, false);//2 child
        assertEquals("Should return  for 3 children tickets i.e ", 150, movieTicketTransaction.finishPurchase(), 0);
    }
}
