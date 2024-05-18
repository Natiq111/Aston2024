public class Cat extends Animal
    {
            static int count;
            int meters;
            int hunger;
            int newfood;
            boolean satiety;
            String color;
            
            public Cat(String name, String color, int hunger)
            {
                super(name);
                count++;
                this.color = color;
                this.hunger = hunger;
            }
            
            public void Run(int meters)
            {
                if(meters > 200)
                {
                    System.out.println("Кот не может бежать дальше 200 метров");
                }
                else 
                {
                    System.out.println(color + " " + name + " пробежал " + meters + " метров");
                }
            }
            
            public void Swim(int meters)
            {
                System.out.println("Кот не может плыть");
            }
            
            public void Eat(int food)
            {
                if(food >= hunger)
                {
                    newfood = hunger;
                    System.out.println(color + " "+ name + " сыт ");
                    satiety = true;
                }
                else
                {
                    System.out.println(color + " "+ name + " - не хватает еды в миске ");
                    satiety = false;
                }
            }
            
            
    }