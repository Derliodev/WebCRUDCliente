/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author derliodev
 */

@WebService
public class WSCliente {
    
    /*Metodo de consulta de cliente*/
    @WebMethod(operationName = "consultarCliente")
    public String consultarCliente(@WebParam(name = "rut") int rut){
        return "CC";
    }
    
    /*Metodo de agregar Cliente*/
    @WebMethod(operationName = "agregarCliente")
    public String agregarCliente(
            @WebParam(name = "rut") int rut,
            @WebParam(name = "nombres") String nombres,
            @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "proveedorCodigo") int proveedorCodigo){
        return "AC";
    }
    
    /*Metodo de modificar Cliente*/
    @WebMethod(operationName = "modificarCliente")
    public String modificarCliente(
            @WebParam(name = "rut") int rut,
            @WebParam(name = "nombres") String nombres,
            @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "proveedorCodigo") int proveedorCodigo){
        return "MC";
    }
    
}
