package br.com.ifs.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
@Table (name = "log")
public class LogModel {
	
	@Id
	@GeneratedValue
	@Column (name = "log_nr_id")
	private int logNrId;
	
	@Column (name = "usu_nr_id")
	private int usuNrId;
	
	@Column (name = "log_tx_execucao")
	private String logTxExecucao;
	
    @CreationTimestamp
    @Column (name = "log_dt_execucao")
	private Timestamp logDtExecucao; 
    
}
