package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-01-17T14:22:59.900+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "GlobalWeatherHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GlobalWeatherHttpPost {

    /**
     * Get weather report for all major cities around the world.
     */
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    @WebMethod(operationName = "GetWeather")
    public java.lang.String getWeather(
        @WebParam(partName = "CityName", name = "CityName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String cityName,
        @WebParam(partName = "CountryName", name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String countryName
    );

    /**
     * Get all major cities by country name(full / part).
     */
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    @WebMethod(operationName = "GetCitiesByCountry")
    public java.lang.String getCitiesByCountry(
        @WebParam(partName = "CountryName", name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String countryName
    );
}
