package com.capgemini.forestcollection.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	public static int countofdigits(int number) {
		int count=0;
		while(number!=0) {
			number/=10;
			++count;
		}
		return count;
	}
	
	public static boolean isValidName(String name) {
		return (Pattern.matches("[a-zA-Z]+",name));
	}
	public static boolean isValidDate(String date) {
		String dateValid = "^[0-3]?[0-9]/[0-1]?[0-2]/(?:[0-9]{2})?[0-9]{4}$";
		Pattern exp = Pattern.compile(dateValid);
		Matcher match = exp.matcher((CharSequence) date);
		if (match.matches()) {
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy");
			LocalDateTime local = LocalDateTime.now();
			String datee = dateFormat.format(local);
			if (date.compareTo(datee) < 0 || date.compareTo(datee) == 0) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}
	}

	public static boolean deliveryDate(String date) throws ParseException {
		String dateValid = "^[0-3]?[0-9]/[0-1]?[0-2]/(?:[0-9]{2})?[0-9]{4}$";
		Pattern exp = Pattern.compile(dateValid);
		Matcher match = exp.matcher((CharSequence) date);
		if (match.matches()) {
			return true;
		} // compareTo method returns the value 0 if the argument Date is equal to the
		else {
			return false;
		}
	}
	//

	public static boolean isValidfuture(String d) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			java.util.Date date = sdf.parse(d); // if date invalid throw exception
			Date today = new Date();
			return date.after(today); // return false if future date
		} catch (Exception e) {
			return true;
		}
	}


}
