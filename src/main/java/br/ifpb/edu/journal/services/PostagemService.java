package br.ifpb.edu.journal.services;

import br.ifpb.edu.journal.model.Postagem;
import br.ifpb.edu.journal.repositories.PostagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {
    @Autowired
    private PostagemRepository postagemRepository;

    public List<Postagem> getPostagens() {
        return this.postagemRepository.findAll();
    }

    public Postagem getPostagemById(Long idPostagem) {
        return this.postagemRepository.findById(idPostagem).orElse(null);
    }

    @Transactional
    public Postagem inserirOuAtualizar (Postagem postagem) {
        Postagem postagemInserida = this.postagemRepository.save(postagem);
        return postagemInserida;
    }

    public void apagar(Long id) {
        this.postagemRepository.deleteById(id);
    }
}
