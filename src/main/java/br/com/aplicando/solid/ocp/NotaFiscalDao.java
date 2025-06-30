package br.com.aplicando.solid.ocp;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("salva NF no banco");
    }
}