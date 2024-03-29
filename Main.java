package HW_2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());

        zoo.addList(new Wolf("Wolf"))
                .addList(new Hare("Hare"))
                .addList(new Duck("DonaldDuck"))
                .addList(new Bat("Batman"))
                .addList(new Shark("Lenny"))
                .addList(new Fish("Oscar"));
        for (var item: zoo.getListAnimal()) {
            System.out.println(item);
        }
        for(var item: zoo.getSayble()){
            System.out.println(item.say());
        }
        System.out.println("------------------");
        for (var item: zoo.walkables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForWalk());
        }
        System.out.println("-----------------");
        for (var item: zoo.flyables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForFly());
        }
        System.out.println("-----------------");
        for (var item: zoo.swimables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForSwim());
        }
        System.out.println("----------------");
        System.out.println("Winner " + zoo.winnerWalk());
        System.out.println("-----------------");
        System.out.println("Winner " + zoo.winnerFly());
        System.out.println("-----------------");
        System.out.println("Winner " + zoo.winnerSwim());
    }
}