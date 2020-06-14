package JC1.Homework.Homework4.Homework4v1;
public class Participant {
    
    int[] participantGameNumbers = new int[3];
    int numberOfParticipant;
    boolean participantIsSelected;
    boolean participantWin;
    
    Participant(int i, int[] nums){
        numberOfParticipant = i;
        participantGameNumbers = nums;
    }
}
