package br.com.wm.designPatterns.padroesDeCriacao.prototype;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TestaPrototype {
    public static void main(String[] args) {
        String nome = "XYZ";
        LocalDate vencimento = LocalDate.now().plusDays(30);
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("curso");
        hashSet.add("java");
        hashSet.add("xyz");

        Campanha campanha = new Campanha(nome, vencimento, hashSet);
        System.out.println(campanha);

        Campanha clone = campanha.clone();
        System.out.println(clone);
    }
}
