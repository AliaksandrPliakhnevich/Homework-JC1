package JC1.Homework.Homework4.Homework4v2;
public class Participant {

    /**
     * NOTE! Забыл модификаторы доступа и сеттеры и геттеры
     */
    
    // добавил, все поправил
    
    private final int[] participantGameNumbers;
    private final int numberOfParticipant;
    private boolean participantSelected;
    private boolean participantWin;
    
    public Participant(int i, int[] nums){
        numberOfParticipant = i;
        participantGameNumbers = nums;
    }
    
    public int[] getParticipantGameNumbers() {
        return participantGameNumbers;
    }

    public int getNumberOfParticipant() {
        return numberOfParticipant;
    }

    public boolean isParticipantSelected() {
        return participantSelected;
    }

    public boolean isParticipantWin() {
        return participantWin;
    }

    public void setParticipantSelected(boolean participantSelected) {
        this.participantSelected = participantSelected;
    }

    public void setParticipantWin(boolean participantWin) {
        this.participantWin = participantWin;
    }
}
