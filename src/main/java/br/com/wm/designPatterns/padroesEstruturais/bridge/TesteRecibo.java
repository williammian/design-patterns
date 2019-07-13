package br.com.wm.designPatterns.padroesEstruturais.bridge;

public class TesteRecibo {
    public static void main(String[] args) {
        GeradorDeArquivoTXT geradorDeArquivoTXT = new GeradorDeArquivoTXT();
        Recibo recibo = new Recibo("XYZ Empresa", "Lionel Messi", 1500, geradorDeArquivoTXT);
        recibo.geraArquivo();
    }
}
