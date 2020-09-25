package br.edu.interator;

public class ObjectIterator implements Interator{
	
	Object[] itens;
	int posicao = 0;
	
	public ObjectIterator(Object[] itens) {
		super();
		this.itens = itens;
	}

	@Override
	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Object item = itens[posicao];
		posicao++;
		return item;
	}
		
}
