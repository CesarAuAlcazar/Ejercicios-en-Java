package A01_EjerciciosVarios;

public class A32_ArrayBidireccional {
    public static void main(String[] args) {

        double acumulado;
        double interes= 0.10;

        double [][] saldo = new double [6][5];

        for (int i = 0; i < 6; i++) {
            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1; j < 5; j++) {
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;
        }

        for (int z = 0; z < 6; z++) {
            System.out.println();
            for (int x = 0; x < 5; x++) {
                System.out.printf("%1.2f ", saldo[z][x]);
                System.out.print(" ");
            }
        }

        /*
        int[][] biArray = {{112, 213, 314}, {415, 516, 617}, {712, 813, 910}, {912, 914, 917}};

        for (int[] array : biArray) {
            for (int valor : array) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

         */

        /*
        // Para mostrar todo el contenido

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(biArray[i][j] + " , ");
            }
            System.out.println();
        }
         */

        /*
        Otra forma de declarar un Array bidireccional
        int[] [] biArray = new int[4][3];

        biArray[0][0] = 142;
        biArray[0][1] = 156;
        biArray[0][2] = 162;

        biArray[1][0] = 165;
        biArray[1][1] = 172;
        biArray[1][2] = 185;

        biArray[2][0] = 183;
        biArray[2][1] = 196;
        biArray[2][2] = 205;

        biArray[3][0] = 204;
        biArray[3][1] = 213;
        biArray[3][2] = 221;

        // Para mostrar el contenido de una posición
        System.out.println(biArray[2][2]);
         */

    }
}
