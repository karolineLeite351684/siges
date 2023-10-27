package br.com.fiap.siges.dto;

import br.com.fiap.siges.enumeration.StatusDaSolicitacaoEnum;

import java.time.LocalDate;

public record SolicitacaoListagemDTO(
        StatusDaSolicitacaoEnum statusSolicitacao,
        LocalDate dataDaSolicitacao
) {
}
