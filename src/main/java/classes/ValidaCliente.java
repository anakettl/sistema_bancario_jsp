package classes;

public interface ValidaCliente {
    default boolean validarCpf(String cpf){
        if(cpf.length() == 11) return true;
        return false;
    }

    default boolean validarEmail(String email){
        if(email != "") return true;
        return false;
    }

    default boolean validarTelefone(String telefone){
        if(telefone != "") return true;
        return false;
    }
}
