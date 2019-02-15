package com.training.day4.threads;

public class AccountTest implements Runnable {
	Account account;
	int amount;

	@Override
	public void run() {
		account.withdraw(amount);
	}

	public AccountTest(Account account, int amount, String name) {
		this.account = account;
		this.amount = amount;

		new Thread(this, name).start();
	}

	public static void main(String[] args) {
		Account account = new Account(1000);
		new AccountTest(account, 500, "Mr. A");
		new AccountTest(account, 750, "Mr. B");
	}
}
