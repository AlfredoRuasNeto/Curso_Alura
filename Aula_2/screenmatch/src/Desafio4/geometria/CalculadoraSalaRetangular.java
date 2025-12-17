package Desafio4.geometria;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int altura;
    private int largura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getCalcularPerimetro() {
        return (getAltura() + getLargura()) * 2;
    }

    @Override
    public int getCalcularArea() {
        return getAltura() * getLargura();
    }

    public void exibir() {
        System.out.println(getCalcularArea());
        System.out.println(getCalcularPerimetro());
    }
}
