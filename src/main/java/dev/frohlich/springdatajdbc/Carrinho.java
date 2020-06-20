package dev.frohlich.springdatajdbc;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor

public class Carrinho {

    @Builder
    Carrinho (UUID clientId) {
        this.id = UUID.randomUUID();
        this.clientId = clientId;
    }

    UUID id;

    UUID clientId;

    List<Item> listaDeCompra;

    CarrinhoState fase;


    public Carrinho adicionarItemAoCarrinho() {
        return this;
    }

}
