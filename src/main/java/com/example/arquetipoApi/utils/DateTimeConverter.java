package com.example.arquetipoApi.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeConverter {
	

	public LocalDate fromDateToLocalDate(Date date) {
	    return new java.sql.Date(date.getTime()).toLocalDate();
	}
	
	public static LocalDateTime fromDateToLocalDateTime(Date date) {
	    return date.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}

}
