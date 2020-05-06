package br.com.doacao.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.doacao.dao.GenericDAO;
import br.com.doacao.exception.CommitException;



public abstract class GenericDAOImpl<T,K> implements GenericDAO<T, K>{

	protected EntityManager em;
	
	//.class da entidade (usado na busca)
	private Class<T> classe;
	
	//Construtor
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		classe = (Class<T>) ((ParameterizedType)getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public void cadastrar(T entity) {
		em.persist(entity);
	}
	
	
	public void salvar() throws CommitException{
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			throw new CommitException("Erro no commit", e);
		}
	}

}
