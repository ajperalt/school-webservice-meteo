
package com.superwebservice.publictypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� lieu.
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
     * D�finit la valeur de la propri�t� lieu.
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
     * Obtient la valeur de la propri�t� dateHeure.
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
     * D�finit la valeur de la propri�t� dateHeure.
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
     * Obtient la valeur de la propri�t� vent.
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
     * D�finit la valeur de la propri�t� vent.
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
     * Obtient la valeur de la propri�t� visibilite.
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
     * D�finit la valeur de la propri�t� visibilite.
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
     * Obtient la valeur de la propri�t� ciel.
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
     * D�finit la valeur de la propri�t� ciel.
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
     * Obtient la valeur de la propri�t� temperature.
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
     * D�finit la valeur de la propri�t� temperature.
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
     * Obtient la valeur de la propri�t� pointRosee.
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
     * D�finit la valeur de la propri�t� pointRosee.
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
     * Obtient la valeur de la propri�t� humidite.
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
     * D�finit la valeur de la propri�t� humidite.
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
     * Obtient la valeur de la propri�t� pression.
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
     * D�finit la valeur de la propri�t� pression.
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
     * Obtient la valeur de la propri�t� status.
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
     * D�finit la valeur de la propri�t� status.
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
     * Obtient la valeur de la propri�t� uniqueToken.
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
     * D�finit la valeur de la propri�t� uniqueToken.
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
