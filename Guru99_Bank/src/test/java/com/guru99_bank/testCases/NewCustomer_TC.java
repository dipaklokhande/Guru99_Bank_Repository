package com.guru99_bank.testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class NewCustomer_TC {
	
	@Test
	public void NCTC01() throws EncryptedDocumentException, IOException {
		Login_TC log = new Login_TC();
		log.TC01();
		
	}

}
