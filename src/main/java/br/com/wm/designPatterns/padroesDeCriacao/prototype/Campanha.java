package br.com.wm.designPatterns.padroesDeCriacao.prototype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {
    private String nome;
    private LocalDate vencimento;
    private Set<String> palavrasChave;

    public Campanha(String nome, LocalDate vencimento, Set<String> palavrasChave) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.palavrasChave = palavrasChave;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public Set<String> getPalavrasChave() {
        return palavrasChave;
    }

    public Campanha clone() {
        String nome = "Cópia da Campanha: " + this.nome;
        LocalDate vencimento = LocalDate.of(this.vencimento.getYear(), this.vencimento.getMonth(), this.vencimento.getDayOfMonth()) ;
        Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
        Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
        return campanha;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" ---------------");
        buffer.append("\n");
        buffer.append(" Nome da Campanha : ");
        buffer.append(this.nome);
        buffer.append("\n");

        buffer.append(" Vencimento : " + this.vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) );
        buffer.append("\n");

        buffer.append(" Palavras - chave : \n");
        for(String palavraChave : this . palavrasChave) {
            buffer.append(" - " + palavraChave);
            buffer.append("\n");
        }
            buffer.append(" ---------------");
            buffer.append("\n");

        return buffer . toString ();
    }
}
