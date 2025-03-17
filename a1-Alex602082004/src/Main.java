import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/// Afișați numerele pătrate perfecte care se regăsesc între argumentele în linia de comandă a programului.
///  În cazul în care programul este pornit fără furnizarea a cel puțin un argument în linia
/// de comandă, citiți aceste valori prin interfața cu utilizatorul.


public class Main {

    private static boolean SquareVerify(int n) {
        int i = (int) Math.sqrt(n);
        return i * i == n;
    }

    private static Vector<Integer> SquaresVector(Vector<Integer> v) {
        Vector<Integer> squares = new Vector<>();
        for (int i = 0; i < v.size(); i++) {
            if (SquareVerify(v.elementAt(i)))
                squares.add(v.elementAt(i));
        }
        return squares;
    }

    private static Vector<Integer> generator() {
        Vector<Integer> cin = new Vector<>();
        Scanner sc = new Scanner(System.in);
        while (true)
            try {
                int n = sc.nextInt();
                if (n == 0) break;
                cin.add(n);
            } catch (InputMismatchException e) {
                sc.next();
            }
        return cin;
    }

    private static Vector<Integer> ArgumentsSquares(String[] args) {
        Vector<Integer> squares = new Vector<>();
        for (String arg : args) {
            try {
                if (SquareVerify(Integer.parseInt(arg))) squares.add(Integer.parseInt(arg));
            } catch (Exception _) {
            }
        }
        return squares;
    }

    public static void main(String[] args) {

        Vector<Integer> arguments = new Vector<>();
        while (true) {
            try {

                System.out.print("1.Generare numere\n");
                System.out.print("2.Afisare patrate perfecte generate\n");
//                System.out.print("3.Afisare patrate perfecte din argumente\n");
                System.out.print("0.Iesire\n");
                System.out.print("Alege optiunea:");
                Scanner scanner = new Scanner(System.in);
                int option = scanner.nextInt();
                if (option>2) throw new InputMismatchException();

                if (option == 0) break;

                if (option == 1) {
                    System.out.println("Introdu 0 ca sa nu mai adaugi numere si enter sau space pentru a adauga un numar nou!");
                    arguments = generator();
                    System.out.printf("Numerele adaugate:" + arguments + "\n");
                }

                if (option == 2)
                    System.out.println("Patrate perfecte generate:" + SquaresVector(arguments) + "\n");

//                if (option == 3) {
//                    System.out.println("Patrate perfecte din argumente:" + ArgumentsSquares(args) + "\n");
//                }
            } catch (Exception e) {
                System.out.println("Comanda incorecta!");
            }
        }
    }
}
