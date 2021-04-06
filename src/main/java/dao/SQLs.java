package dao;

public enum SQLs {
    INSERT_PESSOA("insert into pessoa(nome, dt_nasc) values (?, ?)"),
    FIND_BY_ID_PESSOA("select * from pessoa where id_pessoa=?"),
    DELETE_PESSOA("delete from pessoa where id_pessoa=? "),
    INSERT_CLIENTE("insert into cliente(cpf, email, telefone, id_pessoa) values (?, ?, ?, ?)"),
    DELETE_CLIENTE("delete from cliente where id_cliente=? "),
    UPDATE_CLIENTE("update cliente set cpf=?, email=?, telefone=? where id_cliente=?"),
    FIND_BY_ID_CLIENTE("select * from cliente where id_cliente=?"),
    FIND_CLIENTE_BY_NOME("select * from cliente inner join pessoa on cliente.id_pessoa = pessoa.id_pessoa where nome like '%' ? '%' "),
    FIND_CLIENTE_BY_CPF("select * from cliente where cpf like '%' ? '%'"),
    LISTALL_CLIENTE("select * from cliente");




    private final String sql;
    SQLs(String sql){
        this.sql = sql;

    }

    public String getSql() {
        return sql;
    }
}
