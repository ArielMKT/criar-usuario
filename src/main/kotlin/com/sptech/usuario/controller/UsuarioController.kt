package com.sptech.usuario.controller

import com.sptech.usuario.controller.dto.CriarUsuarioDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UsuarioController {
    @PostMapping("criar-usuario")
    fun criarUsuario(
        @RequestBody criarUsuarioDto: CriarUsuarioDto
    ): ResponseEntity<String> {

        return ResponseEntity.ok("Ok")
    }
}
