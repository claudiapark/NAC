package br.com.doacao.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name="TB_DOADOR")
@SequenceGenerator(name="doador", sequenceName="SQ_TB_DOADOR", allocationSize=1)
public class Doador {

	@Id
	@Column(name="cd_doador")
	@GeneratedValue(generator="doador", strategy = GenerationType.SEQUENCE)
	private int doador;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="cd_doacao", nullable = false)
	private Doacao doacao;
	
	
	@Column(name="nm_nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name="nr_rg", nullable = false, length = 10)
	private char rg;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento", nullable = false)
	private Calendar nascimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_sexo")
	private Sexo sexo;
	
	@Column(name="ds_endereco", length = 100)
	private String endereco;
	
	@Column(name="ds_orgao", nullable= false)
	private String orgao;
	
	


	
	public Doador() {
		
	}

	public int getDoador() {
		return doador;
	}

	public void setDoador(int doador) {
		this.doador = doador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getRg() {
		return rg;
	}

	public void setRg(char rg) {
		this.rg = rg;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public void setDoacao(Doacao doacao) {
		// TODO Auto-generated method stub
		
	}

	public Doacao getDoacao() {
		return doacao;
	}

	public void add(Doador doador) {
		// TODO Auto-generated method stub
		
	}

	public Doador(String nome,Sexo sexo, String orgao) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.orgao = orgao;
	}
	
	
}
