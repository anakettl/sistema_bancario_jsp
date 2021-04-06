package classes;

import java.util.LinkedList;

public class Colecao {
    private LinkedList<Cliente> clientes;

    public Colecao() {}

    public LinkedList<Cliente> carregaClientes() {
        this.clientes = new LinkedList();

        Cliente cliente1 = new Cliente(1, "Giovana Lima", "01/09/1980", 1, "212312312", "giovana@gmail.com", "983274920");
        Cliente cliente2 = new Cliente(2, "Paula Soares", "21/04/1970", 2, "876312312", "paula@gmail.com", "888274920");
        Cliente cliente3 = new Cliente(3, "Marilia Lima", "06/05/1999", 3, "666312312", "marilia@gmail.com", "111274920");

        this.clientes.add(cliente1);
        this.clientes.add(cliente2);
        this.clientes.add(cliente3);

        System.out.println("Carrega clientes");

        for (Cliente cliente: clientes) {
            System.out.println(cliente.toString());
        }

        return clientes;
    }

}
