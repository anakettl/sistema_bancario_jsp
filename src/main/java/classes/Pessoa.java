package classes;

import dao.PessoaDAO;

public class Pessoa implements ValidaPessoa{
    private int idPessoa;
    private String nome;
    private String dt_nasc;

    public Pessoa() {}

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public Pessoa(String nome, String dt_nasc) {
        this.setNome(nome);
        this.setDt_nasc(dt_nasc);
    }

    public Pessoa(int idPessoa, String nome, String dt_nasc) {
        this.idPessoa = idPessoa;
        this.setNome(nome);
        this.setDt_nasc(dt_nasc);
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getDt_nasc() {
        return dt_nasc;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public void setNome(String nome) {
        if (this.validarNome(nome)) {
            this.nome = nome;
        }
    }

    public void setDt_nasc(String dt_nasc) {
        if (this.validarDtNasc(dt_nasc)) {
            this.dt_nasc = dt_nasc;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", dt_nasc='" + dt_nasc + '\'' +
                '}';
    }

    public int insert() {
        return new PessoaDAO().insert(this);
    }
}
