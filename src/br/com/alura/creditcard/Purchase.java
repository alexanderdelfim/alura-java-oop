package br.com.alura.creditcard;

public class Purchase {
    private String description;
    private double value;

    public Purchase(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return this.description;
    }

    public double getValue() {
        return this.value;
    }


    @Override
    public String toString() {
        return "Compra: descrição = " + description + 
            " valor = " + value;
    }
    
}
