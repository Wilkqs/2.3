import java.lang.Math;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random liczba = new Random();
    double los = liczba.nextDouble(50);

    double a = liczba.nextDouble(50);
    double b = liczba.nextDouble(50);
    double c = liczba.nextDouble(50);
    double d = liczba.nextDouble(50);
    double e = liczba.nextDouble(50);

    // System.out.println(los);
    double pierwsza = Math.pow(a, 2);
    double druga = Math.pow(b, 2);
    double trzecia = Math.pow(c, 2);
    double czwarta = Math.pow(d, 2);
    double piata = Math.pow(e, 2);
    // System.out.println(a);

    double wszystko = pierwsza + druga + trzecia + czwarta + piata;

    System.out.println(wszystko);
    int n = 5;
    int dodaw=0;
    for (int i = 0; i < n; i++) {
      int randomowa = liczba.nextInt();
     dodaw = randomowa*randomowa;

    }
    System.out.println("Suma kwadratów =" + n);
  }

}