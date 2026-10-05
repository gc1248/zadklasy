
public class Main {
    public static void main(String[] args) {

        Sala sala1 = new Sala("Sala 1", 20, "SP 1");
        Sala sala2 = new Sala("Sala 2", 30, "SP 1");

        System.out.println("Nazwa sali: " + sala1.getNazwaSali() +
                ", Ilość miejsc: " + sala1.getIloscMiejsc() +
                ", Nazwa szkoly: " + sala1.getNazwaSzkoly());


        System.out.println("Nazwa sali: " + sala2.getNazwaSali() +
                ", Ilosc miejsc: " + sala2.getIloscMiejsc() +
                ", Nazwa szkoły: " + sala2.getNazwaSzkoly());


    }
}