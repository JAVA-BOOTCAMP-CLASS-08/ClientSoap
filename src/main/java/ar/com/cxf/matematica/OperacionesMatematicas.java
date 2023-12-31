package ar.com.cxf.matematica;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-11-07T18:54:32.713-03:00
 * Generated source version: 4.0.3
 *
 */
@WebService(targetNamespace = "http://cxf.com.ar/matematica", name = "OperacionesMatematicas")
@XmlSeeAlso({ObjectFactory.class})
public interface OperacionesMatematicas {

    @WebMethod
    @RequestWrapper(localName = "producto", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.Producto")
    @ResponseWrapper(localName = "productoResponse", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.ProductoResponse")
    @WebResult(name = "resultadoProducto", targetNamespace = "")
    public int producto(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebMethod
    @RequestWrapper(localName = "resta", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.RestaResponse")
    @WebResult(name = "resultadoResta", targetNamespace = "")
    public int resta(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebMethod
    @RequestWrapper(localName = "division", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.DivisionResponse")
    @WebResult(name = "resultadoDivision", targetNamespace = "")
    public int division(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    ) throws DivisionPorZeroException;

    @WebMethod
    @RequestWrapper(localName = "suma", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://cxf.com.ar/matematica", className = "ar.com.cxf.matematica.SumaResponse")
    @WebResult(name = "resultadoSuma", targetNamespace = "")
    public int suma(

        @WebParam(name = "sumando1", targetNamespace = "")
        int sumando1,
        @WebParam(name = "sumando2", targetNamespace = "")
        int sumando2
    );
}
