package br.com.passagens.entity;

public class Passagem {

    private static long passagemId = 1;
    private String cpfCliente;
    private String nomeCliente;
    public static final String rota = "RJ X SP";

    public Passagem(String cpfCliente, String nomeCliente) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
    }

    public Passagem() {

    }

    public long getPassagemId() {
        return passagemId;
    }

    public void setPassagemId() {
        passagemId++;
    }

    public void visualizarRotas() {
        System.out.println(rota);
    }




    public String cpfCliente() {
        return cpfCliente;
    }

    public void exibirReservas() {

    }


    public String getNomeCliente() {
        return this.nomeCliente;
    }
}
