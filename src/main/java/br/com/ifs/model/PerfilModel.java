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
@Setter
@Getter
@Entity
@Table(name = "perfil")
public class PerfilModel {
	
	@Id
	@GeneratedValue
	@Column(name = "per_nr_id")
	private int perNrId;
	
	@Column(name = "usu_nr_id")
	private int usuNrId;
	
	@Column(name = "per_tx_nome")
	private String perTxNome;
	
	@Column(name = "per_tx_status")
	private String perTxStatus;

	private PerfilModel() {
	}

	private PerfilModel(int perNrId, int usuNrId, String perTxNome, String perTxStatus) {
		this.perNrId = perNrId;
		this.usuNrId = usuNrId;
		this.perTxNome = perTxNome;
		this.perTxStatus = perTxStatus;
	}
}
