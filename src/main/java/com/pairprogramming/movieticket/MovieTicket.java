package com.pairprogramming.movieticket;

import javax.transaction.TransactionRequiredException;

/**
 * Created by binita on 06/03/15.
 */
public class MovieTicket implements Transaction {

    private boolean initialiseTransaction = false;
    private int ticketCount = 0;
    public static final double CHILDREN = 5.5;
    public static final int STUDENT = 8;
    public static final int SENIOR_CITIZEN = 8;
    public static final int ABOVE_20_TICKETS = 6;
    public static final int GENERAL = 11;

    private double ticketAmount = 0;
    // can also have a random transaction id

    @Override
    public void startPurchase() {
        this.initialiseTransaction = true;

    }

    @Override
    public void addTicket(int age, boolean isStudent) {
        if (!initialiseTransaction) {
            //will ideally create a transaction not started exception
            throw new IllegalArgumentException("Transaction not started, please call StartPurchase");
        }
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age specified");
        }
        ticketCount++;

        if (isStudent) {
            ticketAmount += STUDENT;
        }
        else if (!isStudent) {
            if (age < 13) {
                ticketAmount += CHILDREN;
            }
            if (age > 13 && age < 60 & !isStudent) {
                ticketAmount += GENERAL;
            }
            if (age > 60) {
                ticketAmount += SENIOR_CITIZEN;
            }
        }
        if (ticketCount >= 20) {
            //reset all old ticket price charged
            ticketAmount = ticketCount * ABOVE_20_TICKETS;
        }


    }

    @Override
    public double finishPurchase() {
        return ticketAmount;
    }
}
