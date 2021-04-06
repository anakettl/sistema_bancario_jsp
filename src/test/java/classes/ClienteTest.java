package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() throws Exception{
        cliente = new Cliente();
    }

    @Test
    void registerClienteWithoutInvalidCpf(){
        cliente.setIdPessoa(1);
        cliente.setDt_nasc("01/01/2011");
        cliente.setCpf("1243");
        cliente.setEmail("flavia@gmail.com");
        cliente.setTelefone("98475392");

        assertEquals(null, cliente.getCpf());
    }

}
