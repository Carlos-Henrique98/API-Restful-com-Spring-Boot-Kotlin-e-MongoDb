package com.smart.point.dtos

import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class CadastroPJDto(

    val id: String? = null,

    @field:NotEmpty(message = "Nome não pode ser vazio.")
    @field:Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
    val nome: String = "",

    @field:NotEmpty(message = "Nome não pode ser vazio.")
    @field:Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
    @field:Email(message = "Email inválido.")
    val email: String = "",

    @field:NotEmpty(message = "Senha não pode ser vazio.")
    val senha: String = "",

    @field:NotEmpty(message = "CPF não pode ser vazio.")
    @field:CPF(message = "CPF inválido.")
    val cpf: String = "",

    @field:NotEmpty(message = "CNPJ não pode ser vazio.")
    @field:CNPJ(message = "CNPJ inválido.")
    val cnpj: String = "",

    @field:NotEmpty(message = "Razão Social não pode ser vazio.")
    @field:Length(min = 3, max = 200, message = "Razão Social deve conter entre 5 e 200 caracteres.")
    val razaoSocial: String = ""
)