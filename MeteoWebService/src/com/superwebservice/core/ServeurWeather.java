package com.superwebservice.core;


import javax.jws.WebMethod;
import javax.jws.WebService;

import com.superwebservice.publictypes.*;
import com.superwebservice.publictypes.WeatherPacket.WeatherRequest;
import com.superwebservice.publictypes.WeatherPacket.WeatherResponse;

@WebService
public class ServeurWeather {

	//R�cup�re la situation m�t�o en envoyant son unique_request
	@WebMethod
	public WeatherResponse obtenirSituationMeteo(String unique_token)
	{
		return null;
			
	}
	

	//Demande la situation m�t�o avec une WeatherRequest, et re�ois son unique_request
	@WebMethod
	public String deposerRequete(WeatherRequest wr)
	{
		return null;
		
		
	}
	
	
}
