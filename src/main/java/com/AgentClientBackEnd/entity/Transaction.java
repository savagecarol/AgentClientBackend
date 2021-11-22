package com.AgentClientBackEnd.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tId;
	private LocalDateTime tDate;
	@OneToOne(cascade =  CascadeType.ALL)
	private Agent  agentId;  
	@OneToOne(cascade =  CascadeType.ALL)
	private Client clientId;
	private double amountOfTransacrion;
	private String ttype;
	
	public Transaction( Agent agentId, Client clientId, double amountOfTransacrion,
			String ttype) {
		super();
		this.agentId = agentId;
		this.clientId = clientId;
		this.amountOfTransacrion = amountOfTransacrion;
		this.ttype = ttype;
	}
	public Transaction(Integer tId, LocalDateTime tDate, Agent agentId, Client clientId, double amountOfTransacrion,
			String ttype) {
		super();
		this.tId = tId;
		this.tDate = tDate;
		this.agentId = agentId;
		this.clientId = clientId;
		this.amountOfTransacrion = amountOfTransacrion;
		this.ttype = ttype;
	}
	public Transaction() {
		super();
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public LocalDateTime gettDate() {
		return tDate;
	}
	public void settDate() {
		this.tDate = LocalDateTime.now();
	}
	public Agent getAgentId() {
		return agentId;
	}
	public void setAgentId(Agent agentId) {
		this.agentId = agentId;
	}
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public double getAmountOfTransacrion() {
		return amountOfTransacrion;
	}
	public void setAmountOfTransacrion(double amountOfTransacrion) {
		this.amountOfTransacrion = amountOfTransacrion;
	}
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
}
