/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.serviciosoms;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author GermanO
 */
@WebService(serviceName = "ws_transporte")
public class ws_transporte 
{


    
    @WebMethod(operationName = "listarTransportes")
    public List<transporte> listarTransportes() 
    {
        List<transporte> lista = new ArrayList<transporte>();
        
        transporte t = new transporte();
        //u.setUsuarioid(rs.getInt("usuario_id"));
        //u.setUsuario(rs.getString("usuario"));
        //u.setClave(rs.getString("clave"));
        //u.setEstado(rs.getString("estado"));
        t.setcodigoTransporte("1");
        t.setdescripcionTransporte("tren");
        t.setprecioTransporte(5.2);
        lista.add(t);
        
        transporte t1 = new transporte();
        //u.setUsuarioid(rs.getInt("usuario_id"));
        //u.setUsuario(rs.getString("usuario"));
        //u.setClave(rs.getString("clave"));
        //u.setEstado(rs.getString("estado"));
        t1.setcodigoTransporte("2");
        t1.setdescripcionTransporte("avion");
        t1.setprecioTransporte(18.2);
        lista.add(t1);
        
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarTransporte")
    public List<transporte> consultarTransporte(@WebParam(name = "codigoTransporte") 
            String codigoTransporte) 
    {
        List<transporte> lista = new ArrayList<transporte>();
        
        //TODO write your implementation code here:
        if (codigoTransporte.equals("1"))
        {
            transporte t = new transporte();
            t.setcodigoTransporte("1");
            t.setdescripcionTransporte("tren");
            t.setprecioTransporte(4.2);
            lista.add(t);
            //return lista;
        }
        if (codigoTransporte.equals("2"))
        {
            transporte t1 = new transporte();
            t1.setcodigoTransporte("2");
            t1.setdescripcionTransporte("avion");
            t1.setprecioTransporte(18.2);
            lista.add(t1);
            //return lista;
        }
        return lista;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarTransportes")
    public String insertarTransportes(@WebParam(name = "codigoTransporte") String codigoTransporte, @WebParam(name = "descripcionTransporte") String descripcionTransporte, @WebParam(name = "precioTransporte") String precioTransporte) {
        //TODO write your implementation code here:
        return null;
    }
   
    
}
