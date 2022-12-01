public class WordMatch {

    private String secret;

    public WordMatch(String word) {
        this.secret = word;
    }

    public int scoreGuess(String guess) {
        int score = 0;
        int length = guess.length();
        for (int i = 0; i <= this.secret.length() - length; i++) {
            String check = secret.substring(i, i + length);
            if (check.equals(guess)) {
                score++;
            }
        }
        return score * length * length;
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            return guess1.compareTo(guess2) < 0 ? guess1 : guess2;
        }
    }
}
