package br.com.doacao.dao;

import br.com.doacao.exception.CommitException;

public interface GenericDAO<T,K> {

	void cadastrar(T entity);
	
	void salvar() throws CommitException;



}
