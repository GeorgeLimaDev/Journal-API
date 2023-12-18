package br.ifpb.edu.journal.controllers;

import br.ifpb.edu.journal.model.Usuario;
import br.ifpb.edu.journal.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return this.usuarioService.getUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario getUsuarioById(@PathVariable("id") Long idUsuario) {
        return this.usuarioService.getUsuarioById(idUsuario);
    }

    @PostMapping("/usuarios")
    public Usuario inserirUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.inserirOuAtualizar(usuario);
    }

    @PutMapping("/usuarios/{id}")
    public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.inserirOuAtualizar(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public void apagarUsuario(@PathVariable("id") Long id) {
        this.usuarioService.apagar(id);
    }
}
