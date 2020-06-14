package JC1.Homework.Homework4.Homework4v1;
import java.util.Scanner;

public class GameProcess {
    void gameProcess(){
        int continueGame;
        do {
            ParticipantFactory pf = new ParticipantFactory();
            GameSimulator gs = new GameSimulator();

            gs.setNumberOfParticipants();
            pf.createParticipants(gs.numberOfParticipants);
            gs.setParticipants();
            gs.setParticipantIsSelected();
            gs.setGameNumbers();
            gs.printGameNumbers();
            gs.win(gs.participants);
            
            System.out.println("\nХотите сыграть еще?");
            System.out.println("Ведите любое число для продолжения игры");
            System.out.println("Введите 0 для завершения игры");
            Scanner scan = new Scanner(System.in);
            continueGame = scan.nextInt();
            System.out.println();
        }
        while(continueGame != 0);
    }        
}
