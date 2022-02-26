package DesafioBanco;



public class Main {
    public static void main(String[] args) {
        Cliente joaoGuilherme = new Cliente ();
        joaoGuilherme.setNome("João Guilherme");


        Conta cc = new ContaCorrente(joaoGuilherme);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(joaoGuilherme);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}