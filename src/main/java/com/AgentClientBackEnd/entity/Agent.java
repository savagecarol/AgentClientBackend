package com.AgentClientBackEnd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agentId;
	private String agentName;
	private String agentState;
	private String linkedBankAccountName;
	private Integer bankAccountNumber;
	private double walletBalance;
	public Agent(String agentName, String agentState, String linkedBankAccountName,
			Integer bankAccountNumber, double walletBalance) {
		super();
		this.agentName = agentName;
		this.agentState = agentState;
		this.linkedBankAccountName = linkedBankAccountName;
		this.bankAccountNumber = bankAccountNumber;
		this.walletBalance = walletBalance;
	}
	
	
	
	public Agent() {
		super();
	}



	public Agent(int agentId, String agentName, String agentState, String linkedBankAccountName,
			Integer bankAccountNumber, double walletBalance) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentState = agentState;
		this.linkedBankAccountName = linkedBankAccountName;
		this.bankAccountNumber = bankAccountNumber;
		this.walletBalance = walletBalance;
	}



	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentState() {
		return agentState;
	}
	public void setAgentState(String agentState) {
		this.agentState = agentState;
	}
	public String getLinkedBankAccountName() {
		return linkedBankAccountName;
	}
	public void setLinkedBankAccountName(String linkedBankAccountName) {
		this.linkedBankAccountName = linkedBankAccountName;
	}
	public Integer getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(Integer bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}	
	
	
//	   @OneToOne(mappedBy = "agentId")
//	   private Transaction transaction;
}
