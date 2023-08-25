package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("IN Team "+name+" was add new gamer of name "+participant.getName());
    }

    public void playWith(Team team){
        String winnerName;
        Random r = new Random();
        int i = r.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Winner team: " + winnerName);
    }
}
