package classes;

public interface ValidaPessoa {
    default boolean validarNome(String nome){
        if(nome != null) return true;
        return false;
    }
}
