package org.acme.resource;

import org.acme.client.dto.BilleteraDto;
import org.acme.dto.ClienteDto;
import org.acme.dto.ResponseDto;
import org.acme.entity.ClienteEntity;
import org.acme.service.ClienteService;
import org.eclipse.microprofile.openapi.annotations.Operation;


import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/billetera/client")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    ClienteService clientService;

    @POST
    @Operation(summary = "Registrar cliente billetera ",description = "Registrar en billetera")
    public Uni<ResponseDto> add(ClienteEntity cliente) {
        return clientService.add(cliente);
    }
    @Path("/wallet")
    @POST
    @Operation(summary = "Registrar cliente billetera ",description = "Registrar en billetera")
    public Uni<ResponseDto> addBilletera(BilleteraDto dto) {
        System.out.println("controller addbillere");
        System.out.println();
        return clientService.addBilletera(dto);
    }

    @GET
    @Operation(summary = "Obtener clientes",description = "Obtiener los clientes totales con billeteras")
    public Uni<ResponseDto> listAll() {
        return clientService.listAll();
    }

}
