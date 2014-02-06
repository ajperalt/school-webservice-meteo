
package com.superwebservice.publictypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lieu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_heure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visibilite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="point_rosee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="humidite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unique_token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lieu",
    "dateHeure",
    "vent",
    "visibilite",
    "ciel",
    "temperature",
    "pointRosee",
    "humidite",
    "pression",
    "status",
    "uniqueToken"
})
public class ObtenirSituationMeteoResponse {

    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String lieu;
    @XmlElement(name = "date_heure", namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String dateHeure;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String vent;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String visibilite;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String ciel;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String temperature;
    @XmlElement(name = "point_rosee", namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String pointRosee;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String humidite;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String pression;
    @XmlElement(namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String status;
    @XmlElement(name = "unique_token", namespace = "http://www.superwebservice.com/publictypes", required = true)
    protected String uniqueToken;

    /**
     * Obtient la valeur de la propriété lieu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * Définit la valeur de la propriété lieu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieu(String value) {
        this.lieu = value;
    }

    /**
     * Obtient la valeur de la propriété dateHeure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateHeure() {
        return dateHeure;
    }

    /**
     * Définit la valeur de la propriété dateHeure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateHeure(String value) {
        this.dateHeure = value;
    }

    /**
     * Obtient la valeur de la propriété vent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVent() {
        return vent;
    }

    /**
     * Définit la valeur de la propriété vent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVent(String value) {
        this.vent = value;
    }

    /**
     * Obtient la valeur de la propriété visibilite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilite() {
        return visibilite;
    }

    /**
     * Définit la valeur de la propriété visibilite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilite(String value) {
        this.visibilite = value;
    }

    /**
     * Obtient la valeur de la propriété ciel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiel() {
        return ciel;
    }

    /**
     * Définit la valeur de la propriété ciel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiel(String value) {
        this.ciel = value;
    }

    /**
     * Obtient la valeur de la propriété temperature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Définit la valeur de la propriété temperature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

    /**
     * Obtient la valeur de la propriété pointRosee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointRosee() {
        return pointRosee;
    }

    /**
     * Définit la valeur de la propriété pointRosee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointRosee(String value) {
        this.pointRosee = value;
    }

    /**
     * Obtient la valeur de la propriété humidite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidite() {
        return humidite;
    }

    /**
     * Définit la valeur de la propriété humidite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidite(String value) {
        this.humidite = value;
    }

    /**
     * Obtient la valeur de la propriété pression.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPression() {
        return pression;
    }

    /**
     * Définit la valeur de la propriété pression.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPression(String value) {
        this.pression = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété uniqueToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueToken() {
        return uniqueToken;
    }

    /**
     * Définit la valeur de la propriété uniqueToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueToken(String value) {
        this.uniqueToken = value;
    }

}
