public class Sala {
    private String nazwaSali;
    private int iloscMiejsc;
    private String nazwaSzkoly;

    public Sala(String nazwaSali, int iloscMiejsc, String nazwaSzkoly){
        this.nazwaSali = nazwaSali;
        this.iloscMiejsc = iloscMiejsc;
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public String getNazwaSali(){
        return nazwaSali;
    }
    public int getIloscMiejsc(){
        return iloscMiejsc;
    }

    public String getNazwaSzkoly(){
        return nazwaSzkoly;
    }
}
