package br.com.passagens.client;

import br.com.passagens.entity.Cliente;
import br.com.passagens.service.ClienteService;

import java.util.Scanner;

public class CadastroDeClientes {


    private ClienteService clienteService = new ClienteService();
    private Scanner cadastroInput = new Scanner(System.in);
    private String cpf;
    private String nome;

    public void cadastrarDadosDoCliente() {
        System.out.println("CPF");
        cpf = cadastroInput.next();
        System.out.println("NOME");
        nome = cadastroInput.next();
        Cliente clienteModel = new Cliente(nome, cpf);
        clienteService.addCliente(clienteModel);

    }



}
