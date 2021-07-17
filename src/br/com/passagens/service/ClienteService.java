package br.com.passagens.service;

import br.com.passagens.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {


    protected List<Cliente> clientes = new ArrayList<Cliente>();





    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void exibirClientes() {
        for (Cliente cliente: clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
