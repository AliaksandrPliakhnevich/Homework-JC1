package JC1.Homework.Homework4.Homework4v2;

import java.util.Scanner;

public class GameSimulator {

    /**
     * NOTE! Не добавил модификаторы доступа для полей класса и методов
     */
    
    // исправил, добавил модификаторы

    private int[] gameNumbers;
    private Participant[] participants;
    private int numberOfParticipants;
    private final Scanner scanner;
    
    public GameSimulator(){
        scanner = new Scanner(System.in);
    }
    
    public void startGameProcess(){
        int continueGame;
        while(true){
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
            if (continueGame == 0){
                exit();
            }
        }        
    }
      
    private void setGameNumbers(){
        gameNumbers = NumberGenerator.generateNumbers(6);
    }
    
    private void setParticipantsInGame(){
        participants = ParticipantFactory.createParticipants(numberOfParticipants);
    }
    
    private void setNumberOfParticipants(){
        System.out.println("Введите количество игроков: ");
        numberOfParticipants = scanner.nextInt();
    }
    
    private void printWinResults(Participant[] participants){
        for (int i = 0; i < participants.length; i++){
            /**
             * NOTE! Тут можно упростить. Сразу присвоить результат выиграл или нет
             *
             * participants[i].participantWin = winCheck(participants[i].participantGameNumbers, gameNumbers)
             */
            
            // упростил, но мне кажется, такую длинную строку сложнее понимать
            
            participants[i].setParticipantWin(winCheck(participants[i].getParticipantGameNumbers(), gameNumbers));    
        }
        System.out.print("Выиграли игроки с номерами: ");
        boolean marker = false;
        for (int i = 0; i < participants.length; i++){
            if (participants[i].isParticipantWin()){
                System.out.print(participants[i].getNumberOfParticipant() + " ");
                marker = true;
            }
        }
        if (marker){
            printMyParticipantIsWin();
        } else {
            System.out.print("\nНет победителей в этом розыгрыше\n");
        }
    }
    
    private void setParticipantIsSelected(){
        System.out.println("Введите пользователя по номеру: ");
        participants[scanner.nextInt() - 1].setParticipantSelected(true);
    }
    
    private boolean winCheck(int[] gameNums, int[] participantNums){
        int coincidence = 0;
        /**
         * NOTE! Судя по логике в цикле. Тут у тебя ошибка.
         * У тебя никогда coincidence не будет равен 3. Потому, что
         * ты останавливаешь цикл сразу же как находишь одинаковые
         * цифры в массивах. Стоит еще учитывать значение coincidence
         * в условии внутри цикла.
         */
        
        // coincidence будет равен 3 в случае трёх совпадений, break прерывает 
        // только внутренний цикл, чтоб лишний раз не бегать по массиву gameNums
        // я проверял, нормально показывает выигрышные наборы
        // в условии цикла coincidence учёл
        
        for (int i = 0; i < participantNums.length && coincidence != 3; i++){
            for (int j = 0; j < gameNums.length; j++){
                if (gameNums[j] == participantNums[i]) {
                    coincidence++;
                    break;
                }
            }
        }
        return coincidence == 3;
    }
    
    private void printGameNumbers(){
        System.out.println("Выигрышный набор:");
        for (int element: gameNumbers){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    private void printParticipantsNumbers(){
        for (Participant element: participants){
            System.out.print("Игрок № " + element.getNumberOfParticipant() + " Числа: ");
            for (int i: element.getParticipantGameNumbers()){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    private void printMyParticipantIsWin(){
        /**
         * NOTE! Вместо булевой переменой, я бы завел переменную Participant
         * и в цикле искал бы игрока, которого я выбрал, а после цикла я бы проверил
         * выиграл он или нет.
         */

        // исправил так, на сколько понял, и вынес это в одтельный метод.
        // думаю, проверить выиграл наш игрок или нет можно было бы и в цикле до слова break, но согласен, так понятнее
        // если тут можно правильнее написать, сообщите мне потом

        Participant p = new Participant(0,new int[3]);
        for (int i = 0; i < participants.length; i++){
            /**
             * NOTE! Если у тебя булевы значения, то не нужно
             * их сравнитвьа с true или false. Нужно использовать логические операторы.
             * В твоем случае, не нужно их сравнивать с true.
             */

            // исправил

            p = participants[i];
            if (p.isParticipantSelected()){
                break;
            }
        }
        if (p.isParticipantWin()) {
            System.out.println("\nВыбранный Вами игрок № " + p.getNumberOfParticipant() + " выиграл!");
        } else {
            System.out.println("\nВыбранный Вами игрок не выиграл");
        }
    }
    
    private void printMenuAfterGame(){
        System.out.println("\nХотите сыграть еще?");
        System.out.println("Ведите любое число для продолжения игры");
        System.out.println("Введите 0 для завершения игры");
    }
    
    private void exit() {
        scanner.close();
        Runtime.getRuntime().exit(0);
    }
}
