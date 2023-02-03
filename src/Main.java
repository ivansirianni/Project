public class Main {
    public static void main(String[] args) {
        //parte 1 actividades modulo3
        int valor1 = 10;
        int valor2 = 15;
        int valor3 = 4;

        var parte1 = valores(valor1, valor2, valor3);

        System.out.println(parte1);

        //parte 2 actividades modulo 3
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();

        System.out.println(miCoche.Puertas);

    }
    //llamo a la funcion parte 1
    public static int valores(int a, int b, int c){
        return a + (b * c);
    }

    //objeto y funciones parte 2
    class Coche{
        public int Puertas = 2;
        public void SumarPuerta(){
            this.Puertas++;
        }
    }

}