package br.com.doacao.dao.impl;

import javax.persistence.EntityManager;

import br.com.doacao.dao.DoadorDAO;
import br.com.doacao.entity.Doador;

public class DoadorDAOImpl extends GenericDAOImpl<Doador,Integer> implements DoadorDAO{
	
	public DoadorDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}



}
