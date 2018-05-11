
package ventas.cliente.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ventas.cliente.servicio package. 
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

    private final static QName _FindAllUsuario_QNAME = new QName("http://service.seguridad.ventas/", "findAllUsuario");
    private final static QName _FindAllUsuarioResponse_QNAME = new QName("http://service.seguridad.ventas/", "findAllUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ventas.cliente.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllUsuario }
     * 
     */
    public FindAllUsuario createFindAllUsuario() {
        return new FindAllUsuario();
    }

    /**
     * Create an instance of {@link FindAllUsuarioResponse }
     * 
     */
    public FindAllUsuarioResponse createFindAllUsuarioResponse() {
        return new FindAllUsuarioResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.seguridad.ventas/", name = "findAllUsuario")
    public JAXBElement<FindAllUsuario> createFindAllUsuario(FindAllUsuario value) {
        return new JAXBElement<FindAllUsuario>(_FindAllUsuario_QNAME, FindAllUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.seguridad.ventas/", name = "findAllUsuarioResponse")
    public JAXBElement<FindAllUsuarioResponse> createFindAllUsuarioResponse(FindAllUsuarioResponse value) {
        return new JAXBElement<FindAllUsuarioResponse>(_FindAllUsuarioResponse_QNAME, FindAllUsuarioResponse.class, null, value);
    }

}
