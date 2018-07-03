package br.com.uds.pizza.trainee;
import java.util.Set;
import java.util.UUID;

public interface PizzaRepository {
    Pizza save(PizzaDTO pizzaDTO);

    Set<Pizza> findAll();

    Pizza findOne(UUID id);

    void delete(UUID id);

    void add(Pizza pizza);
}
