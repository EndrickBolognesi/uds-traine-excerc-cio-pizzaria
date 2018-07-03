package br.com.uds.pizza.trainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PizzaServiceImpl implements PizzaService {
    @Autowired
    private PizzaRepository repository;

    @Override
    public Pizza criar(PizzaDTO pizzaDTO) {
        return this.repository.save(pizzaDTO);

    }

    @Override
    public Set<Pizza> listar() {
        return this.repository.findAll();
    }

    @Override
    public Pizza obter(UUID id) {
        return this.repository.findOne(id);
    }

    @Override
    public void remover(UUID id) {
        this.repository.delete(id);
    }

    @Override
    public void editar(UUID id, PizzaDTO pizzaDTO) {
        Pizza pizzaRecuperada = this.obter(id);
        remover(id);
        pizzaRecuperada.setMassa(pizzaDTO.getMassa());
        pizzaRecuperada.setQueijo(pizzaDTO.getQueijo());
        pizzaRecuperada.setMolho(pizzaDTO.getMolho());
        pizzaRecuperada.setSabor(pizzaDTO.getSabor());


        this.repository.add(pizzaRecuperada);
    }




}
