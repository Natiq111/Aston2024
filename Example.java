public class Example
{
    static int allfood = 0;
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Мурзик", "серый", 10);
        cat1.Run(9);
        Cat cat2 = new Cat("Вася", "рыжий", 5);
        cat2.Swim(1);
        System.out.println("Создано котов: " + Cat.count);
        System.out.println();
        
        Dog dog1 = new Dog("Шарик", "черный");
        dog1.Run(200);
        dog1.Swim(8);
        System.out.println("Создано собак: " + Dog.count);
        System.out.println();
        
        System.out.println("Создано животных: " + Animal.count);
        System.out.println();
        
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Вася", "рыжий", 5);
        cat[1] = new Cat("Мурзик", "серый", 10);
        cat[2] = new Cat("Тиша", "черный", 6);
        
        AddFood(20);
        for(int i = 0; i < cat.length; i++)
        {
            cat[i].Eat(allfood);
            allfood = allfood - cat[i].newfood;
        }
    }
    
   
   public static void AddFood(int num)
   {
       allfood = allfood + num;
       System.out.println("Теперь в миске " + allfood + " еды");
   }
}