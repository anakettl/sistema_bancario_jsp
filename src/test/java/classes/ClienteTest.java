package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente();
    }

    @Test
    void registerClienteWithInvalidCpf(){
        cliente.setCpf("1243");

        assertEquals(null, cliente.getCpf());
    }

    @Test
    void registerClienteWithInvalidEmail(){
        cliente.setEmail("");

        assertEquals(null, cliente.getEmail());
    }

    @Test
    void registerClienteWithInvalidTelefone(){
        cliente.setTelefone("");

        assertEquals(null, cliente.getTelefone());
    }

}
