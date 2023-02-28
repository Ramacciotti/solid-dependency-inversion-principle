package com.ramacciotti.segregation.wrong;

public class FranchiseNorth implements RestaurantInterface {

    // FranchiseNorth can only accept online payment and online order

    // If we implement the RestaurantInterface...
    // FranchiseNorth will be obligated to accept all payment methods, including cash!
    // But this franchise doesnt accept cash...
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
