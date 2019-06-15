/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
import utils.Constantes;

/**
 * https://memorynotfound.com/apache-httpclient-http-put-request-method-example/
 * https://www.mkyong.com/webservices/jax-rs/restful-java-client-with-apache-httpclient/
 *
 * @author jeanfernandes
 */

public class ProdutoService {

    private final String url = Constantes.URL_API;
    private RestClientService rest;
    private final ObjectMapper mapper;

    public ProdutoService() {
        //this.rest = new RestClientService("/produtos");
        mapper = new ObjectMapper();
    }
    

    public void post(Produto p) {
        rest = new RestClientService("/produtos");
        try {
            String json = mapper.writeValueAsString(p);
            rest.post(json);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ProdutoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Produto> getAll() {
        rest = new RestClientService("/produtos");
        List<Produto> produtos = new ArrayList<>();
        try {
            String json = rest.get();
            produtos = mapper.readValue(json, new TypeReference<List<Produto>>(){});
        } catch (IOException ex) {
            Logger.getLogger(ProdutoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return produtos;
    }
    
    public Produto getByID(int id) {
        rest = new RestClientService("/produtos/" + id);
        String json = "";
        Produto p = new Produto();
        try {
            json = rest.get();
            p = mapper.readValue(json, Produto.class);
        } catch (IOException ex) {
            Logger.getLogger(ProdutoService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return p;
    }
}
