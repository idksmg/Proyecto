import java.util.*;
import java.util.Arrays;
public class Principal {
    public static void main(String[] args){
        int respuesta = 0;
        Pagina pagina = new Pagina();
        Usuario usr = new Usuario();
        ArrayList <Usuario> Arrayusuarios = new ArrayList<>();
        //List <String> ArrayPredeterminado = new Arrays.asList("Messi ");
        ArrayList <Estampa> ArrayEstampas = new ArrayList<>();
        ArrayList <Estampa> ArrayFaltantes = new ArrayList<>();
        ArrayList <Estampa> ArrayRepetidas = new ArrayList<>();
        ArrayList <Album> ArrayAlbum = new ArrayList<>();
        try {
            Arrayusuarios = OperacionesUsuario.leerUsuarios();
            Scanner in = new Scanner(System.in);
            System.out.println("---------BIENVENIDO A STAMPTRADE----------");
            try {
                while(respuesta !=3) {
                    System.out.println("Selecciona tu opción:\n1. Log in\n2. Crear cuenta");
                    int seleccion = Integer.parseInt(in.nextLine());
                    if (seleccion == 1) {

                        System.out.println("Ingresa tu nombre de usuario: ");
                        String usuario = in.nextLine();
                        System.out.println("Ingresa tu contraseña: ");
                        String contraseña = in.nextLine();
                        Usuario Cusuario = pagina.Validacion(Arrayusuarios, usuario, contraseña);
                        if (Cusuario != null) {
                            System.out.println("Bienvenido " + usuario + " que gusto verte de nuevo");
                            break;
                        } else {
                            System.out.println("Usuario Invalido, Intente de nuevo");
                            continue;
                        }

                    }
                    if (seleccion == 2) {
                        System.out.println("Primero ingresa tu nombre de usuario: ");
                        String nombre = in.nextLine();
                        System.out.println("Ahora ingresa tu contraseña: ");
                        String contraseña = in.nextLine();
                        usr = new Usuario(nombre, contraseña);
                        System.out.println("Gracias! Ya puedes comenzar: ");
                        OperacionesUsuario.IngresarUsuario(usr);
                        break;
                    }
                }
            }
                catch (Exception ex) {
                System.out.println("Opcion invalida " + ex.getMessage());
                }
            try {
                while (respuesta != 7) {
                    try {
                        System.out.println("¿Qué haremos hoy?\n1. Registrar mi Album\n2. Registrar estampas\n3. Buscar estampas\n4. Consultar precio en el mercado");
                        respuesta = Integer.parseInt(in.nextLine());
                        if (respuesta == 1) {
                            pagina.RegistrarAlbum(ArrayAlbum, null);
                        }
                        if (respuesta == 2) {
                            pagina.RegistrarEstampas(ArrayEstampas);
                        }
                        if (respuesta == 3) {
                            if (ArrayEstampas.size() > 0) {
                                pagina.buscarEstampa(ArrayEstampas);
                            } else {
                                System.out.println("No hay ninguna estampa para realizar esta acción");
                            }
                        }
                        if (respuesta == 4) {
                            if (ArrayEstampas.size() > 0) {
                                pagina.consultarPrecio(ArrayEstampas);
                            } else {
                                System.out.println("No hay ninguna estampa para realizar esta acción");
                            }
                        }
                    } catch (Exception ex) {
                        System.out.println("Opción Invalida " + ex.getMessage());
                    }
                }
            }
            catch (Exception ex) {
                System.out.println("Opcion invalida " + ex.getMessage());
            }
        }

        catch(Exception ex){
            System.out.println("Ocurrio un error en la Aplicación " + ex.getMessage()+ " Contacte a Soporte");
        }
    }
}
