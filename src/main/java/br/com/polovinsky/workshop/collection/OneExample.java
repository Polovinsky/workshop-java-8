package br.com.polovinsky.workshop.collection;

import java.util.List;
import java.util.stream.Collectors;

public class OneExample {

    public List<Integer> capturarSomentePares(List<Integer> numeros) {
        return numeros.parallelStream()
                .filter(numero -> (numero % 2) == 0)
                .collect(Collectors.toList());
    }
}
