package com.jeanluca.api.dao;

import org.springframework.stereotype.Repository;

import com.jeanluca.api.models.ProdutoModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProdutoDAO extends JpaRepository<ProdutoModel, Integer> {

}
