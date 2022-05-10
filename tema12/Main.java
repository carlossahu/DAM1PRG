package com.programacionOO.tema12;

import com.programacionOO.tema12.practica01.Practica01;
import com.programacionOO.tema12.practica02.Practica02;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Please enter an miausa");
            System.exit(0);
        }
//        Practica01 practica01 = new Practica01(args[0]);
        Practica02 practica02 = new Practica02(args[0]);

    }
}
