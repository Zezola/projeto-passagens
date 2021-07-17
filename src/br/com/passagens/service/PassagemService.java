package br.com.passagens.service;

import br.com.passagens.entity.Passagem;

import java.util.ArrayList;
import java.util.List;

public class PassagemService {

    private List<Passagem> passagens = new ArrayList<Passagem>();

    public void addPassagem(Passagem passagem) {
        passagens.add(passagem);
    }

    public void exibirPassagens() {
        for (Passagem passagem:passagens) {
            System.out.println(passagem);
        }
    }


}
