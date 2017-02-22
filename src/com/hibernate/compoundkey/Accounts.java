package com.hibernate.compoundkey;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Accounts {

	CompoundKey compoundKey;

	private int accountbalance;

	@Id
	public CompoundKey getCompoundKey() {
	return compoundKey;
}
public void setCompoundKey(CompoundKey compoundKey) {
	this.compoundKey = compoundKey;
}
public int getAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(int accountbalance) {
	this.accountbalance = accountbalance;
}
}
