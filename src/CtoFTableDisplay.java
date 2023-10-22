public class CtoFTableDisplay {
    public static void main (String [] args){
        for (double degree = -100; degree <= 100; degree++){
            double fahrenheit = CtoF(degree);
            System.out.printf("%.2f° C     %.2f° F\n", degree, fahrenheit);
        }
    }

    public static double CtoF(double Celsius){
        return Celsius * 1.8 + 32;
    }
}
