
package ar.com.cxf.matematica;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para divisionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="divisionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoDivision" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divisionResponse", propOrder = {
    "resultadoDivision"
})
public class DivisionResponse {

    protected int resultadoDivision;

    /**
     * Obtiene el valor de la propiedad resultadoDivision.
     * 
     */
    public int getResultadoDivision() {
        return resultadoDivision;
    }

    /**
     * Define el valor de la propiedad resultadoDivision.
     * 
     */
    public void setResultadoDivision(int value) {
        this.resultadoDivision = value;
    }

}
