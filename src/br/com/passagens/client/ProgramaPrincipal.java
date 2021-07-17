package br.com.passagens.client;

import br.com.passagens.service.ClienteService;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        System.out.println("**** ESCOLHA UMA OPCAO ****");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Fazer login");
        System.out.println("3 - Reservar passagens");
        System.out.println("4 - Consultar reservas");

        CadastroDeClientes cadastroDeClientes = new CadastroDeClientes();
        ReservaDePassagens reservaDePassagens = new ReservaDePassagens();
        ClienteService clienteService = new ClienteService();
        Login login = new Login();

        int opcaoEscolhida;
        Scanner op = new Scanner(System.in);
        System.out.println("SELECIONE UMA OPCAO: ");
        opcaoEscolhida = op.nextInt();
        switch (opcaoEscolhida) {
            case 1:
                cadastroDeClientes.cadastrarDadosDoCliente();
                clienteService.exibirClientes();
                login.logar();
                break;
            case 2:
                break;
            default:
                System.out.println("FIM");
        }

    }


}
