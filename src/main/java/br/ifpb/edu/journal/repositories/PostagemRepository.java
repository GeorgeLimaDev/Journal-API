package br.ifpb.edu.journal.repositories;

import br.ifpb.edu.journal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository  extends JpaRepository<Postagem, Long> {

}
