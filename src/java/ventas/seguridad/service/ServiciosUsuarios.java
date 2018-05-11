/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.seguridad.service;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import ventas.model.entities.Usuario;
import ventas.seguridad.model.ManagerSeguridad;
import ventas.seguridad.model.dto.LoginDTO;

/**
 *
 * @author Brownie
 */
@WebService(serviceName = "ServiciosUsuarios")
public class ServiciosUsuarios {

    @EJB
    private ManagerSeguridad ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "findAllUsuario")
    public List<Usuario> findAllUsuario() {
        return ejbRef.findAllUsuario();
    }
    
}
