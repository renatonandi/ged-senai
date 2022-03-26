package br.com.senai.gedsenai.view;

import javax.swing.JOptionPane;

import br.com.senai.secapisenai.Usuario;
import br.com.senai.secapisenai.ValidadorDeAcesso;

public class TelaDeLogin {
	
	private String login;
	
	private String senha;
	
	public void logar() {
		this.login = JOptionPane.showInputDialog("Digite o login:");
		
		this.senha = JOptionPane.showInputDialog("Digite a senha:");
		
		Usuario usuario = new Usuario(login, senha);
		
		try {
			ValidadorDeAcesso validador = new ValidadorDeAcesso();
			validador.validar(usuario);
			JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema");
			
		}catch (IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(null, iae.getMessage());
		}
		
	}

}
