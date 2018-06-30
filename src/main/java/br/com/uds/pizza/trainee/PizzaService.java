package br.com.uds.pizza.trainee;

import java.util.Set;

public interface PizzaService {

    public PizzaDTO criar(PizzaDTO pizzaDTO);

    Set<PizzaDTO> listar();

}
