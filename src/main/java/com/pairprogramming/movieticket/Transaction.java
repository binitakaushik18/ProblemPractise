package com.pairprogramming.movieticket;
/**
 * Create a class (Transaction) with the following interface:
 void startPurchase();
 void addTicket(int age, boolean isStudent);
 double finishPurchase();
 Based on the table below, track ticket purchases for a given transaction and optimize for the cheapest price.
 Type
 Price
 General Admission
 $11.00
 Student
 $8.00
 Senior Citizen (65 & older)
 $6.00
 Children (under 13)
 $5.50
 Group (20 people or more)
 $6.00*/
public interface Transaction {
    void startPurchase();
    void addTicket(int age, boolean isStudent);
    double finishPurchase();

}
