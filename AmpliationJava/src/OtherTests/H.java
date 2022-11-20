package OtherTests;

public class H {
    private int numero;
    private String cadena;
    private Integer numeroClase;
    private Double decimal;

    @Override
    public String toString() {
        return "H{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                ", numeroClase=" + numeroClase +
                ", decimal=" + decimal +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Integer getNumeroClase() {
        return numeroClase;
    }

    public void setNumeroClase(Integer numeroClase) {
        this.numeroClase = numeroClase;
    }

    public Double getDecimal() {
        return decimal;
    }

    public void setDecimal(Double decimal) {
        this.decimal = decimal;
    }

}
