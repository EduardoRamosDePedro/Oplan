package com.ted.demos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FormatDateTime {

	public static void main(String[] args) throws ParseException {
		
//		String date_s = " 2011-01-18 00:00:00.0";
//		SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
//		
//		Date date = dt.parse(date_s); 
//		System.out.println(dt.parse(date_s));
//		
//		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
//		System.out.println(dt1.format(date));
//
//
//		String date_s2 = "2011-01-18";
//		SimpleDateFormat dt2 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
//		
//		Date date2 = dt.parse(date_s2); 
//		System.out.println(dt.parse(date_s2));
//		
//		SimpleDateFormat dt12 = new SimpleDateFormat("yyyy-mm-dd");
//		System.out.println(dt12.format(date2));
//
//		
		
		
	    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("YYYY-MM-dd");
	     
	    String strFecha = "2007-12-25";
	     
	    Date fecha = null;
	    
	    try {

	    fecha = formatoDelTexto.parse(strFecha);

	    } catch (ParseException ex) {

	    	ex.printStackTrace();

	    }

	    System.out.println(fecha);
		
		
		
	}
	
}
