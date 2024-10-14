package org.serratec.pizzaria.dto;

import org.serratec.pizzaria.model.Pedido;

public record PedidoDto(
		Long id,
		String cliente,
		String pizza, 
		Double valor
		) {

	public Pedido toEntity() { // conversão mais comum no Dto. transformando uma instância do pedido dto para uma entity.
		Pedido pedido = new Pedido();
		pedido.setId(this.id); // o this é boa prática para indicar que é esse dado que a gente quer puxar.
		pedido.setCliente(this.cliente);
		pedido.setPizza(this.pizza);
		pedido.setValor(this.valor);
		return pedido;
	};
	
	public static PedidoDto toDto(Pedido pedido) {
		return new PedidoDto(pedido.getId(), pedido.getCliente(),
				pedido.getPizza(), pedido.getValor());
	}
	
}
