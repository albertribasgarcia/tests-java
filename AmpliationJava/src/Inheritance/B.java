package Inheritance;

public abstract class B extends A implements I{
    public final static long serialVersionUID = 1L;
    private String identificadorPresentador;
    private Integer tipusIdentificadorPresentador;

    public B(){
        super();
    }

    public String getIdentificadorPresentador() {
        return identificadorPresentador;
    }

    public void setIdentificadorPresentador(String identificadorPresentador) {
        this.identificadorPresentador = identificadorPresentador;
    }

    public Integer getTipusIdentificadorPresentador() {
        return tipusIdentificadorPresentador;
    }

    public void setTipusIdentificadorPresentador(Integer tipusIdentificadorPresentador) {
        this.tipusIdentificadorPresentador = tipusIdentificadorPresentador;
    }
}
