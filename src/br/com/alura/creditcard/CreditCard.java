package br.com.alura.creditcard;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> purchases;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchases = new ArrayList<>();
    }

    public boolean launchBuy(Purchase purchase) {
        if (this.balance > purchase.getValue()) {
            this.balance -= purchase.getValue();
        }

        return false;
    }

    public double getLimit() {
        return this.limit;
    }

    public double getBalance() {
        return this.balance;
    }

    public List<Purchase> getPurchases() {
        return this.purchases;
    }
}
