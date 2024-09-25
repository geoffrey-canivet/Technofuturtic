public class LogLevels {
    
    public static String message(String logLine) {
            // Trouve la position de la première occurrence de "]:"
            int endIndex = logLine.indexOf("]:") + 2;
            // Retourne la sous-chaîne qui commence après "]:"
            return logLine.substring(endIndex).trim();
    }


    public static String logLevel(String logLine) {
            // Trouve la position du crochet fermant
            int endIndex = logLine.indexOf("]");
            // Retourne la sous-chaîne qui commence après le crochet ouvrant
            return logLine.substring(1, endIndex).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        // Trouve la position du crochet fermant
        int endIndex1 = logLine.indexOf("]");
        int endIndex2 = logLine.indexOf("]:") + 2;
        String word1 = "(" + logLine.substring(1, endIndex1).trim().toLowerCase() + ")";
        String word2 = logLine.substring(endIndex2).trim();

        return String.join(" ", word2, word1);
    }
}