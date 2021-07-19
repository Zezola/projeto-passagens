package br.com.passagens.service;

import br.com.passagens.client.Login;
import br.com.passagens.entity.Passagem;

import java.util.ArrayList;
import java.util.List;

public class PassagemService {

    private static List<Passagem> passagens = new ArrayList<Passagem>();



    public void addPassagem(Passagem passagem) {

            passagem.setPassagemId();
            passagens.add(passagem);


    }



    public void exibirReservas() {
        for (Passagem passagem:passagens) {
            System.out.println(passagem.rota);
            System.out.println(passagem.cpfCliente());
            System.out.println(passagem.getNomeCliente());
            System.out.println(passagem.getPassagemId());
        }
    }


}
