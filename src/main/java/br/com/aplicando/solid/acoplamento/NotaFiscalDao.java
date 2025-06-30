package br.com.aplicando.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("salva NF no banco");
    }
}