package classes;

public interface ValidaCliente {
    default boolean validarCpf(String cpf){
        if(cpf.length() == 11) return true;
        return false;
    }
}
