package br.ifpb.edu.journal.repositories;

import br.ifpb.edu.journal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
