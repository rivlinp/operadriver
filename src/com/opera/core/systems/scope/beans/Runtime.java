//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.11 at 10:36:39 AM CET 
//


package com.opera.core.systems.scope.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Runtime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Runtime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}runtime-id"/>
 *         &lt;element ref="{}html-frame-path"/>
 *         &lt;element ref="{}window-id"/>
 *         &lt;element ref="{}object-id"/>
 *         &lt;element ref="{}uri"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Runtime", propOrder = {
    "runtimeId",
    "htmlFramePath",
    "windowId",
    "objectId",
    "uri"
})
public class Runtime {

    @XmlElement(name = "runtime-id")
    protected int runtimeId;
    @XmlElement(name = "html-frame-path", required = true)
    protected String htmlFramePath;
    @XmlElement(name = "window-id")
    protected int windowId;
    @XmlElement(name = "object-id")
    protected int objectId;
    @XmlElement(required = true)
    protected String uri;

    /**
     * Gets the value of the runtimeId property.
     * 
     */
    public int getRuntimeId() {
        return runtimeId;
    }

    /**
     * Sets the value of the runtimeId property.
     * 
     */
    public void setRuntimeId(int value) {
        this.runtimeId = value;
    }

    /**
     * Gets the value of the htmlFramePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlFramePath() {
        return htmlFramePath;
    }

    /**
     * Sets the value of the htmlFramePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlFramePath(String value) {
        this.htmlFramePath = value;
    }

    /**
     * Gets the value of the windowId property.
     * 
     */
    public int getWindowId() {
        return windowId;
    }

    /**
     * Sets the value of the windowId property.
     * 
     */
    public void setWindowId(int value) {
        this.windowId = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     */
    public int getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     */
    public void setObjectId(int value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}