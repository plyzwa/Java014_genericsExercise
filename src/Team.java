import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;
    int losed = 0;

    private ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T p) {
        if(member.contains(p)) {
            System.out.println("This team already contains: " + p.getName());
            return false;
        } else {
            member.add(p);
            System.out.println("Player: " + p.getName() + " is added to the team: "
            + this.name);
            return true;
        }
    }
    public int howmanyPlayers() {
        System.out.println("In team: " + this.name + " number of player is: ");
        return this.member.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            System.out.println("Our team won against " + opponent.getName());
            this.won++;
        }
        else if (ourScore == theirScore) {
            System.out.println("We tied against " + opponent.getName());
            this.tied++;
        }
        else {
            System.out.println("We lost against " + opponent.getName());
            this.losed++;
        }
        this.played++;
        System.out.println("This was our " + this.played + " match");
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.won > team.won) {
            return -1;
        }
        else if (this.won == team.won) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
