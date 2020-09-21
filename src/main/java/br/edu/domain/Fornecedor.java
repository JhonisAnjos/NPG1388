package br.edu.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
public class Fornecedor extends PessoaJuridica{

	private static final long serialVersionUID = 1L;
}
