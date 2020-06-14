package JC1.Homework.Homework7.Task3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GameSimulator {

    private Set<Integer> gameNumbers;
    private Map<Integer, Participant> participants;
    private int numberOfParticipants;
    private final Scanner scanner;

    public GameSimulator() {
        scanner = new Scanner(System.in);
    }

    public void startGameProcess() {
        int continueGame;
        while (true) {
            setNumberOfParticipants();
            ParticipantFactory.createParticipants(numberOfParticipants);
            setParticipantsInGame();
            printParticipantsNumbers();
            setParticipantIsSelected();
            setGameNumbers();
            printGameNumbers();
            printWinResults(participants);

            printMenuAfterGame();
            continueGame = scanner.nextInt();
            System.out.println();
            if (continueGame == 0) {
                exit();
            }
        }
    }

    private void setGameNumbers() {
        gameNumbers = NumberGenerator.generateNumbers(6);
    }

    private void setParticipantsInGame() {
        participants = ParticipantFactory.createParticipants(numberOfParticipants);
    }

    private void setNumberOfParticipants() {
        System.out.println("Введите количество игроков: ");
        numberOfParticipants = scanner.nextInt();
    }

    private void printWinResults(Map<Integer, Participant> participants) {
        for (Map.Entry<Integer, Participant> entry : participants.entrySet()) {
            entry.getValue().setParticipantWin(winCheck(entry.getValue().getParticipantGameNumbers(), gameNumbers));
        }
        System.out.print("Выиграли игроки с номерами: ");
        boolean marker = false;
        for (Map.Entry<Integer, Participant> entry : participants.entrySet()) {
            if (entry.getValue().isParticipantWin()) {
                System.out.print(entry.getKey() + " ");
                marker = true;
            }
        }

        if (marker) {
            printMyParticipantIsWin();
        } else {
            System.out.print("\nНет победителей в этом розыгрыше\n");
        }
    }

    private void setParticipantIsSelected() {
        System.out.println("Введите пользователя по номеру: ");
        participants.get(scanner.nextInt()).setParticipantSelected(true);
    }

    private boolean winCheck(Set<Integer> gameNums, Set<Integer> participantNums) {
        // долго не понимал, почему gameNums.containsAll(participantNums) не работает,
        // написал вообще другой метод через итератор ниже, а потом понял, что нужно меньшее множество
        // писать первым в containsAll()
        return participantNums.containsAll(gameNums);
//        Iterator<Integer> iterator = participantNums.iterator();
//        int coincidence = 0;
//        while (iterator.hasNext()) {
//            if (gameNums.contains(iterator.next())) {
//                coincidence++;
//            }
//        }
//        return coincidence == 3;
    }

    private void printGameNumbers() {
        System.out.println("Выигрышный набор:");
        for (int i : gameNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void printParticipantsNumbers() {
        for (Map.Entry<Integer, Participant> entry : participants.entrySet()) {
            System.out.print("Игрок № " + entry.getKey() + " Числа: ");
            for (int i : entry.getValue().getParticipantGameNumbers()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private void printMyParticipantIsWin() {

        for (Map.Entry<Integer, Participant> entry : participants.entrySet()) {
            if (entry.getValue().isParticipantSelected()) {
                if (entry.getValue().isParticipantWin()) {
                    System.out.println("\nВыбранный Вами игрок № " + entry.getKey() + " выиграл!");
                } else {
                    System.out.println("\nВыбранный Вами игрок не выиграл");
                }
                break;
            }
        }
    }

    private void printMenuAfterGame() {
        System.out.println("\nХотите сыграть еще?");
        System.out.println("Ведите любое число для продолжения игры");
        System.out.println("Введите 0 для завершения игры");
    }

    private void exit() {
        scanner.close();
        Runtime.getRuntime().exit(0);
    }
}
