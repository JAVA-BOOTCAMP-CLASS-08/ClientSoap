
package ar.com.cxf.matematica;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para restaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="restaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoResta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restaResponse", propOrder = {
    "resultadoResta"
})
public class RestaResponse {

    protected int resultadoResta;

    /**
     * Obtiene el valor de la propiedad resultadoResta.
     * 
     */
    public int getResultadoResta() {
        return resultadoResta;
    }

    /**
     * Define el valor de la propiedad resultadoResta.
     * 
     */
    public void setResultadoResta(int value) {
        this.resultadoResta = value;
    }

}
