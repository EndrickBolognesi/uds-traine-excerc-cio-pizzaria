package br.com.uds.pizza.trainee;

import io.swagger.annotations.ApiModelProperty;


import java.time.LocalDateTime;
import java.util.UUID;

public  class Pizza extends PizzaDTO {

    @ApiModelProperty(hidden = true)
    private final LocalDateTime dataCadastro;

    @ApiModelProperty(hidden = true)
    private final UUID id;

    private String massa, molho, queijo, sabor;
    private int tempoDePrepato;

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String getMassa() {
        return massa;
    }

    @Override
    public void setMassa(String massa) {
        this.massa = massa;
    }

    @Override
    public String getMolho() {
        return molho;
    }

    @Override
    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    @Override
    public String getSabor() {
        return sabor;
    }

    @Override
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getTempoDePrepato() {
        return tempoDePrepato;
    }

    public void setTempoDePrepato(int tempoDePrepato) {
        this.tempoDePrepato = tempoDePrepato;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "id =" + id +
                ", dataCadastro=" + dataCadastro +
                ", massa='" + massa + '\'' +
                ", queijo='" + queijo + '\'' +
                ", molho='" + molho + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tempoDePreparo=" + tempoDePreparo +
                '}';
    }

    public Pizza(String massa, String queijo, String molho, String sabor, int tempoDePreparo) {
        super(massa, queijo, molho, sabor, tempoDePreparo);


        this.massa = massa;

        this.queijo = queijo;
        this.molho = molho;
        this.sabor = sabor;
        this.tempoDePreparo = tempoDePreparo;

        this.dataCadastro = LocalDateTime.now();
        this.id = UUID.randomUUID();
    }


}
