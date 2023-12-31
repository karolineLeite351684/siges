package br.com.fiap.siges.dto;

import br.com.fiap.siges.enumeration.StatusDaSolicitacaoEnum;

import java.time.LocalDate;

public record SolicitacaoListagemDTO(
        String idSolicitacao,
        StatusDaSolicitacaoEnum statusSolicitacao,
        LocalDate dataDaSolicitacao
) {
}
