package br.com.uds.pizza.trainee;

import javax.naming.NamingException;
import java.util.Set;

public interface PizzaService {

    public PizaDTO criar(PizaDTO pizaDTO);

    Set<PizaDTO> listar();

}
