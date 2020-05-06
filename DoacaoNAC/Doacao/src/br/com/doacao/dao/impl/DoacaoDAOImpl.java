package br.com.doacao.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import br.com.doacao.dao.DoacaoDAO;
import br.com.doacao.entity.Doacao;


public class DoacaoDAOImpl extends GenericDAOImpl<Doacao,Integer>  implements DoacaoDAO {

	public DoacaoDAOImpl(EntityManager em) {
		super(em);
	}




}
