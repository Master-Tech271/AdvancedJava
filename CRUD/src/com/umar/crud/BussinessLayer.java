package com.umar.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BussinessLayer {
	
	@Autowired
	private DBManager dbManager;
	
	private boolean flag = false;
	
	//selectRecord
	public void selectAll() {
		dbManager.selectRecord();
	}
	
	//insertRecord
	public void insertData(String query) {
		flag = dbManager.manipulationRecord(query);
		if(flag) {
			System.out.println("Record Inserted!..");
		}
		else {
			System.out.println("Error, Record not Inserted!..");
		}
	}
	
	//updateRecord
	public void updateData(String query) {
		flag = dbManager.manipulationRecord(query);
		if(flag) {
			System.out.println("Update Data!..");
		}
		else {
			System.out.println("Error, Update not Data!..");
		}
	}
	
	//deleteRecord
		public void deleteData(String query) {
			flag = dbManager.manipulationRecord(query);
			if(flag) {
				System.out.println("Delete Data!..");
			}
			else {
				System.out.println("Error, Delete not Data!..");
			}
		}
	
	

}
