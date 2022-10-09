public class Main {
    public static void main(String[] args) {

        Kare kare = new Kare();
        kare.x();
    }
}

interface Sekil extends Sekil2, Sekil3{
  int a = 3;
}

interface Sekil2 {

}

interface Sekil3 {

}

abstract class Geometri extends Dikdörtgen implements Sekil {
    public static int a = 3;
}

abstract class Geometri22 extends Kare {
   abstract void cc();
}

class Kare extends Geometri {

    void x() {
        System.out.println(Sekil.a);
    }

}

class Dikdörtgen implements Sekil, Sekil2 {

}