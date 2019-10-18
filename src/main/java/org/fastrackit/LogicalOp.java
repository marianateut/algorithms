package org.fastrackit;

public class LogicalOp {
    public static void main(String[] args) {
        LogicalOp exercises =new LogicalOp();

        LogicalOp.countAscending(10);
        LogicalOp.countDescending(-10);
        LogicalOp.countBetween(20,10);
        LogicalOp.countBetwenAscending(10,20);
        LogicalOp.countEvenNumbers();
        LogicalOp.countOddNumbers();
        exercises.sumAllNumbers(5);
        LogicalOp.printAsterisks();
    }

            public static void countAscending(int x) {
            for (int i = x; i <= 100; i++) {
                System.out.print(i + ",");
            }
            System.out.println();
        }

        public static void countDescending(int x) {

            for (int i = x; i >= -100; i--) {
                System.out.print(i + ",");
            }
            System.out.println();
        }

        public static void countBetween(int x, int y) {
            if (x < y) {
                for (int i = x; i <= y; i++)
                    System.out.print(i + ",");
            } else {
                for (int i = x; i >= y; i--) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }

        public static void countBetwenAscending(int x, int y) {
            if (x < y) {
                for (int i = x; i <= y; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = y; i <= x; i++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        public static void countEvenNumbers() {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }

        public static void countOddNumbers() {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }

        public int sumAllNumbers(int x) {
            int sum = 0;
            for (int i = x; i <= 100; i++) {
                sum += i;
            }
            System.out.print(sum);
            System.out.println();
            return sum;
        }

        public static void printAsterisks() {
            String asterisk = "*";
            for (int i = 0; i < 6; i++) {
                System.out.print(asterisk);
                for (int l = i; l < 5; l++) {
                    System.out.print(asterisk);
                }
                System.out.println();
            }
        }

    }


