package com.scenariobasedquestion.ewallet;

// Business wallet with fee
public class BusinessWallet extends Wallet {
    private double limit;
    private double feePercent;

    public BusinessWallet(double initialBalance, double referralBonus) {
        super(initialBalance + referralBonus);
        this.limit = 10000.0;
        this.feePercent = 2.0;
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > limit) {
            System.out.println("Amount exceeds limit");
            return false;
        }
        double fee = amount * feePercent / 100.0;
        double total = amount + fee;
        boolean success = deduct(total);
        if (success == false) {
            return false;
        }
        Wallet receiverWallet = receiver.getWallet();
        receiverWallet.addBalance(amount);
        Transaction t1 = new Transaction(owner.getId(), receiver.getId(), amount, "Business Transfer");
        history.add(t1);
        Transaction t2 = new Transaction(owner.getId(), "BANK", fee, "Fee");
        history.add(t2);
        return true;
    }
}
