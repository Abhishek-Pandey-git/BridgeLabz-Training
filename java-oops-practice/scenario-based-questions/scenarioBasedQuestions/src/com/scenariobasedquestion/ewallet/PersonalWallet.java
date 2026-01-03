package com.scenariobasedquestion.ewallet;

// Personal wallet with limit
public class PersonalWallet extends Wallet {
    private double transferLimit;

    public PersonalWallet(double initialBalance, double referralBonus) {
        super(initialBalance + referralBonus);
        this.transferLimit = 1000.0;
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > transferLimit) {
            System.out.println("Amount exceeds transfer limit");
            return false;
        }
        boolean success = deduct(amount);
        if (success == false) {
            return false;
        }
        Wallet receiverWallet = receiver.getWallet();
        receiverWallet.addBalance(amount);
        Transaction t = new Transaction(owner.getId(), receiver.getId(), amount, "Transfer");
        history.add(t);
        return true;
    }
}
