package com.AgentClientBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgentClientBackEnd.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{

}
