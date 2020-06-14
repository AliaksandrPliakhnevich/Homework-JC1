package JC1.Homework.Homework4.Homework4v1;

import java.util.Scanner;

public class GameSimulator {
    
    int[] gameNumbers = new int[6];
    Participant[] participants;
    int numberOfParticipants;
    
    void setGameNumbers(){
        gameNumbers = NumberGenerator.generateNumbers(6);
    }
    
    void setParticipants(){
        participants = new ParticipantFactory().createParticipants(numberOfParticipants);
    }
    
    void setNumberOfParticipants(){
        System.out.println("Введите количество игроков: ");
        Scanner scan = new Scanner(System.in);
        numberOfParticipants = scan.nextInt();
    }
    
    void win(Participant[] participants){
        for (int i = 0; i < participants.length; i++){
            if (winCheck(participants[i].participantGameNumbers, gameNumbers)) {
                participants[i].participantWin = true;
            }
        }
        System.out.print("Выиграли игроки с номерами: ");
        boolean marker = false;
        for (int i = 0; i < participants.length; i++){
            if (participants[i].participantWin == true){
                System.out.print(participants[i].numberOfParticipant + " ");
                marker = true;
            }
        }
        if (marker){
            System.out.println();
            marker = false;
            for (int i = 0; i < participants.length; i++){
                if (participants[i].participantIsSelected == true && participants[i].participantWin == true){
                    System.out.println("Выбранный Вами игрок № " + participants[i].numberOfParticipant + " выиграл!");
                    marker = true;
                    break;
                }
            }
            if (!marker) {
                System.out.println("Выбранный Вами игрок не выиграл");
            }
        } else {
            System.out.print("Нет победителей в этом розыгрыше \n");
        }
    }
    
    void setParticipantIsSelected(){
        for (Participant element: participants){
            System.out.print("Игрок № " + element.numberOfParticipant + " Числа: ");
            for (int i: element.participantGameNumbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Введите пользователя по номеру: ");
        Scanner scan = new Scanner(System.in);
        int choise = scan.nextInt();
        participants[choise - 1].participantIsSelected = true;
    }
    
    boolean winCheck(int[] gameNums, int[] participantNums){
        int coincidence = 0;
        for (int i = 0; i < participantNums.length; i++){
            for (int j = 0; j < gameNums.length; j++){
                if (gameNums[j] == participantNums[i]) {
                    coincidence++;
                    break;
                }
            }
        }
        return coincidence == 3;
    }
    
    void printGameNumbers(){
        System.out.println("Выигрышный набор:");
        for (int element: gameNumbers){
            System.out.print(element + " ");
        }
        System.out.println();
    }    
}
