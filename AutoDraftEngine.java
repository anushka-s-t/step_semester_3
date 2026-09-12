import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage; // Used as the ranking metric (fantasy performance)
    boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Sort descending by batting average
    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }
}

public class AutoDraftEngine {
    // Overloaded rule 1: Established players bar (Matches >= 10, ignores injuries)
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded rule 2: Combined threshold bar (Matches >= 5 and healthy)
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    static String draftAndRank(Player[] players) {
        Player[] draftablePool = new Player[players.length];
        int count = 0;

        // Filter players through the overloaded rule logic
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                draftablePool[count++] = p;
            }
        }

        // Resize array to fit exactly the total number of qualified players
        Player[] finalDraft = Arrays.copyOf(draftablePool, count);
        
        // Sorts using the Player class's native compareTo implementation
        Arrays.sort(finalDraft);

        // Construct final string response output
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < finalDraft.length; i++) {
            output.append(i + 1).append(". ").append(finalDraft[i].name);
            if (i < finalDraft.length - 1) {
                output.append(" | ");
            }
        }

        return output.toString();
    }
}
