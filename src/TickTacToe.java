import util.Input;

public class TickTacToe {
    public static void main(String[] args) {

        System.out.println("Player please pick a space...");
        Input input = new Input();
        String userInput;
        userInput = input.getString().toLowerCase();

        String[][] matrix = {
                {"---", "---", "---"},
                {"---", "---", "---"},
                {"---", "---", "---"}
        };

        System.out.println(" -A- -B- -C- ");

        for (String[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("|");

            for (String n : row) {
                System.out.print(n + "|");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

    }
}
