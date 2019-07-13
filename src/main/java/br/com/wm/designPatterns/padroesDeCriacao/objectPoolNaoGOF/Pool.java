package br.com.wm.designPatterns.padroesDeCriacao.objectPoolNaoGOF;

public interface Pool<T> {
    T acquire();
    void release(T t);
}
