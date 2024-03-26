import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcessLogic {
    private double baseWage = 2000.0;
    private String[] candidates = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
    int selectionedCandidates = 0;
    int currentCandidate = 0;

    public void selectCandidates() {
        while (selectionedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double intendedWage = ThreadLocalRandom.current().nextDouble(1800, 2200);
            if (baseWage >= intendedWage) {
                for (int x = 0; x < 1; x++) {
                    System.out.println("The candidate ".concat(candidate).concat(" was selected. "));
                    selectionedCandidates++;
                }
                int attempts = 1;
                boolean stillAttempt = true;
                boolean answered = false;
                do {
                    answered = pickUp();
                    stillAttempt = !answered;
                    if (stillAttempt) {
                        attempts++;
                    } else {
                        System.out.println("Phone answered!");
                    }
                } while (attempts < 3 && stillAttempt);
                {
                    if (answered) {
                        System.out.println("We succesfully achieved contact with ".concat(candidate).concat(" needed ".concat(String.valueOf(attempts).concat(" attemtps."))));
                    } else {
                        System.out.println("Was not possible to contact ".concat(candidate).concat(" exceed maximum limit of attempts: ".concat(String.valueOf(attempts).concat(" attemtps."))));
                    }
                }
            }
            currentCandidate++;
        }
    }
    public boolean pickUp() {
        return new Random().nextInt(3) == 1;
    }
}

