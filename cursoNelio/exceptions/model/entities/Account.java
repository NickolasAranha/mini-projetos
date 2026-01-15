package cursoNelio.exceptions.model.entities;

import cursoNelio.exceptions.model.exceptions.BankException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        if(amount > this.withdrawLimit) {
            throw new BankException("Saque maior que o limite diário de saque!");
        }

        if (amount > this.balance) {
            throw new BankException("Saldo insuficiente!");
        }
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString() {
        return "Numero da conta: " + number + ", Nome: " + holder + ", Saldo: " + balance + ", Limite atual: " + withdrawLimit;
    }
}
