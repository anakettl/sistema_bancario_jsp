package dao;

import classes.Pessoa;

import java.sql.*;
import java.util.List;

public class PessoaDAO implements GenericDAO<Pessoa>{
    @Override
    public int insert(Pessoa p) {
        System.out.println(p.toString());
        int pk = -1;
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.INSERT_PESSOA.getSql(),
                            Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDt_nasc());
            System.out.println(stmt);
            stmt.execute();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next())  pk= chaves.getInt(1);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Exce��o no c�digo - Pessoa insert");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Classe n�o encontrada - Pessoa insert! em PessoaDAO");
        }
        return pk;
    }

    @Override
    public List<Pessoa> listAll() {return null;}

    @Override
    public int update(Pessoa p){return -1;}

    @Override
    public int delete(Pessoa pessoa){
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.DELETE_PESSOA.getSql())){
            stmt.setInt(1, pessoa.getIdPessoa());

            if(stmt.execute()) return 1;
        }catch(SQLException e){ e.printStackTrace(); System.out.println("Exce��o SQL - delete Pessoa");
        }catch(Exception e){  e.printStackTrace(); System.out.println("Exce��o no c�digo - delete Pessoa");
        }
        return -1;
    }

    @Override
    public Pessoa findByID(int id){
        Pessoa p = null;
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.FIND_BY_ID_PESSOA.getSql())){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                String dt_nasc = rs.getString("dt_nasc");
                p = new Pessoa(nome, dt_nasc);
            }
        }catch(SQLException e){ System.out.println("Exce��o SQL - findById Pessoa");
        }catch(Exception e){  System.out.println("Exce��o no c�digo - findById Pessoa");
        }
        return p;
    }


}
