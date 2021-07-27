package com.way2learn.repository.tests;

import java.sql.SQLException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.service.AccountService;
import com.way2learnonline.service.BankService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-config.xml","classpath:test-infrastructure-config.xml"})
public class BankServiceTests {
	@Autowired
	private BankService bankService;	
	
	@Autowired
	private AccountService accountService;

	@Test	
	public void testGetAccountByNumberAsMap() throws SQLException{
		bankService.transfer(new Long(1), new Long(2),1000);
		
		//accountService.debit(500, 1L);
		
	}
}
