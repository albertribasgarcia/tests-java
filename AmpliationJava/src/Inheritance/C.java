package Inheritance;

public class C extends B{
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private String sobrenom;
    private Integer tipusnotificacioId;
    private String correuElectronic;

    public C(){
        super();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrimerCognom() {
        return primerCognom;
    }

    public void setPrimerCognom(String primerCognom) {
        this.primerCognom = primerCognom;
    }

    public String getSegonCognom() {
        return segonCognom;
    }

    public void setSegonCognom(String segonCognom) {
        this.segonCognom = segonCognom;
    }

    public String getSobrenom() {
        return sobrenom;
    }

    public void setSobrenom(String sobrenom) {
        this.sobrenom = sobrenom;
    }

    public Integer getTipusnotificacioId() {
        return tipusnotificacioId;
    }

    public void setTipusnotificacioId(Integer tipusnotificacioId) {
        this.tipusnotificacioId = tipusnotificacioId;
    }

    public String getCorreuElectronic() {
        return correuElectronic;
    }

    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
    }

    @Override
    public Integer doSomething(Integer par1) {
        return par1;
    }
}
