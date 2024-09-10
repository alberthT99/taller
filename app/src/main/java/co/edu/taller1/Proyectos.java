package co.edu.taller1;

public class Proyectos {

    private Integer id;
    private String tipo;
    private String zona;
    private String proyectosCustom;

    public Proyectos(Integer id, String tipo, String zona) {
        this.id = id;
        this.tipo = tipo;
        this.zona = zona;
    }


    public Proyectos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        this.proyectosCustom = this.proyectosCustom = id+" "+tipo+" "+zona;
        return proyectosCustom;
    }

}
