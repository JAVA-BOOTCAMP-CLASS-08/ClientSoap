
package ar.com.cxf.matematica;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.cxf.matematica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Division_QNAME = new QName("http://cxf.com.ar/matematica", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://cxf.com.ar/matematica", "divisionResponse");
    private final static QName _Producto_QNAME = new QName("http://cxf.com.ar/matematica", "producto");
    private final static QName _ProductoResponse_QNAME = new QName("http://cxf.com.ar/matematica", "productoResponse");
    private final static QName _Resta_QNAME = new QName("http://cxf.com.ar/matematica", "resta");
    private final static QName _RestaResponse_QNAME = new QName("http://cxf.com.ar/matematica", "restaResponse");
    private final static QName _Suma_QNAME = new QName("http://cxf.com.ar/matematica", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://cxf.com.ar/matematica", "sumaResponse");
    private final static QName _DivisionPorCero_QNAME = new QName("http://cxf.com.ar/matematica", "DivisionPorCero");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.cxf.matematica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link ProductoResponse }
     * 
     */
    public ProductoResponse createProductoResponse() {
        return new ProductoResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link DivisionPorCero }
     * 
     */
    public DivisionPorCero createDivisionPorCero() {
        return new DivisionPorCero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "productoResponse")
    public JAXBElement<ProductoResponse> createProductoResponse(ProductoResponse value) {
        return new JAXBElement<ProductoResponse>(_ProductoResponse_QNAME, ProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionPorCero }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionPorCero }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxf.com.ar/matematica", name = "DivisionPorCero")
    public JAXBElement<DivisionPorCero> createDivisionPorCero(DivisionPorCero value) {
        return new JAXBElement<DivisionPorCero>(_DivisionPorCero_QNAME, DivisionPorCero.class, null, value);
    }

}
