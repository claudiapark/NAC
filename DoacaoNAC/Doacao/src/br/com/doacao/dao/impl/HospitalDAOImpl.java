package br.com.doacao.dao.impl;

import javax.persistence.EntityManager;

import br.com.doacao.dao.HospitalDAO;
import br.com.doacao.entity.Hospital;

public class HospitalDAOImpl extends GenericDAOImpl<Hospital, Integer> implements HospitalDAO {

	public HospitalDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}


}
