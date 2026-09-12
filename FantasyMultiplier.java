public class FantasyMultiplier {
    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        // Directly modify the values at the specified indices without a loop
        playerScores[captainIndex] *= 2.0;
        playerScores[viceCaptainIndex] *= 1.5;
    }
}
