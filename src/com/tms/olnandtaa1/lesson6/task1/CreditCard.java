package com.tms.olnandtaa1.lesson6.task1;

public class CreditCard {
    String accountNumber;
    double currentAmountOfMoney;

    public CreditCard(String accountNumber, double currentAmountOfMoney) {
        this.accountNumber = accountNumber;
        this.currentAmountOfMoney = currentAmountOfMoney;
    }

    void addAmount(double newAmount) {
        currentAmountOfMoney += newAmount;
    }

    void withdrawAmount(double newAmount) {
        currentAmountOfMoney -= newAmount;
    }


    void infoAboutCreditCard(String accountNumber, double currentAmountOfMoney) {
        this.accountNumber = accountNumber;
        this.currentAmountOfMoney = currentAmountOfMoney;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentAmountOfMoney() {
        return currentAmountOfMoney;
    }

    public void setCurrentAmountOfMoney(double currentAmountOfMoney) {
        this.currentAmountOfMoney = currentAmountOfMoney;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber='" + accountNumber + '\'' +
                ", currentAmountOfMoney=" + currentAmountOfMoney +
                '}';
    }
}
