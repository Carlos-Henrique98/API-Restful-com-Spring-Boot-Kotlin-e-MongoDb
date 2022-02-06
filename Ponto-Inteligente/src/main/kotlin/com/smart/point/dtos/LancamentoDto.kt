package com.smart.point.dtos

import javax.validation.constraints.NotEmpty

data class LancamentoDto(

    val id: String? = null,

    @field:NotEmpty(message = "Data não pode ser vazio.")
    val data: String? = null,

    @field:NotEmpty(message = "Tipo não pode ser vazio.")
    val tipo: String? = null,

    val descricao: String? = null,
    val localizacao: String? = null,
    val funcionarioId: String? = null
)