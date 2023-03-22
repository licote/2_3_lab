import java.util.Random;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    double[] db = new double[5];
    double suma = 0;

    for (int i = 0; i < 5; i++) {
      db[i] = r.nextDouble() * 100;
      suma += Math.pow(db[i], 2);
    }
    System.out.println("Liczby: " + db[0] + " " + db[1] + " "
        + db[2] + " " + db[3] + " " + db[4]);
    System.out.println("Suma kwadratów: " + suma);
  }
}