package br.edu.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="saida")
public class Saida implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="loja_id")
	private Loja loja;
	
	@ManyToOne
	@JoinColumn(name="transportadora_id")
	private Transportadora transportadora;
	
	private Double total;
	
	private Double frete;
	
	private Double imposto;
	
	@OneToMany(mappedBy="saida", cascade= CascadeType.PERSIST)
	private List<ItemSaida> itensSaida = new ArrayList<>();
	
	public Saida() {
	}
	
	public Saida(Loja loja, Transportadora transportadora, Double total, Double frete, Double imposto) {
		super();
		this.loja = loja;
		this.transportadora = transportadora;
		this.total = total;
		this.frete = frete;
		this.imposto = imposto;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getFrete() {
		return frete;
	}

	public void setFrete(Double frete) {
		this.frete = frete;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	

	public List<ItemSaida> getItensSaida() {
		return itensSaida;
	}

	public void setItensSaida(List<ItemSaida> itensSaida) {
		this.itensSaida = itensSaida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saida other = (Saida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
