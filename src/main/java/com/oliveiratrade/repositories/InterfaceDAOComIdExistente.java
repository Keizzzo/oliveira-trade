package com.oliveiratrade.repositories;

import java.util.List;

public interface InterfaceDAOComIdExistente<T> {
    public void inserir(Long id, T objeto);
    public T buscar(Long id);
    public void  alterar(Long id, T objeto);
    public void remover(Long id);
    public List<T> listar();

}
