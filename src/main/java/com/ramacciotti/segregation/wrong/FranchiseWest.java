package com.ramacciotti.segregation.wrong;

public class FranchiseWest implements RestaurantInterface {

    // FranchiseWest can only accept cash payment and drivethru order

    // If we implement the RestaurantInterface...
    // FranchiseWest will be obligated to accept all payment methods, including card!
    // But this franchise doesnt accept card...
    // This means that this franchise will be forced to use something not usefull to it!

    @Override
    public void acceptOrderByDriveThru() {

    }

    @Override
    public void acceptOrderBySite() {

    }

    @Override
    public void acceptPaymentByCard() {

    }

    @Override
    public void acceptPaymentByCash() {

    }

}
