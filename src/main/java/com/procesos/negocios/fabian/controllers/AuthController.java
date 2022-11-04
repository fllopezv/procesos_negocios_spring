package com.procesos.negocios.fabian.controllers;

import com.procesos.negocios.fabian.models.Usuario;
import com.procesos.negocios.fabian.services.UsuarioService;
import com.procesos.negocios.fabian.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "auth/login")
    public ResponseEntity login(@RequestBody Usuario usuario){
        return usuarioService.login(usuario.getCorreo(),usuario.getPassword());
    }


}
