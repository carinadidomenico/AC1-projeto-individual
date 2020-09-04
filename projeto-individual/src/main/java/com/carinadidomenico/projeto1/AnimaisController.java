package com.carinadidomenico.projeto1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animais");

public class AnimaisController {

    private List<Animais> listaAdocao = new ArrayList<>();

    @GetMapping
    public ResponseEntity listarAnimais() {
        return ResponseEntity.ok(listaAdocao);
    }

    @GetMapping("/{id}")
    public Animais recuperarAnimal(@PathVariable int id) {
        return listaAdocao.get(id-1);
    }

    @PostMapping
    public ResponseEntity novoAnimal(@RequestBody Animais novoAnimal) {
        listaAdocao.add(novoAnimal);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping
     public void adotarAnimal(@PathVariable int id) {
        listaAdocao.remove(id-1);
    }


}
