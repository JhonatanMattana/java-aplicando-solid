package br.com.aplicando.solid.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("envia email da nf " + notaFiscal.getId());
    }
}