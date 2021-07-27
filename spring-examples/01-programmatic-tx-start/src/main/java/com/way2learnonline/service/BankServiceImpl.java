package com.way2learnonline.service;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class BankServiceImpl implements BankService {

	@Autowired private AccountService accountService;
	
	 
	@Autowired
	private PlatformTransactionManager transactionManager;

	
	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
		
			//start the transaction
			DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
			TransactionStatus status = transactionManager.getTransaction(definition);
			
			System.out.println("In Transfer ... " + status.isNewTransaction());
			
			try {
				
				Long transactionId= accountService.debit(amount,fromAccountNumber);
				accountService.credit(amount, toAccountNumber);

				//commit transaction
				transactionManager.commit(status);
				return transactionId;		
				
			}catch (Exception e) {
				// TODO: handle exception
				transactionManager.rollback(status);
				
			}
			
			return null;
				
		
				
				
	}
	
	
	

}
