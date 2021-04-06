package classes;

public interface ValidaPessoa {
    default boolean validarNome(String nome){
        if(nome != null) return true;
        return false;
    }

    default boolean validarDtNasc(String dt_nasc){
        if(dt_nasc != null) return true;
        return false;
    }
}
