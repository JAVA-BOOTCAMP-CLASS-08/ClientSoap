
package ar.com.cxf.matematica;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sumando1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sumando2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "sumando1",
    "sumando2"
})
public class Suma {

    protected int sumando1;
    protected int sumando2;

    /**
     * Obtiene el valor de la propiedad sumando1.
     * 
     */
    public int getSumando1() {
        return sumando1;
    }

    /**
     * Define el valor de la propiedad sumando1.
     * 
     */
    public void setSumando1(int value) {
        this.sumando1 = value;
    }

    /**
     * Obtiene el valor de la propiedad sumando2.
     * 
     */
    public int getSumando2() {
        return sumando2;
    }

    /**
     * Define el valor de la propiedad sumando2.
     * 
     */
    public void setSumando2(int value) {
        this.sumando2 = value;
    }

}
