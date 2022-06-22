package br.com.ifs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Setter
@Getter
@Entity
@Table(name = "servico")
public class ServicoModel {
	
	@Id
	@GeneratedValue
	@Column(name = "ser_nr_id")
	private int serNrId;
	
	@Column(name = "sis_nr_id")
	private int sisNrId;
	
	@Column(name = "ser_tx_nome")
	private String serTxNome;
	
	@Column(name = "ser_tx_url")
	private String serTxUrl;
	
	@Column(name = "ser_tx_status")
	private String serTxStatus;

	public ServicoModel() {
	}

	private ServicoModel(int serNrId, int sisNrId, String serTxNome, String serTxUrl, String serTxStatus) {
		this.serNrId = serNrId;
		this.sisNrId = sisNrId;
		this.serTxNome = serTxNome;
		this.serTxUrl = serTxUrl;
		this.serTxStatus = serTxStatus;
	}
	
}
