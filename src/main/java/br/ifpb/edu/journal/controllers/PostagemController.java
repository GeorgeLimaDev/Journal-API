package br.ifpb.edu.journal.controllers;

import br.ifpb.edu.journal.model.Postagem;
import br.ifpb.edu.journal.services.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PostagemController {
    @Autowired
    private PostagemService postagemService;

    @GetMapping("/postagens")
    public List<Postagem> getPostagens() {
        return this.postagemService.getPostagens();
    }

    @GetMapping("/postagens/{id}")
    public Postagem getPostagemById(@PathVariable("id") Long idPostagem) {
        return this.postagemService.getPostagemById(idPostagem);
    }

    @PostMapping("/postagens")
    public Postagem inserirPostagem(@RequestBody Postagem postagem) {
        return this.postagemService.inserirOuAtualizar(postagem);
    }

    @PutMapping("/postagens/{id}")
    public Postagem atualizarPostagem(@RequestBody Postagem postagem) {
        return this.postagemService.inserirOuAtualizar(postagem);
    }

    @DeleteMapping("/postagens/{id}")
    public void apagarPostagem(@PathVariable("id") Long id) {
        this.postagemService.apagar(id);
    }
}
