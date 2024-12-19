public class Car {

        private String model;
        private String marka;
        int rok;
        double cena;
        private String kolor;
        int ilosc;

        //konstruktor klasy Car
        public Car(String model, String marka, int rok, double cena, String kolor, int ilosc) {
            this.model = model;
            this.marka = marka;
            this.rok = rok;
            this.cena = cena;
            this.kolor = kolor;
            this.ilosc = ilosc;
        }

    // Gettery dla każdego pola
    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public int getRok() {
        return rok;
    }

    public double getCena() {
        return cena;
    }

    public String getKolor() {
        return kolor;
    }

    public int getIlosc() {
        return ilosc;
    }

    // Settery dla każdego pola
    public void setModel(String model) {
        this.model = model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}



