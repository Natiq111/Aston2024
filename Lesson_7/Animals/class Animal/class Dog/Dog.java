public class Dog extends Animal
        {
            static int count;
            int meters;
            private String color;
            public Dog(String name, String color)
            {
                super(name);
                count++;
                this.color = color;
            }
            public void Run(int meters)
            {
                if(meters > 500)
                {
                    System.out.println("Собака не может бежать дальше 500 метров");
                }
                else 
                {
                    System.out.println(color + " " + name + " пробежал " + meters + " метров");
                }
            }
            
            public void Swim(int meters)
            {
                if(meters > 10)
                {
                    System.out.println("Собака не может плыть дальше 10 метров");
                }
                else
                {
                System.out.println(color + " " + name + " проплыл " + meters + " метров");
                }
            }
        }