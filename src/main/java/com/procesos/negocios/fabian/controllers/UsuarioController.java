package com.procesos.negocios.fabian.controllers;

import com.procesos.negocios.fabian.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class UsuarioController {

    @GetMapping(value = "/usuario/{id}")
    public Usuario getusuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Fabian");
        usuario.setApellidos("Lopez Vargas");
        usuario.setDireccion("Promesa de Dios");
        usuario.setDocumento("1092731434");

        usuario.setTelefono("3143745378");

        return usuario;
    }
}
