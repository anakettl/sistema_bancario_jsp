package dao;

import classes.Cliente;
import classes.Pessoa;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ClienteDAO implements GenericDAO<Cliente>{

    @Override
    public int insert(Cliente c) {
        int pk = -1;
        Pessoa p = new Pessoa(c.getNome(), c.getDt_nasc());
        int idPessoa = new PessoaDAO().insert(p);
        if(idPessoa == -1) return -1;
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.INSERT_CLIENTE.getSql(),
                            Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1, c.getCpf());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());
            stmt.setInt(4, idPessoa);
            stmt.execute();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next())  pk = chaves.getInt(1);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Exce��o - insert Cliente");
        }catch(ClassNotFoundException e){
            System.out.println("Classe n�o encontrada - insert Cliente!");
        }
        return pk;
    }

    @Override
    public  List<Cliente> listAll() {
        List<Cliente> lista = new LinkedList<>();
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.LISTALL_CLIENTE.getSql())){

            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Integer id_cliente = rs.getInt("id_cliente");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                Pessoa pessoa = new PessoaDAO().findByID(rs.getInt("id_pessoa"));

                lista.add(new Cliente(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getDt_nasc(), id_cliente, cpf, email, telefone));
            }
            return lista;
        }catch(SQLException e){ System.out.println("Exce��o SQL - listAll Cliente");
        }catch(Exception e){  System.out.println("Exce��o no c�digo - listAll Cliente!");
        }
        return null;
    }

    @Override
    public int update(Cliente cliente){
        System.out.println("Entrou no update");
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.UPDATE_CLIENTE.getSql())){

            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getIdCliente());

            if(stmt.execute()) return 1;
        }catch(SQLException e){ e.printStackTrace(); System.out.println("Exceção SQL - update Cliente");
        }catch(Exception e){  e.printStackTrace(); System.out.println("Exceção no codigo - update Cliente");
        }
        return -1;
    }

    @Override
    public int delete(Cliente cliente){
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.DELETE_CLIENTE.getSql())){
            stmt.setInt(1, cliente.getIdCliente());

            Pessoa pessoa = new PessoaDAO().findByID(cliente.getIdPessoa());

            int idPessoa = new PessoaDAO().delete(pessoa);

            if(stmt.execute()) return 1;
        }catch(SQLException e){ e.printStackTrace(); System.out.println("Exce��o SQL - delete Pessoa");
        }catch(Exception e){  e.printStackTrace(); System.out.println("Exce��o no c�digo - delete Cliente");
        }
        return -1;
    }

    @Override
    public Cliente findByID(int id){
        Cliente cliente = null;
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement(SQLs.FIND_BY_ID_CLIENTE.getSql())){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Integer idCliente = rs.getInt("id_cliente");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                Pessoa pessoa = new PessoaDAO().findByID(rs.getInt("id_pessoa"));
                System.out.println("Pessoa do BD = "+ pessoa.toString());
                cliente = new Cliente(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getDt_nasc(), idCliente, cpf, email, telefone);
            }
        }catch(SQLException e){ System.out.println("Exce��o SQL - findById Cliente");
        }catch(Exception e){  System.out.println("Exce��o no c�digo - findById Cliente");
        }
        return cliente;
    }


}


