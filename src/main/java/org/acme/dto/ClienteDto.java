package org.acme.dto;

import lombok.Data;

@Data
public class ClienteDto {
    private String pass;
    private String nombre;
    private String apellidos;
    private String tipoDoc;
    private String numeroDoc;
    private String codigoBilletera;
    private String codigoCliente;
    private String celular;
    private Double monto;
    private String estadoCliente;
    private String estadoBilletera;
}
