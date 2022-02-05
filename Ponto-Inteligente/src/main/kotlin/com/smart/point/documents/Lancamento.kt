package com.smart.point.documents

import com.smart.point.enums.TipoEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Lancamento(
    @Id
    val id: String? = null,
    val data: Date,
    val tipo: TipoEnum,
    val funcionario: String,
    val descricao: String? = "",
    val localizacao: String? = ""
)