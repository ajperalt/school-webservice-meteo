package com.superwebservice.launcher;
import java.util.Scanner;

import javax.xml.ws.Endpoint;

import com.superwebservice.core.ServeurWeather;


//rend le webservice sur un service http
public class ServeurLanceur {

	public static void main(String[] args) {

		ServeurWeather impl = new ServeurWeather(); //on utilise la classe Hello cr�� dans l'autre package	
		
		Endpoint endpoint1 = Endpoint.create(impl);
		
		endpoint1.publish("http://localhost:8090/meteo"); //libre du port et de l'url
		
		System.out.println("Tapez QUIT pour arr�ter");		
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			s = sc.nextLine();
		} while (! "QUIT".equals(s));
		
		endpoint1.stop();
		
		System.out.println("Endpoint stopp� !");
	}

}