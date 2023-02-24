package org.acme.service.impl;

import org.acme.dto.ResponseDto;
import org.acme.entity.ClienteEntity;
import org.acme.repository.ClienteRepository;
import org.acme.service.ClienteService;


import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService {


    @Inject
    ClienteRepository clientRepository;
    @Override
    public Uni<ResponseDto> add(ClienteEntity cliente) {
        try {
            if(cliente.getPass().length() == 6){

              
            return clientRepository.add(cliente)
                    .map(client -> new ResponseDto(201, "Exito", client))
                    .onFailure().recoverWithItem(error -> new ResponseDto(400, "Error", error.getMessage()));
            } else{
                throw new UnsupportedOperationException("Error Contrasena debe ser de 6 digitos'");               
            }   
        }catch (Exception ex) {
            return Uni.createFrom().item(new ResponseDto(400, "Error", ex.getMessage()));
        }       
    }

    @Override
    public Uni<ResponseDto> listAll() {
        try {
            return clientRepository.listAll()
                    .map(client -> new ResponseDto(200, "Lista de Clientes en Billetera", client))
                    .onFailure().recoverWithItem(error -> new ResponseDto(400, "Error - No se puede mostrar clientes de billetera",
                            error.getMessage()));
        } catch (Exception ex) {
            return Uni.createFrom().item(new ResponseDto(400, "Error - No se puede mostrar clientes de billetera", ex.getMessage()));
        }
    }

    
}
