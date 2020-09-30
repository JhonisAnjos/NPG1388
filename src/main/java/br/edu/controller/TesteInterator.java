package br.edu.controller;

import br.edu.domain.Usuario;
import br.edu.interator.Interator;
import br.edu.interator.ObjectIterator;

public class TesteInterator {
	
	public static void main(String[] args) {
		
		Usuario jhonis = new Usuario("JHONIS", "06565656", "kjhoinis@gmail.com", "1234");
		Usuario jean = new Usuario("JEAN", "06565656", "kjhoinis@gmail.com", "1234");
		Usuario rafael = new Usuario("RAFAEL", "06565656", "kjhoinis@gmail.com", "1234");
		
		Usuario[] usuarios = {jhonis, jean, rafael};
		
//		for (int i = 0; i < usuarios.length; i++) {
//			System.out.println(usuarios[i].getNome());
//		}
		
		Interator iterator = new ObjectIterator(usuarios);
		
		while(iterator.hasNext()) {
			Usuario usuario = (Usuario) iterator.next();
			System.out.println(usuario.getNome());
		}
		
	}

}
