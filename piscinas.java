public class piscinas {
    public static void main(String[] args) {
        // Creamos todas la variables
        int lado1 = 300;
        int lado2 = 300;
        int lado3;
        int ancho1=150;
        int ancho2=80;
        int ancho3;
        int profundo1=20;
        int profundo2=35;
        int profundo3;
        int area1;
        int area2;
        int area3;
        int vol1;
        int vol2;
        int vol3;
        //Calculamos el area de las piscinas
        area1 = lado1 * ancho1;
        area2 = lado2 * ancho2;
        System.out.println("El area de la piscina 1 es " + area1 + " m2");
        System.out.println("El area de la piscina 2 es " + area2 + " m2");
        //Calculamos el volumen
        vol1 = area1 * profundo1;
        vol2 = area2 * profundo2;
        System.out.println("El volumen de la piscina 1 es " + vol1 + " m3");
        System.out.println("El volumen de la piscina 2 es " + vol2 + " m3");
        //Calculamos el ancho y lado de las 2 piscinas juntas
        ancho3 = ancho1 + ancho2;
        lado3 = lado1;
        System.out.println("El lado de las piscinas juntas es: " + lado3 +" metros");
        System.out.println("El ancho de las piscinas juntas es: " + ancho3 +" metros");
        // Calculamos el area de las piscinas juntas
        area3 = area1 + area2;
        System.out.println("El area de las piscinas juntas es: " + area3 +" m2");
        //Calculamos el volumen de las piscinas juntas
        vol3 = vol1 + vol2;
        System.out.println("El volumen de las piscinas juntas es: " + vol3 +" m3");
        //Itercambiamos el valor de profundidad de las piscinas
        profundo3 = profundo1;
        profundo1 = profundo2;
        profundo2 = profundo3;
        //Calculamos el nuevo volumen
        vol1 = area1 * profundo1;
        vol2 = area2 * profundo2;

        System.out.println("El volumen de la nueva piscina 1 es: " + vol1 +" metros");
        System.out.println("El volumen de la nueva piscina 2 es: " + vol2 +" metros");
    }
}
