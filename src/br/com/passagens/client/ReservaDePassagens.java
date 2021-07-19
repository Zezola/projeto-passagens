package br.com.passagens.client;

import br.com.passagens.entity.Passagem;
import br.com.passagens.service.PassagemService;

public class ReservaDePassagens {

    private PassagemService passagemService = new PassagemService();
    private Login login = new Login();
    private String cpfCliente;
    private String nomeCliente;

    public void cadastrarPassagem() {
        cpfCliente = login.coletaInputCpf();
        nomeCliente = login.coletaInputNome();
        if (login.logar(cpfCliente, nomeCliente)) {
            passagemService.addPassagem(new Passagem(cpfCliente, nomeCliente));
        } else {
            System.out.println("Apenas usuarios autenticados podem reservar passagens");
        }
    }
}
