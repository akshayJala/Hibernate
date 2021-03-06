package com.hibernate.compoundkey;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
@Embeddable
public class CompoundKey implements Serializable {
	@Id
	private int userId;
	private int accountId;
	
	
	public CompoundKey(int useId, int accountId){
		this.userId=userId;
		this.accountId=accountId;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
}
