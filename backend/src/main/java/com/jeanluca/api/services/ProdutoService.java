package com.jeanluca.api.services;

import java.util.List;
import java.util.Optional;

import com.jeanluca.api.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanluca.api.dao.ProdutoDAO;
import com.jeanluca.api.models.ProdutoModel;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoDAO repository;
	
	public ProdutoModel find(Integer id) throws ObjectNotFoundException {
		Optional<ProdutoModel> p = repository.findById(id);
		return p.orElseThrow(() -> new ObjectNotFoundException("produto nao encontrado"));
	}
	
	public List<ProdutoModel> search(Integer page, Integer linesPerPage) {
		//Pageable pageable = (Pageable) PageRequest.of(page, linesPerPage);
 		//PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
 		return repository.findAll();
 	}
	
	public ProdutoModel insert(ProdutoModel p) {
		p.setId(null);
		return repository.save(p);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
