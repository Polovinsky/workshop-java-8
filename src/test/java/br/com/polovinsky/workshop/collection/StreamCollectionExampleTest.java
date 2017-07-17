package br.com.polovinsky.workshop.collection;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class StreamCollectionExampleTest {

    private StreamCollectionExample ex1;

    @Before
    public void setUp() throws Exception {
        ex1 = new StreamCollectionExample();
    }

    @Test
    public void getNumerosPares_comListaInteiros_deveRetornarApenasNumerosPares() throws Exception {
        List<Integer> pares = ex1.getNumerosPares(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        assertThat("Deve retornar 5 numeros", pares, hasSize(5));
        pares.forEach(par -> System.out.println(par));
    }

    @Test
    public void getDobro_comListaInteiros_deveRetornarODobroDeCadaNumero() throws Exception {
        List<Integer> dobro = ex1.getDobro(Arrays.asList(10, 15));
        assertThat("Deve retornar 2 numeros", dobro, hasSize(2));
        assertThat(dobro.get(0), Matchers.is(20));
        assertThat(dobro.get(1), Matchers.is(30));
    }
}