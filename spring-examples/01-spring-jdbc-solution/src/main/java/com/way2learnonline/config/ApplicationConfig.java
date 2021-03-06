package com.way2learnonline.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.JdbcAccountRepositoryImpl;
import com.way2learnonline.repository.JdbcRewardRepositoryImpl;
import com.way2learnonline.repository.JdbcTransactionRepositoryImpl;
import com.way2learnonline.repository.RewardRepository;
import com.way2learnonline.repository.TransactionRepository;
import com.way2learnonline.service.BankService;
import com.way2learnonline.service.BankServiceImpl;
import com.way2learnonline.service.EmailService;
import com.way2learnonline.service.EmailServiceImpl;

@Configuration
public class ApplicationConfig {
	
	@Autowired
	private DataSource dataSource;
	
	
	@Bean
	public JdbcTemplate jdbcTemplate(){		
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public AccountRepository accountRepository(){
		
		JdbcAccountRepositoryImpl accountRepositoryImpl= new JdbcAccountRepositoryImpl();		
		return accountRepositoryImpl;
	}
	@Bean
	public RewardRepository rewardRepository(){
		return  new JdbcRewardRepositoryImpl();
	}
	@Bean
	public TransactionRepository transactionRepository(){
		return new JdbcTransactionRepositoryImpl();
	}
	@Bean
	public EmailService emailService(){
		return new EmailServiceImpl();
	}
	
	@Bean
	public BankService bankService(){
		BankServiceImpl bankServiceImpl= new BankServiceImpl();
		bankServiceImpl.setAccountRepository(accountRepository());
		bankServiceImpl.setEmailService(emailService());
		bankServiceImpl.setRewardRepository(rewardRepository());
		bankServiceImpl.setTransactionRepository(transactionRepository());
		return bankServiceImpl;
	}

}
