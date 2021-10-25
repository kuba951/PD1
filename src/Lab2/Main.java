package Lab2;

public class Main {
    public static void main(String[] args) {


        String imie = args[0];
        String pseudo = args[1];
        System.out.println("Hello world! " + imie + " " + pseudo);

        imie = imie.replaceAll("[AaEeIiOoUuYy]","z");
        pseudo = pseudo.replaceAll("[AaEeIiOoUuYy]","z");

        System.out.println(imie);

        //jj
    }
}
