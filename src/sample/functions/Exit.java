package sample.functions;

public class Exit {
    public String exitGame(int exit_status) {
        String controlSentence;
        if (exit_status == 0) {
            controlSentence = "Game exited normally";
            System.exit(exit_status);
        }
        else {
            controlSentence = "Error: Game closed irregularly";
            System.exit(exit_status);
        }
        return controlSentence;
    }
}
