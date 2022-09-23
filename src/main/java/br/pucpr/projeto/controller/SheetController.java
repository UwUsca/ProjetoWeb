package br.pucpr.projeto.controller;

import br.pucpr.projeto.entity.Sheet;
import br.pucpr.projeto.repository.SheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sheets")
public class SheetController {

    @Autowired
    private SheetRepository sheetRepository;

    /* ---- MÉTODOS GET ---- */
    @GetMapping
    public List<Sheet> getAllSheets() {
        return sheetRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sheet getSheetById(@PathVariable Integer id){
        return sheetRepository.findById(id).get();
    }

    /* ---- MÉTODOS POST ---- */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sheet newSheet(@RequestBody Sheet sheet){
        return sheetRepository.save(sheet);
    }

    @DeleteMapping("/{id}")
    public void deleteSheet(@PathVariable Integer id){
        sheetRepository.deleteById(id);
    }
}
