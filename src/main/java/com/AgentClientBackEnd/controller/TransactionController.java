package com.AgentClientBackEnd.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgentClientBackEnd.entity.Transaction;
import com.AgentClientBackEnd.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepository;

	@CrossOrigin
	@GetMapping("/home")
	public String home() 
	{	
		return "home";
	}

	@CrossOrigin
	@GetMapping("")
	public List<Transaction> getAll() {
		return transactionRepository.findAll();
	}

	@CrossOrigin
	@GetMapping("/{transactionId}")
	public Transaction  getByTransactionId(@PathVariable int transactionId) {
		return transactionRepository.findById(transactionId).orElse(null);
	}

	@CrossOrigin
	@PutMapping("/{transactionId}")
	public Transaction putByTransactionId(@PathVariable int transactionId, @RequestBody Transaction transaction) {
		Transaction a = transactionRepository.findById(transactionId).orElse(null);
		if (a != null) {
			return transactionRepository.save(transaction);
		}
		return a;
	}

	@CrossOrigin
	@PostMapping("")
	@Transactional
	public Transaction addTransaction(@RequestBody Transaction transacation) {
		transacation.settDate();
		return transactionRepository.save(transacation);
	}

}
