import java.util.Arrays;

public class SumCalculator {
    
    public static void main(String[] args) {
        String[][] mass = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        
        try {
            int a = arraySum(mass);
            System.out.println("В массиве элементов: " + a);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int arraySum(String[][] mass) throws MyArraySizeException, MyArrayDataException {
        if (mass.length != 4 || Arrays.stream(mass).anyMatch(row -> row.length != 4)) {
            throw new MyArraySizeException("Массив должен быть 4 на 4");
        }
        
        int a = 0;
        
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    a += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        
        return a;
    }
}
