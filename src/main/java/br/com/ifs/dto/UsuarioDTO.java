package br.com.ifs.dto;

import java.sql.Timestamp;

import br.com.ifs.dto.UsuarioDTO;
import br.com.ifs.model.UsuarioModel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioDTO {
	

	private int usuNrId;
	private String usuTxNome;
	private String usuTxLogin;
	private String usuTxSenha;
	private String usuTxStatus;
	private Timestamp usuDtCadastro;
	private String usuTxToken;

	public UsuarioModel toUsuario() {
		return UsuarioModel.builder()
				.usuNrId(usuNrId)
				.usuTxNome(usuTxNome)
				.usuTxLogin(usuTxLogin)
				.usuTxSenha(usuTxSenha)
				.usuTxStatus(usuTxStatus)
				.usuDtCadastro(usuDtCadastro)
				.usuTxToken(usuTxToken)
				.build();
	}
}
