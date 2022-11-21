import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesUsuario {

    public static ArrayList <Usuario> leerUsuarios(){
        String nFile = "Usuarios.txt";
        File file = new File(nFile);
        ArrayList<Usuario> usrs = new ArrayList<>();
        Scanner scanner;
        String nombre, contraseña;
        if (file.exists()) {
            try {
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    Scanner delimitar = new Scanner(linea);
                    Usuario e = new Usuario();
                    delimitar.useDelimiter("\\s*,\\s*");
                    nombre = delimitar.next();
                    contraseña = delimitar.next();
                    e = new Usuario(nombre, contraseña);
                    usrs.add(e);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return usrs;
    }
    public static void IngresarUsuario(Usuario usr) {
        FileWriter flwriter = null;
        try {
            String nFile = "Usuarios.txt";
            File file = new File(nFile);
            if (!file.exists()) {
                flwriter = new FileWriter(nFile);
                //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                bfwriter.write(usr.getnombre() + "," + usr.getcontraseña() + "\n");
                bfwriter.close();

            } else {
                flwriter = new FileWriter(nFile, true);
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                bfwriter.write(usr.getnombre() + "," + usr.getcontraseña() + "\n");
                bfwriter.close();
            }
            System.out.println("Usuario Ingresado Satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
