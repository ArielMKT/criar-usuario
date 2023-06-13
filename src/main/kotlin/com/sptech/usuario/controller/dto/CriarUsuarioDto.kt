package com.sptech.usuario.controller.dto

data class CriarUsuarioDto(
    val nome: String,
    val email: String,
    val cep: String,
    val logradouro: String,
    val numero: String,
    val complemento: String
)
