public class EstampaEquipo extends Estampa{

    private String equipo;
    private String liga;
    private int añoDeFundacion;

    public EstampaEquipo(){
        super();
        equipo = "";
        liga = "";
        añoDeFundacion = 0;
    }

    public EstampaEquipo(int numEstampa, String nombre, int precio, String equipo, String liga, int añoDeFundacion){

        super(numEstampa,nombre, precio);
        this.equipo = equipo;
        this.liga = liga;
        this.añoDeFundacion = añoDeFundacion;
    }

    public String getequipo(){
        return equipo;
    }

    public String getliga(){
        return liga;
    }

    public int getañoDeFundacion(){
        return añoDeFundacion;
    }

    public void setequipo(String equipo){
        this.equipo = equipo;
    }

    public void setliga(String liga){
        this.liga = liga;
    }

    public void setañoDeFundacion(int añoDeFundacion){
        this.añoDeFundacion = añoDeFundacion;
    }
}
