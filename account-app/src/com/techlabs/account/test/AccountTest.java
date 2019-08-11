package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account(3000, "kohli");
		display(acc);
		Account acc1 = new Account(2037, "helee", 500);
		acc1.deposit(300);
		display(acc1);
		acc1.withDraw(600);
		display(acc1);

	}

	private static void display(Account acc1) {
		System.out.println("Account number is:" + acc1.getAccNo() + " Account holders's name:" + acc1.getName()
				+ " Account balance is:" + acc1.getAccBalance());

	}

}
