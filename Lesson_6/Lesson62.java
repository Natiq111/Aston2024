import java.util.Arrays;
public class Lesson62 {
    
    public static void main(String[] args) {
        
        Worker[] wrkArray = new Worker[5];
        wrkArray[0] = new Worker("Пашнева Наталья Владимировна", "тестировщик", "a_sfera@mail.ru", "89132292809", 50000, 40);
        wrkArray[1] = new Worker("Иванов Иван Иванович", "старший тестировщик", "1@mail.ru", "81111111111", 60000, 30);
        wrkArray[2] = new Worker("Петров Петр Петрович", "младший тестировщик", "2@mail.ru", "82222222222", 20000, 20);
        wrkArray[3] = new Worker("Сидоров Сидор Сидорович", "программист", "2@mail.ru", "83333333333", 100000, 35);
        wrkArray[4] = new Worker("Кузьмин Кузьма Кузьмич", "уборщик", "3@mail.ru", "84444444444", 20000, 60);
    
    wrkArray[0].Print();
    wrkArray[1].Print();
    }
}
