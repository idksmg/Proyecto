public class EstampaEspecial extends Estampa {

    private int tipo;
    private String paisLeyenda;
    private String paisEscudo;

    public EstampaEspecial(){
        super();
        tipo = 0;
        paisLeyenda = "";
        paisEscudo = "";
    }

    public EstampaEspecial(int numEstampa, String nombre, int precio, int tipo, String paisLeyenda, String paisEscudo){
        super(numEstampa,nombre,precio);
        this.tipo = tipo;
        this.paisLeyenda = paisLeyenda;
        this.paisEscudo = paisEscudo;
    }

    public int getTipo(){
        return tipo;
    }

    public String getPaisLeyenda(){
        return  paisLeyenda;
    }

    public String getPaisEscudo(){
        return paisEscudo;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public void setPaisLeyenda(String paisLeyenda){
        this.paisLeyenda = paisLeyenda;
    }

    public void setPaisEscudo(String paisEscudo){
        this.paisEscudo = paisEscudo;
    }
}
