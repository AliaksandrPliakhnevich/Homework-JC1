package JC1.Homework.Homework4.Homework4v1;
public class ParticipantFactory {
    Participant[] createParticipants(int n){
        Participant[] participantArray = new Participant[n];
        for (int i = 0; i < n; i++){
            participantArray[i] =  new Participant(i + 1, NumberGenerator.generateNumbers(3));
        }
        return participantArray;
    }
}
