package JC1.Homework.Homework4.Homework4v2;
public class ParticipantFactory {

    /**
     * NOTE! Я бы сделал этот метод статическим. Потому, что
     * он является вспомогательным для твоей программы. Он не влияет на
     * архитектуру в целом.
     */
    
    // исправил
    
    public static Participant[] createParticipants(int n){
        Participant[] participantArray = new Participant[n];
        for (int i = 0; i < n; i++){
            participantArray[i] =  new Participant(i + 1, NumberGenerator.generateNumbers(3));
        }
        return participantArray;
    }
}
