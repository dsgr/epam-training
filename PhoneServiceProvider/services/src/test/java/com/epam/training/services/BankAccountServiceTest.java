package com.epam.training.services;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class BankAccountServiceTest extends AbstractSpringTest {
/*
	@Autowired
	private BankAccountService service;

	@Test
	public void salaryPaymentTest() {
		Long from = 1l;
		Long to = 2l;
		Integer total = 500;// TODO random values

		BankAccount accountFromBeforeUpdate = service.get(from);
		BankAccount accountToBeforeUpdate = service.get(to);

		service.makePayment(from, to, total);

		BankAccount accountFromAfterUpdate = service.get(from);
		BankAccount accountToAfterUpdate = service.get(to);

		Assert.assertEquals(new Integer(accountFromBeforeUpdate.getBalance() - total),
				accountFromAfterUpdate.getBalance());

		Assert.assertEquals(new Integer(accountToBeforeUpdate.getBalance() + total),
				accountToAfterUpdate.getBalance());
	}*/

}
