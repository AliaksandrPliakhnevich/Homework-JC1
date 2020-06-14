package JC1.Homework.Homework7.Task3;

import java.util.Set;

public class Participant {

    private final Set<Integer> participantGameNumbers;
    private boolean participantSelected;
    private boolean participantWin;

    public Participant(Set<Integer> nums) {
        participantGameNumbers = nums;
    }

    public Set<Integer> getParticipantGameNumbers() {
        return participantGameNumbers;
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
