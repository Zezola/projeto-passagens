package br.com.passagens.client;

import br.com.passagens.entity.Cliente;
import br.com.passagens.service.ClienteService;

import java.util.List;
import java.util.Scanner;

public class Login  {
    private boolean logado = false;
    private Scanner inputUsuario = new Scanner(System.in);
    private ClienteService clienteService = new ClienteService();
    private List<Cliente> clientes = clienteService.getClientes();


    public String coletaInputCpf() {
        System.out.println("Cpf");
        String cpfCliente = inputUsuario.next();
        return cpfCliente;
    }

    public String coletaInputNome() {
        System.out.println("Nome");
        String nomeCliente = inputUsuario.next();
        return nomeCliente;
    }

    public boolean logar(String cpfCliente, String nomeCliente) {
        System.out.println(clientes);
        for(Cliente cliente: clientes) {
            System.out.println(cliente.getNome());
            if (cpfCliente.equals(cliente.getCpf()) && nomeCliente.equals(cliente.getNome())) {
                System.out.println("AUTENTICADO");
                return true;
            }
        }
        System.out.println("CONTA ERRADA");
        return false;
    }




}
