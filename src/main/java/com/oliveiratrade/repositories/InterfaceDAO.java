package com.oliveiratrade.repositories;

import java.util.List;

public interface InterfaceDAO<T> {
    public void inserir(T objeto);
    public T buscar(Long id);
    public void  alterar(T objeto);
    public void remover(Long id);
    public List<T> listar();

}
