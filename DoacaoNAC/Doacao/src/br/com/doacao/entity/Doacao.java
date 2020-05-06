package br.com.doacao.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TB_DOACAO")
@SequenceGenerator(name="doacao", sequenceName="SQ_TB_DOACAO", allocationSize=1)
public class Doacao {
	
	@Id
	@Column(name="cd_doacao")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="doacao")
	private int doacao;
	
	@Column(name="ds_orgao", nullable=false)
	private String orgao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_doacao", nullable=false)
	private Calendar dataDoacao;
	
	@OneToOne(mappedBy = "doacao", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinColumn(name="cd_hospital", nullable=false)
	private Hospital hospital;
	
	@OneToOne(mappedBy = "doacao",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cd_doador", nullable=false)
	private Doador doador;
	
	

	

	public Doacao(int doacao, String orgao, Calendar dataDoacao) {
		super();
		this.doacao = doacao;
		this.orgao = orgao;
		this.dataDoacao = dataDoacao;
	}

	public int getDoacao() {
		return doacao;
	}

	public void setDoacao(int doacao) {
		this.doacao = doacao;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public Calendar getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(Calendar dataDoacao) {
		this.dataDoacao = dataDoacao;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	public void addDoador(Doador doador) {
		//doador.setDoacao(this); 
		//doador.add(doador); 
	}

	public void addHospital(Hospital hospital) {
		
		
	}

	

}
