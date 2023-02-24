package org.acme.client;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import org.acme.client.dto.BilleteraDto;
import org.acme.dto.ResponseDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;

@RegisterRestClient
@Path("/api/wallet")
public interface WalletClient {

    @POST
    @Transactional
    Uni<ResponseDto> add(BilleteraDto billeteraDto);

  
}
