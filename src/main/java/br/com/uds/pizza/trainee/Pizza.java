package br.com.uds.pizza.trainee;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public  class Pizza extends PizzaDTO {

    @ApiModelProperty(hidden = true)
    private final LocalDateTime dataCadastro;

    @ApiModelProperty(hidden = true)
    private final UUID id;


    public Pizza(String massa, String queijo, String molho, String sabor, int tempoDePreparo, UUID id, LocalDateTime dataCadastro, UUID id1, LocalDateTime dataCadastro1, UUID id2) {
        super(massa, queijo, molho, sabor, tempoDePreparo);


        this.dataCadastro = LocalDateTime.now();
        this.id = UUID.randomUUID();
    }


}
