public class Animal
    {
        static int count;
        String name;
        protected int meters;
        public Animal(String name)
        {
            count++;
            this.name = name;
        }
        public void Run(int meters)
        {
            System.out.println("Животное " + name + " пробежало " + meters + " метров");
        }
        public void Swim()
        {
            System.out.println("Животное" + name + " проплыло " + meters + " метров");
        }
    }
        