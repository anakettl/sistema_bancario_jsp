package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest{

    private Pessoa pessoa;

    @BeforeEach
    public void setUp() throws Exception {
        pessoa = new Pessoa();
    }

    @Test
    void registerPessoaWithInvalidName(){
        pessoa.setNome("");

        assertEquals("", pessoa.getNome());
    }

    @Test
    void registerPessoaWithInvalidDtNasc(){
        pessoa.setDt_nasc("");

        assertEquals("", pessoa.getDt_nasc());
    }

}
