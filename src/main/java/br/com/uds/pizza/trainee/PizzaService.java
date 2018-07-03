package br.com.uds.pizza.trainee;

import java.util.Set;
import java.util.UUID;

public interface PizzaService {

    Pizza criar(PizzaDTO pizzaDTO);

    Set<Pizza> listar();

    Pizza obter(UUID id);

    void remover(UUID id);

    void editar(UUID id, PizzaDTO pizzaDTO);

}
