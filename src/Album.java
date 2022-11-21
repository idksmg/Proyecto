import java.util.*;
public class Album {
        private int año;
        private String nombre;
        private int numEstampas;

        private Usuario usuario = null;

        static ArrayList<Estampa> ArrayEstampas = new ArrayList<>();
        static ArrayList<Estampa> ArrayFaltantes = new ArrayList<>();
        static ArrayList<Estampa> ArrayRepetidas = new ArrayList<>();

        public Album(){

        }

        public Album(int año, String nombre, int numEstampas){
            this.año = año;
            this.nombre = nombre;
            this.numEstampas = numEstampas;
        }

        public int getnumEstampas() {

            return numEstampas;
        }

        public String getnombre() {

            return nombre;
        }

        public int getaño() {

            return año;
        }


        public void setnumEstampas(int numEstampas) {

            this.numEstampas = numEstampas;
        }

        public void setnombre(String nombre) {

            this.nombre = nombre;
        }

        public void setaño(int año) {

            this.año = año;
        }

        public void setUsuario(Usuario usuario){
            this.usuario = usuario;
        }



    }

