import java.util.Arrays;
import java.util.Scanner;

    public class AstonThree {

        public static void main(String[] args) {    
        
            System.out.println("Первая задача");
            printThreeWords();

            System.out.println("\n\nВторая задача");    
            checkSumSign();
            
            System.out.println("\n\nТретья задача");
            printColor();
            
            System.out.println("\n\nЧетвертая задача");
            compareNumbers();
            
            System.out.println("\n\nПятая задача");
            checkSumNumber();
            
            System.out.println("\n\nШестая задача");
            aninteger();
            
            System.out.println("\n\nСедьмая задача");
            int a7 = -10;
            boolean b7 = number(a7); 
            System.out.println(b7);
            
            System.out.println("\n\nВосьмая задача");
            prin("Hello world", 10);
            
            System.out.println("\n\nДевятая задача");
            int num = 888;
            boolean b = years(num);
            System.out.println(b);
            
            System.out.println("\n\nДесятая задача");
            massive();
            
            System.out.println("\n\nОдиннадцатая задача");
            hundred();
            
            System.out.println("\n\nДвеннадцатая задача");
            multiplic();
            
            System.out.println("\n\nТриннадцатая задача");
            square();
            
            System.out.println("\n\nЧетырнадцатая задача");
            metod(10, 5);
            
        }
        
        public static void printThreeWords() {
            System.out.printf("Orange%nBanana%nApple");
        }
        
        public static void checkSumSign() {
            int a = 3;
            int b = 6;
            int c = a + b;
            if(c >= 0){
                System.out.println ("Сумма положительная");
            }
            else {
                System.out.println("Сумма отрицательная");
            }
    }
        public static void printColor() {
            int value = 10;
            if(value <= 0) {
                System.out.println("Красный");
            }
            else if(value > 0 && value <= 100) {
                System.out.println("Желтый");
            }
            else if(value > 100) {
                System.out.println("Зеленый");
            }
    }
        public static void compareNumbers() {
            int a = 7;
            int b = 4;
            if(a >= b) {
                System.out.println("a>=b");
            }
            else {
                System.out.println("a<b");
            }
    }
     
        public static void checkSumNumber() {
            
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число");
            int num1 = in.nextInt();
            
            System.out.println("Введите второе число");
            int num2 = in.nextInt();
            
            boolean num3 = (num1 + num2 >= 10 && num1 + num2 <= 20);
            System.out.println(num3);
        }
        
        public static void aninteger() {
            
            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое число");
            int num = in.nextInt();
           
            if(num >= 0) {
                System.out.println("Это положительное число");
            }
            else {
                System.out.println("Это отрицательное число");
            }
        }
        
        public static boolean number(int a) {
        return a < 0;
        }
        
        public static void prin(String str, int a) {    
            for (int i = 0; i < a; i++) {
                System.out.println(str);
            }
        }
        
        public static boolean years(int num) {
            if (num % 400 == 0) {
                return true;
            }
            if (num % 100 == 0) {
                return false;
            }
            if (num % 4 == 0) {
                return true;
            }
            return false;
        }
        
        public static void massive() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            }
            else {mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
        }
        
        public static void hundred() {
        
            int[] mass1 = new int[100];
            for (int i = 0; i < mass1.length; i++) {
                mass1[i] = 1+i;
            }
            System.out.println(Arrays.toString(mass1));
        }
        
        public static void multiplic() {
            int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 6) {
                    mass[i] = mass[i] * 2;
                }
            }
            System.out.println(Arrays.toString(mass));
        }
        
        
            public static void square() {
               int[][] table = new int[10][10];
               
                for (int i = 0; i < table.length; i++) {
                   table[i][i] = 1;
                }
                
                for (int i = 0; i < table.length; i++) {
                    for (int j = 0; j < table.length; j++) {
                        System.out.print(table[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        public static void metod(int len, int initialValue) {
            int[] mass = new int[len];
            
            for (int i = 0; i < mass.length; i++) {
               mass[i] =  initialValue;
            }
           System.out.println(Arrays.toString(mass));
    }

}
     
     
     
     
     
     
     
     
     
     
     
     
     
     