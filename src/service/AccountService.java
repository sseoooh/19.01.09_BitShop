package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	/*C
	R
	U
	D*/
	public void openAccount(int money); // accountNum
	public String createAccountNum();
	
	public ArrayList<AccountBean> findAllAccounts();
	public AccountBean findByAccountNum(String accountNum);
	public int accountCount();
	public boolean existAccount(String accountNum);
	
	public void depositMoney(String accountNum, int money);
	public void withdrawMoney(String accountNum, int money);
	
	public void removeAccount(String accountNum);
	 
}
