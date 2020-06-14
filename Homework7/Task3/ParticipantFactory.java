package JC1.Homework.Homework7.Task3;

import static JC1.Homework.Homework7.Task3.NumberGenerator.generateNumbers;
import java.util.LinkedHashMap;
import java.util.Map;

public class ParticipantFactory {

    public static Map<Integer, Participant> createParticipants(int n) {
        // тут или LinkedHashMap или TreeMap, но мне кажется как раз наш случай,
        // когда нужно хранить ключи в порядке их добавления, т.е.использую LinkedHashMap
        Map<Integer, Participant> participants = new LinkedHashMap<>(n);
        for (int i = 0; i < n; i++) {
            participants.put(i + 1, new Participant(generateNumbers(3)));
        }
        return participants;
    }
}
