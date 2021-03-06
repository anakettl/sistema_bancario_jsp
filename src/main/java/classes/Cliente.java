package classes;

import dao.ClienteDAO;

import java.util.List;

public class Cliente extends Pessoa implements ValidaCliente{
    private int idCliente;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente() {}

    public Cliente(int idPessoa, String nome, String dt_nasc, int idCliente, String cpf, String email, String telefone) {
        super(idPessoa, nome, dt_nasc);
        this.idCliente = idCliente;
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        if (this.validarEmail(email)) {
            this.email = email;
        }
    }

    public void setTelefone(String telefone) {
        if (this.validarTelefone(telefone)) {
            this.telefone = telefone;
        }
    }

    public void setCpf(String cpf) {
        if (this.validarCpf(cpf)) {
            this.cpf = cpf;
        }
    }




    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                " Pessoa{ idPessoa= " + getIdPessoa() +
                " nome= " + getNome() +
                " dt_nasc= " + getDt_nasc() +
                '}';
    }

    public int insert() {
        return new ClienteDAO().insert(this);
    }
    public List<Cliente> listAll(){
        return new ClienteDAO().listAll();
    }
}
