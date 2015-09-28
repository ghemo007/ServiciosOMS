/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.serviciosoms;

/**
 *
 * @author GermanO
 */
public class transporte 
{
    private String codigoTransporte;
    private String descripcionTransporte;
    private Double precioTransporte;

    public String getcodigoTransporte() 
    {
        return codigoTransporte;
    }
    
    public String getdescripcionTransporte() 
    {
        return descripcionTransporte;
    }

    public Double getprecioTransporte() 
    {
        return precioTransporte;
    }
    public void setcodigoTransporte(String codigoTransporte) 
    {
        this.codigoTransporte = codigoTransporte;
    }
    
    public void setdescripcionTransporte( String descripcionTransporte) 
    {
        this.descripcionTransporte = descripcionTransporte;
    }
    public void setprecioTransporte( Double precioTransporte) 
    {
        this.precioTransporte = precioTransporte;
    }    
}
