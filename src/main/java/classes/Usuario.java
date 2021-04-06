package classes;

import java.util.LinkedList;

public class Usuario {
    private String email;
    private String senha;

    public Usuario() { }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public boolean autenticar(LinkedList<Usuario> usuarios, String email, String senha) {
        criarUsuarios(usuarios);
        for (Usuario usuario : usuarios) {
            if (usuario.email.equals(email) && usuario.senha.equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    public LinkedList<Usuario> criarUsuarios(LinkedList<Usuario> usuarios){
        usuarios.add(new Usuario("mariasilva@gmail.com", "12345"));
        usuarios.add(new Usuario("claudiasilva@gmail.com", "54321"));
        usuarios.add(new Usuario("verasilva@gmail.com", "09876"));

        return usuarios;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
