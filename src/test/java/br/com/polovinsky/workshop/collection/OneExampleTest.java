package br.com.polovinsky.workshop.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class OneExampleTest {

    private OneExample ex1;

    @Before
    public void setUp() throws Exception {
        ex1 = new OneExample();
    }

    @Test
    public void capturarSomenteNumerosPares_comListaInteiros_deveRetornarApenasNumerosPares() throws Exception {
        List<Integer> pares = ex1.capturarSomentePares(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        assertThat("Deve retornar 5 numeros", pares, hasSize(5));
        pares.forEach(par -> System.out.println(par));
    }
}