package com.example.SpringPaymentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringPaymentApp.User;
import com.example.SpringPaymentApp.entity.BankAccounts;

public interface BankRepository extends  JpaRepository<BankAccounts,Integer> 
{

}
