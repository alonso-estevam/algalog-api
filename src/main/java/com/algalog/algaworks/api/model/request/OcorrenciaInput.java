package com.algalog.algaworks.api.model.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaInput {
	
	@NotBlank
	private String descricao;
	
}
