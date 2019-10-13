package org.fastrackit;

public class Fractie {

        public int mathfract (int a, int b) {
            int cat = a / b;
            int rest = a % b;
            System.out.println("Rezutatul fractiei dintre " + a + " si " + b + " este compus din " + cat + " si restul " + rest);
            return cat;
        }

        public double mathfract (int a, double b) {
            double imp = a / b;
            System.out.println("Rezutatul fractiei dintre " + a + " si " + b + " este " + imp);
            return imp;
        }

        public double mathfract (double a, int b) {
            double imp = a / b;
            System.out.println("Rezutatul fractiei dintre " + a + " si " + b + " este " + imp);
            return imp;
        }

        public double mathfract (double a, double b) {
            double imp = a / b;
            System.out.println("Rezutatul fractiei dintre " + a + " si " + b + " este " + imp);
            return imp;
        }
    }


