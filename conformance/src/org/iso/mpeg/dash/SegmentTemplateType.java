//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.23 at 08:13:31 AM MESZ 
//


package org.iso.mpeg.dash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentTemplateType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:dash:schema:mpd:2011}MultipleSegmentBaseType">
 *       &lt;attribute name="media" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initialization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bitstreamSwitching" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentTemplateType")
public class SegmentTemplateType
    extends MultipleSegmentBaseType
{

    @XmlAttribute
    protected String media;
    @XmlAttribute
    protected String index;
    @XmlAttribute(name = "initialization")
    protected String initializationAttribute;
    @XmlAttribute(name = "bitstreamSwitching")
    protected String bitstreamSwitchingAttribute;

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedia(String value) {
        this.media = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the initializationAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitializationAttribute() {
        return initializationAttribute;
    }

    /**
     * Sets the value of the initializationAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitializationAttribute(String value) {
        this.initializationAttribute = value;
    }

    /**
     * Gets the value of the bitstreamSwitchingAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitstreamSwitchingAttribute() {
        return bitstreamSwitchingAttribute;
    }

    /**
     * Sets the value of the bitstreamSwitchingAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitstreamSwitchingAttribute(String value) {
        this.bitstreamSwitchingAttribute = value;
    }

}
