import classes.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() throws Exception{
        cliente = new Cliente();
    }

    @Test
    void registerCliente(){
        cliente.setIdPessoa(1);
        cliente.setNome("Flávia");
        cliente.setDt_nasc("01/01/2011");
        cliente.setCpf("124345332");
        cliente.setEmail("flavia@gmail.com");
        cliente.setTelefone("98475392");

        assertNotEquals(0, cliente.insert());
    }

    @Test
    void listAllCliente(){
        assertNotEquals(0, cliente.listAll().size());
    }
}
