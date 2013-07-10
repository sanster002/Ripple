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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}entry"/>
 *         &lt;element ref="{}comment"/>
 *       &lt;/choice>
 *       &lt;attribute name="letter" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="tt" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entryOrComment"
})
@XmlRootElement(name = "alpha")
public class Alpha {

    @XmlElements({
        @XmlElement(name = "entry", type = Entry.class),
        @XmlElement(name = "comment", type = Comment.class)
    })
    protected List<Object> entryOrComment;
    @XmlAttribute(name = "letter", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String letter;
    @XmlAttribute(name = "tt")
    @XmlSchemaType(name = "anySimpleType")
    protected String tt;

    /**
     * Gets the value of the entryOrComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryOrComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryOrComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entry }
     * {@link Comment }
     * 
     * 
     */
    public List<Object> getEntryOrComment() {
        if (entryOrComment == null) {
            entryOrComment = new ArrayList<Object>();
        }
        return this.entryOrComment;
    }

    /**
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetter(String value) {
        this.letter = value;
    }

    /**
     * Gets the value of the tt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTt() {
        return tt;
    }

    /**
     * Sets the value of the tt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTt(String value) {
        this.tt = value;
    }

}