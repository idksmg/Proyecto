import java.util.Random;

public class Estampa {
        private int numEstampa;
        private String nombre;

        private Random precio;

        public Estampa(){
            numEstampa = 0;
            nombre = "";
        }

        public Estampa(int numEstampa, String nombre, int precio) {
            this.numEstampa = numEstampa;
            this.nombre = nombre;


        }

        public int getnumEstampa() {

            return numEstampa;
        }

        public String getnombre() {

            return nombre;
        }

        public Random getPrecio(){
            return precio;
        }

        public void setnombre(String nombre) {

            this.nombre = nombre;
        }

        public void setnumEstampa(int numEstampa){

            this.numEstampa = numEstampa;
        }

        public void setPrecio(Random precio){
            this.precio = precio;
        }

    }

