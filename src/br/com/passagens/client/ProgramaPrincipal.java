package br.com.passagens.client;

import br.com.passagens.entity.Passagem;
import br.com.passagens.service.ClienteService;
import br.com.passagens.service.PassagemService;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        System.out.println("**** ESCOLHA UMA OPCAO ****");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Visualizar Rotas");
        System.out.println("3 - Reservar passagens");
        System.out.println("4 - Consultar reservas");

        CadastroDeClientes cadastroDeClientes = new CadastroDeClientes();
        ReservaDePassagens reservaDePassagens = new ReservaDePassagens();
        ClienteService clienteService = new ClienteService();
        PassagemService passagemService = new PassagemService();
        Passagem passagem = new Passagem();
        Login login = new Login();
        while (true) {

            int opcaoEscolhida;
            Scanner op = new Scanner(System.in);
            System.out.println("SELECIONE UMA OPCAO OU DIGITE 0 PARA SAIR: ");
            opcaoEscolhida = op.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    cadastroDeClientes.cadastrarDadosDoCliente();

                    break;
                case 2:
                    passagem.visualizarRotas();
                    break;

                case 3:
                    System.out.println("Entre com os dados do usuario cadastrado");
                    login.logar(login.coletaInputCpf(), login.coletaInputNome());
                    break;
                case 4:
                    passagemService.exibirReservas();
                    break;
                default:
                    System.out.println("FIM");
        }

        }

    }


}
