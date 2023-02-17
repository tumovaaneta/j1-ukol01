package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        nakresliPrasatko();

    }
    private void nakresliNohyPrasatka() {
        zofka.turnLeft(30);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(120);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(30);
    }

    private void nakresliPrasatko()
    {
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(60);
        zofka.move(50);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(50);
        }
        nakresliNohyPrasatka();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        nakresliNohyPrasatka();
        zofka.move(50);
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(60);
            zofka.move(15);
        }


    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
