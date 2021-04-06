package classes;

import dao.PessoaDAO;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String dt_nasc;

    public Pessoa() {}

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String dt_nasc) {
        this.nome = nome;
        this.dt_nasc = dt_nasc;
    }

    public Pessoa(int idPessoa, String nome, String dt_nasc) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dt_nasc = dt_nasc;
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
        this.nome = nome;
    }

    public void setDt_nasc(String dt_nasc) {
        this.dt_nasc = dt_nasc;
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
