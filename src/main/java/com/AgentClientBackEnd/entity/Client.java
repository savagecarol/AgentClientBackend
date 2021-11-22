package com.AgentClientBackEnd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Client
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private String clientName;
	private String clientPassword;
	private String clientState;
	private String phoneNumber;
	private double walletBalance;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientState() {
		return clientState;
	}
	public void setClientState(String clientState) {
		this.clientState = clientState;
	}
	public String getClientPassword() {
		return clientPassword;
	}
	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public Client(String clientName, String clientPassword, String clientState, String phoneNumber,
			double walletBalance) {
		super();
		this.clientName = clientName;
		this.clientPassword = clientPassword;
		this.clientState = clientState;
		this.phoneNumber = phoneNumber;
		this.walletBalance = walletBalance;
	}
	public Client() {
		super();
	}
	public Client(int clientId, String clientName, String clientPassword, String clientState, String phoneNumber,
			double walletBalance) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientPassword = clientPassword;
		this.clientState = clientState;
		this.phoneNumber = phoneNumber;
		this.walletBalance = walletBalance;
	}
	
	
//	 @OneToOne(mappedBy = "clientId")
//	  private Transaction transaction;
	
}
