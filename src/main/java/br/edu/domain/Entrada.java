package br.edu.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="entrada")
public class Entrada implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="transportadora_id")
	private Transportadora transportadora;
	
	@Temporal(TemporalType.DATE)
	@Column(name="datapedido")
	private Date dataPedido;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dataentrada")
	private Date dataEntrada;
	
	@OneToMany(mappedBy="entrada", cascade= CascadeType.PERSIST)
	private List<ItemEntrada> intensEntrada = new ArrayList<>();
	
	private Double total;
	
	private Double frete;
	
	private Integer numeroNotaFiscal;
	
	private Double imposto;
	
	public Entrada(){
	}

	public Entrada(Transportadora transportadora, Date dataPedido, Date dataEntrada, Double total, Double frete,
			Integer numeroNotaFiscal, Double imposto) {
		super();
		this.transportadora = transportadora;
		this.dataPedido = dataPedido;
		this.dataEntrada = dataEntrada;
		this.total = total;
		this.frete = frete;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.imposto = imposto;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
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

	public Integer getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(Integer numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public List<ItemEntrada> getIntensEntrada() {
		return intensEntrada;
	}

	public void setIntensEntrada(List<ItemEntrada> intensEntrada) {
		this.intensEntrada = intensEntrada;
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
		Entrada other = (Entrada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
