package br.com.wm.designPatterns.padroesComportamentais.strategy;

import java.util.List;

public interface Sorter {
	<T extends Comparable<? super T>> List<T> sort(List<T> list);
}