public class EstampaMundial extends Estampa{

    private String pais;
    private String posicion;
    private int mundialesJugados;

    public EstampaMundial(){
        super();
        pais = "";
        posicion = "";
        mundialesJugados = 0;
    }

    public EstampaMundial(int numEstampa, String nombre, int precio, String pais, String posicion, int mundialesJugados){
        super(numEstampa, nombre, precio);
        this.pais = pais;
        this.posicion = posicion;
        this.mundialesJugados = mundialesJugados;
    }

    public String getPais(){
        return pais;
    }

    public String getPosicion(){
        return posicion;
    }

    public int getMundialesJugados(){
        return mundialesJugados;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public void setMundialesJugados(int mundialesJugados){
        this.mundialesJugados = mundialesJugados;
    }
}
