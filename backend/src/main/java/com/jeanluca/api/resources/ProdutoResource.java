package com.jeanluca.api.resources;

import java.util.List;

import com.jeanluca.api.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jeanluca.api.models.ProdutoModel;
import com.jeanluca.api.services.ProdutoService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProdutoModel> find(@PathVariable Integer id) {
        ProdutoModel obj = null;
        try {
            obj = service.find(id);
        } catch (ObjectNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ProdutoModel>> findPage(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage) {
        List<ProdutoModel> list = service.search(page, linesPerPage);
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody ProdutoModel p) {
       // service.insert(new ProdutoModel(null, p.getNome(), p.getPreco()));
        return ResponseEntity.created(
                ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}").buildAndExpand(service.insert(
                        new ProdutoModel(null, p.getNome(), p.getPreco())
                ).getId()).toUri()
        ).build();
    }

}
