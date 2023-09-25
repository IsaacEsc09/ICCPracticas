package icc;

public class Prueba {

    public static void main(String[] args) {
        System.out.println("***** P R A C T I C A   1 ***** \n");

        /**
         * 1. Calcula el precio total resultante de la compra de tantos
         * artículos como indica numArticulos, cada uno con precio igual a
         * precioUnitario, declara una variable que almacene ese resultado e
         * imprime su valor en pantalla.
         */
        short numArticulos = 30;
        float precioUnitario = 15.42f;
        float precioTotal = numArticulos*precioUnitario;

        System.out.println("\t Numero de Articulos:\t " + numArticulos);
        System.out.println("\t Precio Unitario:\t " + precioUnitario);
        System.out.println("\t El precio total es de:\t "+precioTotal+"\n");

        /**
         * 2. Calcula el precio de todos los artículos con IVA incluido,
         * asignando el resultado a una variable e imprime su valor en pantalla.
         */
        final double IVA = 0.16;
        float precionTotalConIVA = (float)(precioTotal * (1 + IVA));
        System.out.println("\t Porcentaje del IVA:\t " + IVA);
        System.out.println("\t El precio total incluyendo el IVA es de:\t "+precionTotalConIVA);

        /**
         * 3. imprime en pantalla los valores de las variables caracter y valor.
         */
        char caracter = 'c';
        boolean valor = true;
        System.out.println("\n\t"+caracter + "\n\t" + valor+"\n");

        /**
         * Define constantes o variables para representar los siguientes datos,
         * trata de usar un tipo de datos adecuado  (suficiente para que se
         * pueda representar lo que se necesita).
         */
        // 4. El numero de lados de una figura geométrica.
        short numLados = 3; // Puede variar el numero de acuerdo a la figura geometrica
        System.out.println("\tEl numero de lados de un triangulo son "+numLados+"\n");

        // 5. ¿Eres menor de edad?
        boolean si = true, no = false; //Para el si y el no
        System.out.println("\t¿Eres menor de edad? "+si);
        System.out.println("\t¿Eres menor de edad? "+no+"\n");

        // 6. El número 34567.236789.
        double num = 34567.236789;
        System.out.println("\tEl numero "+num+"\n");

        // 7. El símbolo $.
        char simbolo = '$';
        System.out.println("\t"+simbolo+" es un simbolo"+"\n");

        // 8. El número 14506783914
        long num1 = 14506783914L;
        System.out.println("\tEl numero "+num1+"\n");

        // 9. El área de un cuadrado cuya longitud de lado es a lo mucho 100 unidades.
        double l = 100, areaCuadrado = l*l;
        System.out.println("\tEl area del cuadrado es "+areaCuadrado+"\n");

        // 10. El valor de PI.
        final double PI = Math.PI;
        System.out.println("\tEl valor de PI es "+PI);
    }
}
