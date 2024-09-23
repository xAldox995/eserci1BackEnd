import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ESERCIZIO 1");
        int result = Main.multiplication(8, 4);
        System.out.println("il risutato della moltiplicazione è " + result);

        String frase = Main.concatenateStrings("Ciao ", "prof");
        System.out.println(frase);

        String[] exampleArray = {"1", "2", "3", "4", "5"};
        String[] modifyArray = Main.manageArray(exampleArray, "sono la stringa indesiderata");
        System.out.println("il nuovo array è: " + Arrays.toString(modifyArray));

//        System.out.println(" ESERCIZIO 2");
//        Scanner in = new Scanner(System.in);
//ciao
//        System.out.println("Inserisci la prima Stringa");
//        String firstString = in.nextLine();
//
//        System.out.println("Inserisci la seconda Stringa");
//        String secondString = in.nextLine();
//
//        System.out.println("Inserisci la terza Stringa");
//        String thirdString = in.nextLine();
//
//
//        String normalConcatenation = Main.concatenationInOrder(firstString, secondString, thirdString);
//        String reverseConcatenation = Main.reverseOrder(firstString, secondString, thirdString);
//
//        System.out.println("Stringhe con concatenazione in ordine di insermento è: " + normalConcatenation);
//        System.out.println("Stringhe con concatenazione in ordine inverso di insermento è: " + reverseConcatenation);
//
//        in.close();

        System.out.println(" ESERCIZIO 3");

        double larghezza = 7.2;
        double altezza = 3.8;

        double perimetro = Main.perimeterOfTheRectangle(larghezza, altezza);
        System.out.println("il perimetro del rettangolo è: " + perimetro);

        int n1 = 5;
        int n2 = 8;

        System.out.println("il numero scelto è:" + Main.oddOrEven(n1));
        System.out.println("il numero scelto è:" + Main.oddOrEven(n2));

        double lato1 = 3.0;
        double lato2 = 4.0;
        double lato3 = 5.0;

        double area = Main.areaDelTringhialo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);


    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static String concatenateStrings(String x, String y) {
        return x + y;
    }

    static String[] manageArray(String[] originalArray, String newString) {
        if (originalArray.length != 5) {
            System.out.println("L'array deve essere di 5 elementi");
        }

        String[] newArray = new String[6];

        newArray[0] = originalArray[0];
        newArray[1] = originalArray[1];
        newArray[2] = newString;
        newArray[3] = originalArray[2];
        newArray[4] = originalArray[3];
        newArray[5] = originalArray[4];
        return newArray;
    }

    static String concatenationInOrder(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    static String reverseOrder(String s1, String s2, String s3) {
        return s3 + s2 + s1;
    }

    static double perimeterOfTheRectangle(double l1, double l2) {
        return 2 * (l1 + l2);
    }

    static int oddOrEven(int n) {
        return (n % 2 == 0) ? 0 : 1;
    }

    static double areaDelTringhialo (double l1, double l2, double l3){
        double semiPerimetro = (l1 + l2 + l3);
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-l1)*(semiPerimetro-l2)*(semiPerimetro-l3));
        return area;
    }

}
