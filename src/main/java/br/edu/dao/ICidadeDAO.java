package br.edu.dao;

import java.util.List;

import br.edu.domain.Cidade;

public interface ICidadeDAO {

	public List<Cidade> buscarTodos();
	
	public void excluir(Class<Cidade> type, Integer id);
	
	public Cidade buscarPorId(Class<Cidade> type, Integer id);
}