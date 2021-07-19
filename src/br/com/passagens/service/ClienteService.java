package br.com.passagens.service;

import br.com.passagens.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {


    private static List<Cliente> clientes = new ArrayList<Cliente>();

    public List<Cliente> getClientes () {
        return clientes;
    }


    public boolean addCliente(Cliente cliente) {
      return  clientes.add(cliente);
    }

    public void exibirClientes() {
        for (Cliente cliente: clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
