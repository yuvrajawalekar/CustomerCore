package cust_execs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import core.app.Customer;
import core.app.type;

public class Validation {
	
	public static type checkType(String t) {
		return type.valueOf(t.toUpperCase()) ;
	}
	public static Date checkDate(String d) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date temp = sdf.parse(d);
		return temp;
	}
	public static boolean checkLogin(String email, String pass, HashMap<String, Customer> custHM) {	
		boolean flag=false;
		if(custHM.containsKey(email)) {
				if(custHM.get(email).getPassword().equals(pass))
					flag=true;
				}
		return flag;
	}
	
}
