package com.football.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.football.exception.CountryNotFoundException;
import com.football.exception.LeagueNotFoundException;
import com.football.pojos.StandingLeagueResponse;

public interface StandingsService {

	public String getCountryByName(String countryName) throws CountryNotFoundException;
	public String getLeagueByCountryIdAndLeagueName(String countryId, String leagueName) throws LeagueNotFoundException;
	public abstract ResponseEntity<List<StandingLeagueResponse>> getStandingLeagueData(String countryName,String teamName,String leagueName);
}
