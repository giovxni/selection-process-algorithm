import java.util.Scanner;

public class SelectionProcessUser {
    public static void main(String[] args) {
        SelectionProcessLogic process = new SelectionProcessLogic();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the selection process");
        System.out.println("Selecting candidates, please, wait.");
        process.selectCandidates();
    }
}
