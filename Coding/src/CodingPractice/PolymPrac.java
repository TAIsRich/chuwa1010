package CodingPractice;

public class PolymPrac{
    public static void main(String[] args) {
        playGame(4);
        playGame();

    }

    public static void playGame(int player){
        System.out.println(player+" players play Keyoeard Game");
    }

    public static void playGame(){
        System.out.println("Controller Game");
    }
}
