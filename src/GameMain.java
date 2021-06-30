public class GameMain {

    public static void main(String[] args) {

        Horse horse = new Horse();
        Cow cow = new Cow();

        Player player = new GamePlayer();
        horse.subscribe(player);

        cow.eat();
        cow.sleep();
        cow.idle();
        cow.idle();

        horse.eat();
        horse.sleep();
        horse.sleep();
        horse.idle();

    }

}
