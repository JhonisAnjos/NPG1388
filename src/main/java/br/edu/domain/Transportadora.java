package br.edu.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="transportadora")
public class Transportadora extends PessoaJuridica{

	private static final long serialVersionUID = 1L;
	
	public Transportadora(String nome, Endereco endereco, String telefone, String email, String inscricaoEstadual,
			String cnpj) {
		super(nome, endereco, telefone, email, inscricaoEstadual, cnpj);
	}
	
	public Transportadora(){
		
	}
	
	


}
