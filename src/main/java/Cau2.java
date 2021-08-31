public class Cau2 {
    public boolean checkLenght(String s) {
        if (s.length() < 10) {
            return false;
        }
        return true;
    }

    public boolean checkUpper(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSpecial(String s) {
        String pattern = "[^A-Za-z0-9]";//ktu dac biet
        for (int i = 0; i < s.length(); i++) {
            if (!s.matches(pattern)) {
                return false;
            }
        }
        return true;
    }
}
