package br.com.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Aplicacao.class)
public class CarrinhoCompraTest {

    @Autowired
    private CarrinhoCompra carrinhoCompra;

    @Test
    public void testCheck() {
        carrinhoCompra.addIem("Item 1", 3);
        carrinhoCompra.addIem("Item 2", 5);

        String resultado = carrinhoCompra.checkout();
        Assert.assertEquals("8 pedidos na lista", resultado);
    }

}
