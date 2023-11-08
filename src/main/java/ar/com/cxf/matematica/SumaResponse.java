
package ar.com.cxf.matematica;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sumaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sumaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoSuma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumaResponse", propOrder = {
    "resultadoSuma"
})
public class SumaResponse {

    protected int resultadoSuma;

    /**
     * Obtiene el valor de la propiedad resultadoSuma.
     * 
     */
    public int getResultadoSuma() {
        return resultadoSuma;
    }

    /**
     * Define el valor de la propiedad resultadoSuma.
     * 
     */
    public void setResultadoSuma(int value) {
        this.resultadoSuma = value;
    }

}
