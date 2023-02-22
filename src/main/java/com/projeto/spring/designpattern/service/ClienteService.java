package com.projeto.spring.designpattern.service;

import com.projeto.spring.designpattern.model.Cliente;
/**
 * Interface que define o padrão STRATEGY
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
