package tb.soft;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String witaj, imie;

        witaj="Witaj";
        imie=args[0];

        System.out.printf("%s posiadaczu imienia %20s%n",witaj, imie);

        System.exit(0);
    }
}
