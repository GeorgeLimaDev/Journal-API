package br.ifpb.edu.journal.repositories;

import br.ifpb.edu.journal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository  extends JpaRepository<Postagem, Long> {

}
