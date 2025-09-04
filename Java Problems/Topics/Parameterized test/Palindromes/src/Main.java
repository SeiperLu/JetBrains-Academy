class StringUtils {
    public static boolean isPalindrome(String str) {
        // your code here
        if (str == null || str.length() == 0) {
            return false;
        }
        String StrCopy = str.toLowerCase();
        StrCopy = StrCopy.replaceAll(" ", "");
        StrCopy = StrCopy.replaceAll("'", "");
        StrCopy = StrCopy.replaceAll(",", "");
        String reversCopy = new StringBuilder(StrCopy).reverse().toString();
        if (StrCopy.equals(reversCopy)) {
            return true;
        }
        return false;
    }
}