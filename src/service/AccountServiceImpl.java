package service;

import java.util.ArrayList;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		System.out.println("service/AccountServiceImpl에 진입\n ");
		list = new ArrayList<>();
	}
	@Override
	public void openAccount(int money) {
		String accountNum = "1234-5678";
		AccountBean account = new AccountBean();
		account.setAccountNum("");
		account.setMoney(0);
		account.setToday("");
		list.add(account);
		
		
	}
	@Override
	public String createAccountNum() {
		
		return null;
		
	}
	@Override
	public ArrayList<AccountBean> findAllAccounts() {
		ArrayList<AccountBean> list = new ArrayList<>();
		return list;
		
	}
	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		return accountBean;
	
	
	}
	@Override
	public int accountCount() {
		int count = 0;
		return count;
		
	}
	@Override
	public boolean existAccount(String accountNum) {
		return false;
	}
	@Override
	public void depositMoney(String accountNum, int money) {
		
	}
	@Override
	public void withdrawMoney(String accountNum, int money) {
		
	}
	@Override
	public void removeAccount(String accountNum) {
		
	}

}
