package br.com.wm.designPatterns.padroesEstruturais.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoTXT implements GeradorDeArquivo {

    @Override
    public void gera(String conteudo) {
        try {
            PrintStream saida = new PrintStream("arquivo.txt");
            saida.println(conteudo);
            saida.close();
        }catch (FileNotFoundException err) {
            err.printStackTrace();
        }
    }
}
