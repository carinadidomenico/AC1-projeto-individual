package com.carinadidomenico.projeto1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimaisController {

    private List<Animais> listaAdocao = new ArrayList<>();

    @GetMapping
    public ResponseEntity listarAnimais() {

        System.out.println(listaAdocao);
        return ResponseEntity.ok(listaAdocao);
    }

    @GetMapping("/{id}")
    public Animais recuperarAnimal(@PathVariable int id) {
        return listaAdocao.get(id-1);
    }

    // Adiciona animal na lista de adoção
    @PostMapping("/adicionar/cachorro")
    public ResponseEntity novoAnimal(@RequestBody Cachorro novoAnimal) {
        listaAdocao.add(novoAnimal);
        return ResponseEntity.status(201).build();
    }

    // Adiciona animal na lista de adoção
    @PostMapping("/adicionar/gato")
    public ResponseEntity novoAnimal(@RequestBody Gato novoAnimal) {
        listaAdocao.add(novoAnimal);
        return ResponseEntity.status(201).build();
    }

    // Ao adotar o animal, ele sai da lista de adoção
    @DeleteMapping("/adotar/{id}")
     public void adotarAnimal(@PathVariable int id) {
        listaAdocao.remove(id-1);
    }

}
