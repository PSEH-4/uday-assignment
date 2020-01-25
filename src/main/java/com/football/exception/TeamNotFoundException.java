package com.football.exception;

public class TeamNotFoundException extends RuntimeException{

	public TeamNotFoundException(String exception) {
        super(exception);
    }
}
