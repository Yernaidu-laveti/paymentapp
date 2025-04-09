package com.example.SpringPaymentApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringPaymentApp.entity.BankAccounts;
import com.example.SpringPaymentApp.repository.BankRepository;

@Service
public class BankService 
{
	@Autowired
	BankRepository bankrepository;
	
	public void addBankAccount(BankAccounts bankAccounts) 
	{
		bankrepository.save(bankAccounts);
	}

	
	
	
}
