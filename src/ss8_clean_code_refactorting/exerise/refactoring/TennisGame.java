package ss8_clean_code_refactorting.exerise.refactoring;

public class TennisGame {
    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String displayResult = "";
        int tempScore = 0;
        if (firstPlayerScore == secondPlayerScore) {
            switch (firstPlayerScore) {
                case 0:
                    displayResult = "Love-All";
                    break;
                case 1:
                    displayResult = "Fifteen-All";
                    break;
                case 2:
                    displayResult = "Thirty-All";
                    break;
                case 3:
                    displayResult = "Forty-All";
                    break;
                default:
                    displayResult = "Deuce";
                    break;

            }
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            if (minusResult == 1) displayResult = "Advantage first player";
            else if (minusResult == -1) displayResult = "Advantage second player";
            else if (minusResult >= 2) displayResult = "Win for first player";
            else displayResult = "Win for second player";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerScore;
                else {
                    displayResult += "-";
                    tempScore = secondPlayerScore;
                }
                switch (tempScore) {
                    case 0:
                        displayResult += "Love";
                        break;
                    case 1:
                        displayResult += "Fifteen";
                        break;
                    case 2:
                        displayResult += "Thirty";
                        break;
                    case 3:
                        displayResult += "Forty";
                        break;
                }
            }
        }
        return displayResult;
    }
}
