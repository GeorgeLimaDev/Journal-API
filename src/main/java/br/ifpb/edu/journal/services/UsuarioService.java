package br.ifpb.edu.journal.services;

import jakarta.transaction.Transactional;
import br.ifpb.edu.journal.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ifpb.edu.journal.repositories.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {

        return this.usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long idUsuario) {
        return this.usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Transactional
    public Usuario inserirOuAtualizar (Usuario usuario) {
        Usuario usuarioInserido = this.usuarioRepository.save(usuario);
        return usuarioInserido;
    }

    public void apagar(Long id) {
        this.usuarioRepository.deleteById(id);
    }
}
