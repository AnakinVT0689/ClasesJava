package plantas;

public class Arbusto extends Planta{
    
    private double anchoArbusto;
    private boolean esDomestico;
    private String varidad;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(double anchoArbusto, boolean esDomestico, String varidad, String colorHojas, boolean sePodaONo, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.varidad = varidad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVaridad() {
        return varidad;
    }

    public void setVaridad(String varidad) {
        this.varidad = varidad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    //parte 3
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un Arbusto");
    }
    
}
