package br.com.doacao.entity;

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


@Entity
@Table(name="TB_HOSPITAL")
@SequenceGenerator(name ="hospital", sequenceName="SQ_TB_HOSPITAL", allocationSize=1)
public class Hospital {
	
	@Id
	@Column(name="cd_hospital")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="hospital")
	private int hospital;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_doacao", nullable = false)
	private Doacao doacao;
	
	@Column(name="nm_nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name="nr_cnpj", nullable = false)
	private String cnpj;
	
	@Column(name="ds_endereco", nullable = false, length = 100)
	private String endereco;

	
	
	
	public Hospital(String nome) {
		super();
		this.nome = nome;
	}

	

	public int getHospital() {
		return hospital;
	}

	public void setHospital(int hospital) {
		this.hospital = hospital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
