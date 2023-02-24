package org.acme.repository;
import java.util.List;

import org.acme.entity.ClienteEntity;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository {
    
    public Uni<ClienteEntity> add(ClienteEntity client) {
        return client.persist();
    }

    public Uni<List<ClienteEntity>> listAll() {
        return ClienteEntity.listAll(); 
    }
    public Uni<ClienteEntity> findId(String id) {
        return ClienteEntity.findById(id);
    }
    public Uni<ClienteEntity> update(ClienteEntity client) {
        return client.update();
    }

}
