package com.superwebservice.core;


import javax.jws.WebMethod;
import javax.jws.WebService;

import com.superwebservice.publictypes.*;
import com.superwebservice.publictypes.WeatherPacket.WeatherRequest;
import com.superwebservice.publictypes.WeatherPacket.WeatherResponse;

@WebService
public class ServeurWeather {

	//Récupère la situation météo en envoyant son unique_request
	@WebMethod
	public WeatherResponse obtenirSituationMeteo(String unique_token)
	{
		return null;
			
	}
	

	//Demande la situation météo avec une WeatherRequest, et reçois son unique_request
	@WebMethod
	public String deposerRequete(WeatherRequest wr)
	{
		return null;
		
		
	}
	
	
}
