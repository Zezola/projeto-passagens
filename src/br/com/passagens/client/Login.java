package br.com.passagens.client;

import br.com.passagens.entity.Cliente;
import br.com.passagens.service.ClienteService;

import java.util.Scanner;

public class Login extends ClienteService {
    private boolean logado = false;
    private Scanner inputUsuario = new Scanner(System.in);


    public boolean logar() {
        System.out.println("CPF");
        String cpfCliente = inputUsuario.next();
        System.out.println("NOME");
        String nomeCliente = inputUsuario.next();
        for (Cliente cliente:clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente) && cliente.getCpf().equals(cpfCliente)) {
                logado = true;
                System.out.println("USUARIO AUTENTICADO");
                return logado;
            }
        }
        System.out.println("NOME OU CPF INEXISTENTES");
        return logado;
    }


}
