import java.util.ArrayList;

public class Park {

    public Park()
    {
        Attractions [] atrkArray = new Attractions[50];
        atrkArray[0] = new Attractions("Чертово колесо","пн-пт", "с 09:00 до 18:00", 50);
        atrkArray[1] = new Attractions("Бешенные грибочки","пн-пт", "с 09:00 до 18:00", 100);
    }
    
        
    public class Attractions {
        private String name;
        private String hours;
        private int price;
        
        public Attractions(String name1, String hours1, int price1) {
            name = name1;
            hours = hours1;
            price = price1;
        }
    }
}
