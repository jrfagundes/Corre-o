package com.totranquilo.topfood.notificacao;

import org.springframework.stereotype.Component;

import com.totranquilo.topfood.modelo.Cliente;

@Component
public class NotificadorEmail {
	
	public NotificadorEmail( ) {
		System.out.println("NotificadorEmail!");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
	System.out.printf("Notificando %s atrav�s do e-mail %s: %s\n", 
			cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
