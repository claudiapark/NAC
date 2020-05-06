package br.com.doacao.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.doacao.dao.DoacaoDAO;
import br.com.doacao.dao.impl.DoacaoDAOImpl;
import br.com.doacao.entity.Doacao;
import br.com.doacao.entity.Doador;
import br.com.doacao.entity.Hospital;
import br.com.doacao.entity.Sexo;
import br.com.doacao.singleton.EntityManagerFactorySingleton;
import br.com.doacao.exception.CommitException;

public class ConsoleView {

	public static void main(String[] args) {
		
				EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
				EntityManager em = fabrica.createEntityManager();
				
				
				DoacaoDAO dao = new DoacaoDAOImpl(em);
				
				Doacao doacao = new Doacao(1 ,"rim", new GregorianCalendar(2020, Calendar.MARCH, 11));
				
				doacao.addDoador(new Doador("Claudia",  Sexo.FEMININO, "Rim"));
				
				doacao.addHospital(new Hospital("Albert Einsten"));
				
				dao.cadastrar(doacao);
				
				try {
					dao.salvar();
					System.out.println("Cadastrado!");
				} catch (CommitException e) {
					System.out.println(e.getMessage());
				}
				
				
				em.close();
				fabrica.close();
			}

	}


