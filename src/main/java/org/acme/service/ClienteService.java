package org.acme.service;

import org.acme.client.dto.BilleteraDto;
import org.acme.dto.ResponseDto;
import org.acme.entity.ClienteEntity;

import io.smallrye.mutiny.Uni;

public interface ClienteService {

    Uni<ResponseDto> add(ClienteEntity cliente);
    Uni<ResponseDto> addBilletera(BilleteraDto dto);
    Uni<ResponseDto> listAll();

}
