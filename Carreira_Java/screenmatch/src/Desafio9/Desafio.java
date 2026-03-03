package Desafio9;

public class Desafio {
    private String item;
    private double valorItem;


    public String getItem() {

        return item;
    }

    public void setItem(String item) {

        this.item = item;
    }

    public double getValorItem() {

        return valorItem;
    }

    public void setValorItem(double valorItem) {

        this.valorItem = valorItem;
    }

    @Override
    public String toString() {

        return this.item + " Custa " + this.valorItem;
    }
}
