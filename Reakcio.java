public class Reakcio {
    static boolean megvalosithato(String szoveg) {
        for (int i = 0; i < szoveg.length() - 1; i++){
            for (int j = i + 1; j < szoveg.length(); j++) {
                if (szoveg.charAt(i) == szoveg.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    static String atalakit(String eredeti) {
        StringBuilder atalakitott = new StringBuilder();
        for (int i = 0; i < eredeti.length(); i++) {
            if (eredeti.charAt(i) == ' ') {
                atalakitott.append("   ");
            } else {
                atalakitott.append(":regional_indicator_");
                atalakitott.append(eredeti.charAt(i));
                atalakitott.append(": ");
            }
        }
        return atalakitott.toString();
    }
}
