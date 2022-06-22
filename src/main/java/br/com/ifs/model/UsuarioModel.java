package br.com.ifs.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import br.com.ifs.dto.UsuarioDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UsuarioModel {
	
    @Id
    @GeneratedValue
    @Column(name = "usu_nr_id")
	private int usuNrId;
    
    @Column(name = "usu_tx_nome")
	private String usuTxNome;
    
    @Column(name = "usu_tx_login")
	private String usuTxLogin;
    
    @Column(name = "usu_tx_senha")
	private String usuTxSenha;
    
    @Column(name = "usu_tx_status")
	private String usuTxStatus;
    
    @CreationTimestamp
    @Column(name = "usu_dt_cadastro")
	private Timestamp usuDtCadastro;
    
    //gerar token com jwt
    @Column(name = "usu_tx_token")
	private String usuTxToken;
    
    
	public UsuarioDTO toUsuario() {
		return UsuarioDTO.builder()
				.usuNrId(usuNrId)
				.usuTxNome(usuTxNome)
				.usuTxLogin(usuTxLogin)
				.usuTxStatus(usuTxStatus)
				.usuDtCadastro(usuDtCadastro)
				.build();
	}

	private UsuarioModel() {
	}
	
	private UsuarioModel(int usuNrId, String usuTxNome, String usuTxLogin, String usuTxSenha, String usuTxStatus,
			Timestamp usuDtCadastro, String usuTxToken) {
		this.usuNrId = usuNrId;
		this.usuTxNome = usuTxNome;
		this.usuTxLogin = usuTxLogin;
		this.usuTxSenha = usuTxSenha;
		this.usuTxStatus = usuTxStatus;
		this.usuDtCadastro = usuDtCadastro;
		this.usuTxToken = usuTxToken;
	}





}
