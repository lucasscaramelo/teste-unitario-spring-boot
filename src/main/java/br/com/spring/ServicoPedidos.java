package br.com.spring;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServicoPedidos {

    public String listaPedidos(List<Pedido> pedidos) {
        return pedidos.size() + " pedidos na lista";
    }

}
