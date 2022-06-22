package br.com.ifs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
@Table(name = "transacao")
public class TransacaoModel {
	
    @Id
    @GeneratedValue
    @Column(name = "tra_nr_id")
	private int traNrId;
    
    @Column(name = "per_nr_id")
	private int perNrId;
    
    @Column(name = "ser_nr_id")
	private int serNrId;
    
    @Column(name = "tra_tx_nome")
	private String traTxNome;
    
    @Column(name = "tra_tx_status")
	private String traTxStatus;
    
    @Column(name = "tra_tx_url")
	private String traTxUrl;

}
