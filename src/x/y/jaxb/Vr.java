//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.09 at 04:52:08 PM IST 
//


package x.y.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{}vl"/>
 *         &lt;element ref="{}va"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}pr"/>
 *           &lt;element ref="{}pr_alt" minOccurs="0"/>
 *           &lt;element ref="{}pr_ipa" minOccurs="0"/>
 *           &lt;element ref="{}pr_wod" minOccurs="0"/>
 *           &lt;element ref="{}sound" minOccurs="0"/>
 *         &lt;/sequence>
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
    "vlAndVaAndPr"
})
@XmlRootElement(name = "vr")
public class Vr {

    @XmlElements({
        @XmlElement(name = "vl", required = true, type = Vl.class),
        @XmlElement(name = "va", required = true, type = Va.class),
        @XmlElement(name = "pr", required = true, type = Pr.class),
        @XmlElement(name = "pr_alt", required = true, type = PrAlt.class),
        @XmlElement(name = "pr_ipa", required = true, type = PrIpa.class),
        @XmlElement(name = "pr_wod", required = true, type = PrWod.class),
        @XmlElement(name = "sound", required = true, type = Sound.class)
    })
    protected List<Object> vlAndVaAndPr;

    /**
     * Gets the value of the vlAndVaAndPr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlAndVaAndPr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVlAndVaAndPr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vl }
     * {@link Va }
     * {@link Pr }
     * {@link PrAlt }
     * {@link PrIpa }
     * {@link PrWod }
     * {@link Sound }
     * 
     * 
     */
    public List<Object> getVlAndVaAndPr() {
        if (vlAndVaAndPr == null) {
            vlAndVaAndPr = new ArrayList<Object>();
        }
        return this.vlAndVaAndPr;
    }

}
