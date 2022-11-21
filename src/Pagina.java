import java.util.*;
public class Pagina {

    private int seleccion;

    public Pagina(){
        seleccion = 0;
    }

    public Pagina(int seleccion){

        this.seleccion = seleccion;
    }

    public void CrearAlbum(){
        Album album1 = new Album();
        Album album2 = new Album();
        Album album3 = new Album();
        Album album4 = new Album();
    }
    public Usuario Validacion (ArrayList <Usuario> ArrayUsuario,String usuario, String contraseña){
        for(int i=0; i<ArrayUsuario.size(); i++){
            Usuario validacion = ArrayUsuario.get(i);
            if(validacion.getnombre().equals(usuario) && validacion.getcontraseña().equals(contraseña)){
                return  validacion;
            }
        }
        return null;
    }

    public void RegistrarAlbum(ArrayList <Album> ArrayAlbum, Usuario usr){
        Scanner in = new Scanner(System.in);
        Album album = new Album();
        System.out.println("Ingresa el año de tu album: ");
        int año = Integer.parseInt(in.nextLine());
        System.out.println("Ingresa el nombre del album: ");
        String nombre = in.nextLine();
        System.out.println("Ingresa el numero de estampas del album: ");
        int numEstampas = Integer.parseInt(in.nextLine());
        album.setUsuario(usr);
        album.setaño(año);
        album.setnombre(nombre);
        album.setnumEstampas(numEstampas);
        ArrayAlbum.add(album);
        System.out.println("Se ha registrado tu Album");
    }

    public void RegistrarEstampas(ArrayList <Estampa> ArrayEstampas){
        Scanner in = new Scanner(System.in);
        Estampa estampa = new Estampa();
        System.out.println("Ingresa el numero de la estampa: ");
        int numEstampa = Integer.parseInt(in.nextLine());
        System.out.println("Ingresa el nombre del jugador de tu estampa: ");
        String nombre = in.nextLine();
        estampa.setnombre(nombre);
        estampa.setnumEstampa(numEstampa);
        ArrayEstampas.add(estampa);
        System.out.println("Se ha agregado tu estampa");
    }

    public void buscarEstampa(ArrayList <Estampa> ArrayEstampas){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de la estampa:");
        int numero = Integer.parseInt(in.nextLine());
        for(int i=0; i<ArrayEstampas.size();i++){
            Estampa estampas = ArrayEstampas.get(i);
            if(estampas.getnumEstampa()==numero){
                System.out.println(estampas.getnombre() + ", "+ estampas.getnumEstampa());
            }
            else{
                System.out.println("No tienes esa estampa :(");
            }
        }
    }

    public void consultarPrecio(ArrayList <Estampa> ArrayEstampas){
        for(int i=0; i<ArrayEstampas.size();i++) {
            Estampa estampa = ArrayEstampas.get(i);
            System.out.println("Index-Jugador-Num. Estampa");
            System.out.println(String.valueOf(i)+ ". "+ estampa.getnombre()+ ", "+estampa.getnumEstampa());
            Scanner in = new Scanner(System.in);
            System.out.println("Ingresa el numero de estampa de la que te gustaria saber su precio: ");
            int numero = Integer.parseInt(in.nextLine());
            if (estampa.getnumEstampa() == numero) {
                Random random = new Random();
                System.out.println(numero +" " +estampa.getnombre()+" Q." + random.nextInt(200));
                estampa.setPrecio(random);
            }
        }
    }
}
