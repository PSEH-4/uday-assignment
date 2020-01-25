package com.football.exception;

public class CountryNotFoundException extends RuntimeException{

	public CountryNotFoundException(String exception) {
        super(exception);
    }
}
