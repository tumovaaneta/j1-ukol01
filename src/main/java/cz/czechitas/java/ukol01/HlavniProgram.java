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
        prejdiNaJmeno();
        napisA();
        napisN();
        napisE();
        napisT();
        napisA();
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
    private void nakresliPrasatkoNohy() {

        zofka.turnLeft(30);
        nakresliPrasatkuNohu();
        zofka.turnLeft(120);
        nakresliPrasatkuNohu();
        zofka.turnLeft(30);
    }

    private void nakresliPrasatkuNohu() {
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
    }




    private void nakresliPrasatkoOcasek(){
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(60);
            zofka.move(15);
        }
    }
//********************************************************
// Cast 2
//********************************************************
   private void prejdiNaDruhouCast(){
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(300);
   }

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

    private void prejdiVpravo(){
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
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

    private void nakresliPaprsek() {
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
    }
//******************************************************************
//    Cast 3
//    **************************************************************
    private void prejdiNaDomecky() {
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
    }

    private void nakresliPetDomecku() {
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
            prejdiVlevo();
        }
    }

    private void nakresliDomecek() {
        nakresliObdelnik();
        zofka.turnLeft(60);
        nakresliTrojuhelnik();
    }
    private void prejdiVlevo() {
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        zofka.turnLeft(180);
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

//    ***************************************************************
//    Cast 4
//    ***************************************************************
    private void prejdiNaJmeno() {
        zofka.penUp();
        zofka.move(600);
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);

    }

    private void napisA() {
        zofka.penDown();
        zofka.turnRight(15);
        zofka.move(100);
        zofka.turnRight(150);
        zofka.move(60);
        zofka.turnRight(105);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(75);
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(75);
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisN() {
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(160);
        zofka.move(105);
        zofka.turnLeft(160);
        zofka.move(100);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisE() {
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(90);
        for (int i = 0; i < 2; i++) {
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
            zofka.move(50);
            zofka.turnLeft(90);
        }
        zofka.move(30);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(90);
    }

    private void napisT() {
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
    }



    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
