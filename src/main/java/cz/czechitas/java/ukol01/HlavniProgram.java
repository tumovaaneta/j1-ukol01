package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
private Turtle zofka;
    public void start() {
        zofka = new Turtle();
//        nakresliPrasatko();
//        nakresliOsmiuhelnik();
//        nakresliKruh();
//        nakresliSlunicko();
        nakresliPrasatko();
        prejdiNaDomecky();
        nakresliPetDomecku();
        prejdiNaSlunicko();
        nakresliSlunicko();
        prejdiNaLevyDomecek();
        nakresliDomecek();
        prejdiNaPravyDomecek();
        nakresliDomecek();
    }
    private void nakresliPrasatkoNohy() {
//        vylepsit - funkce nakresliNohu,kterou 2xzavolam
        zofka.turnLeft(30);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(120);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(30);
    }

    private void nakresliObdelnik(){
        for (int i = 0; i < 2; i++) {
            zofka.move(80);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
    }

    private void nakresliTrojuhelnik(){
        zofka.move(80);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(80);
        }
    }
    private void nakresliPrasatkoOcasek(){
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(60);
            zofka.move(15);
        }
    }
   private void prejdiNaDruhouCast(){
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(300);
   }

   private void prejdiVpravo(){
       zofka.penUp();
       zofka.turnRight(90);
       zofka.move(200);
       zofka.penDown();
   }

    private void nakresliPaprsek() {
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void prejdiNaDomecky() {
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
    }
    private void prejdiVlevo() {
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        zofka.turnLeft(180);
    }
    private void nakresliDomecek() {
        nakresliObdelnik();
        zofka.turnLeft(60);
        nakresliTrojuhelnik();
    }

    private void prejdiNaSlunicko(){
        zofka.penUp();
        zofka.move(275);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();
    }

    private void prejdiNaLevyDomecek() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(125);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void prejdiNaPravyDomecek() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(600);
        zofka.penDown();
    }

//   Cast 1
    private void nakresliPrasatko() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(90);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliObdelnik();
        zofka.turnLeft(60);
        nakresliTrojuhelnik();
        nakresliPrasatkoNohy();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        nakresliPrasatkoNohy();
        zofka.move(80);
        nakresliPrasatkoOcasek();
    }

//    Cast 2
private void nakresliOsmiuhelnik(){
    prejdiNaDruhouCast();
    zofka.turnRight(90);
    zofka.penDown();
    for (int i = 0; i < 8; i++) {
        zofka.move(40);
        zofka.turnRight(45);
    }
    zofka.move(20);
    prejdiVpravo();
}

private void nakresliKruh(){
        zofka.turnLeft(90);
        zofka.penDown();
    for (int i = 0; i < 36; i++) {
        zofka.move(8);
        zofka.turnRight(10);
    }
    prejdiVpravo();
}


private void nakresliSlunicko(){
        zofka.turnLeft(90);

        int pocitatlo = 0;
    for (int i = 0; i < 36; i++) {
        zofka.move(8);
        zofka.turnRight(10);
        pocitatlo++;
        if (pocitatlo== 3 ){
            nakresliPaprsek();
            pocitatlo=0;
        }
    }
}

// Cast 3
    private void nakresliPetDomecku() {
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
            prejdiVlevo();
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
