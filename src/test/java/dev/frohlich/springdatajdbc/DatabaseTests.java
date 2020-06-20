package dev.frohlich.springdatajdbc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.UUID;

@SpringBootTest
public class DatabaseTests {

    @Test
    public void test () {

        var carrinho = Carrinho.builder()
                .clientId(UUID.randomUUID())
                .build();

        carrinho = carrinho.adicionarItemAoCarrinho();

    }

}
