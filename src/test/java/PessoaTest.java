import classes.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest{

    private Pessoa pessoa;

    @BeforeEach
    public void setUp() throws Exception{
        pessoa = new Pessoa();
    }

    @Test
    void registerPessoa(){
        pessoa.setIdPessoa(1);
        pessoa.setNome("Flávia");
        pessoa.setDt_nasc("01/01/2011");

        assertNotEquals(0, pessoa.insert());
    }

}
