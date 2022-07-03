package com.tiago.sistema.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_valor")
public class Valor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valor_primeira_hora")
	private Double valorPrimeiraHora;
	
	@Column(name = "valor_demais_horas")
	private Double valorDemaisHoras;
	
	@Column(name = "data_fim")
	private LocalDateTime dataFim;
	
	public Double getValorPrimeiraHora() {
		return valorPrimeiraHora;
	}
	public void setValorPrimeiraHora(Double valorPrimeiraHora) {
		this.valorPrimeiraHora = valorPrimeiraHora;
	}
	public Double getValorDemaisHoras() {
		return valorDemaisHoras;
	}
	public void setValorDemaisHoras(Double valorDemaisHoras) {
		this.valorDemaisHoras = valorDemaisHoras;
	}
	public LocalDateTime getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}
}
