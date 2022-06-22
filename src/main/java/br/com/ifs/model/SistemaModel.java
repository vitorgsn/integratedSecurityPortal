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

@ToString
@Builder
@Getter
@Setter
@Entity
@Table(name = "sistema")
public class SistemaModel {
	
	@Id
	@GeneratedValue
	@Column(name = "sis_nr_id")
	private int sisNrId;
	
	@Column(name = "sis_tx_nome")
	private String sisTxNome;
	
	@Column(name = "sis_tx_status")
	private String sisTxStatus;

	public SistemaModel() {
	}

	private SistemaModel(int sisNrId, String sisTxNome, String sisTxStatus) {
		super();
		this.sisNrId = sisNrId;
		this.sisTxNome = sisTxNome;
		this.sisTxStatus = sisTxStatus;
	}
	
}
