//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.29 à 06:42:21 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "getDeleteBookRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:42:21+01:00", comments = "JAXB RI v2.3.2")
public class GetDeleteBookRequest {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:42:21+01:00", comments = "JAXB RI v2.3.2")
    protected long id;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:42:21+01:00", comments = "JAXB RI v2.3.2")
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:42:21+01:00", comments = "JAXB RI v2.3.2")
    public void setId(long value) {
        this.id = value;
    }

}
