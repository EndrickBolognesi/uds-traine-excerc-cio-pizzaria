package br.com.uds.pizza.trainee;

   abstract class PizzaDTO {
    String massa, queijo, molho, sabor;
    int tempoDePreparo;



    public PizzaDTO(String massa, String queijo, String molho, String sabor, int tempoDePreparo){

    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getQuejio() {
        return queijo;
    }

    public void setQuejio(String quejio) {
        this.queijo = quejio;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }
}
