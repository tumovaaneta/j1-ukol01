package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        nakresliPrasatko();

    }
    private void nakresliPrasatkoNohy() {
//        vylepsit - funkce nakresliNohu,kterou 2xzavolam
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

    private void nakresliPrasatkoTelo(){
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
    }

    private void nakresliPrasatkoHlava(){
        zofka.move(50);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(50);
        }
    }
    private void nakresliPrasatkoOcasek(){
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(60);
            zofka.move(15);
        }
    }
    private void nakresliPrasatko() {
        nakresliPrasatkoTelo();

        zofka.turnLeft(60);

        nakresliPrasatkoHlava();

        nakresliPrasatkoNohy();

        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);

        nakresliPrasatkoNohy();
        zofka.move(50);

        nakresliPrasatkoOcasek();
    }




    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
