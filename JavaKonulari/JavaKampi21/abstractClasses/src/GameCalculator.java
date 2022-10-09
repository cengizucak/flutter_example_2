public abstract class GameCalculator { //Base urada sadece bir referans tutucu görevi göruyor

    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti..");
    }
}


//abstracktsiniflar asla new lenemez