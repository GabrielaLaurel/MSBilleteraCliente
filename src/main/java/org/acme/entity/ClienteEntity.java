package org.acme.entity;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MongoEntity(collection = "cliente_tarjeta")
public class ClienteEntity extends ReactivePanacheMongoEntity{
    //6 digitoss
    private String pass;
    private String nombre;
    private String apellidos;
    private String tipoDoc;
    private String numeroDoc;
    private String numTelefono; 
    
}
