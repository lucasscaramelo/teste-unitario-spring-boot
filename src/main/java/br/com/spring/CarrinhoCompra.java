package br.com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CarrinhoCompra {

    @Autowired
    private ServicoPedidos servicoPedidos;
    private List<Pedido> pedidos = new ArrayList<>();

    public void addIem(String nome, int quantidade) {
        pedidos.add(new Pedido(nome, quantidade));
    }

    public String checkout() {
        String msg = servicoPedidos.listaPedidos(pedidos);
        pedidos.clear();
        return msg;
    }

}
