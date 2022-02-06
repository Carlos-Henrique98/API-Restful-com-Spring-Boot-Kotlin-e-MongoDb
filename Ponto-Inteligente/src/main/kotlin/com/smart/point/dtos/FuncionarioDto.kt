package com.smart.point.dtos

import org.hibernate.validator.constraints.Length
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class FuncionarioDto(

    val id: String? = null,

    @field:NotEmpty(message = "Nome não pode ser vazio.")
    @field:Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
    val nome: String = "",

    @field:NotEmpty(message = "Email não pode ser vazio.")
    @field:Length(min = 3, max = 200, message = "Nome deve conter entre 5 e 200 caracteres.")
    @field:Email(message = "Email inválido.")
    val email: String = "",

    @field:NotEmpty(message = "Senha não pode ser vazio.")
    val senha: String? = null,
    val qtdHorasTrabalhoDia: String? = null,
    val qtdHorasAlmoco: String? = null

)