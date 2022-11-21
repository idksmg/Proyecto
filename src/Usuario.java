public class Usuario {
    private int IDusuario;
    private String nombre;
    private String contraseña;
    private String correo;



    public Usuario(){

    }

    public Usuario( String nombre, String contraseña) {
        this.IDusuario = IDusuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;

    }

    public int getIDusuario() {

        return IDusuario;
    }

    public String getnombre() {

        return nombre;
    }

    public String getcontraseña() {

        return contraseña;
    }

    public String getcorreo() {

        return correo;
    }

    public void setnombre(String nombre) {

        this.nombre = nombre;
    }

    public void setIDusuario(int IDusuario) {

        this.IDusuario = IDusuario;
    }

    public void setcontraseña(String contraseña) {

        this.contraseña = contraseña;
    }

    public void setcorreo(String correo) {

        this.correo = correo;
    }
}
