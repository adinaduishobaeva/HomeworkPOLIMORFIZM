public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Shark shark = new Shark();
        Animal[] animals = new Animal[]{turtle, shark, eagle,};

        

        System.out.println(turtle.getClass());
        System.out.println(turtle instanceof Turtle);
        turtle.swim();
        System.out.println("------------------------------------");

        System.out.println(shark.getClass());
        System.out.println(shark instanceof Shark);
        shark.attack();

        System.out.println("-----------------------------------------");
        System.out.println(eagle.getClass());
        System.out.println(eagle instanceof Eagle);
        eagle.fly();

        Shark[] sharks = {shark};
        Eagle[] eagles = { eagle};
        Turtle[] turtles = { turtle};






    }


}
















