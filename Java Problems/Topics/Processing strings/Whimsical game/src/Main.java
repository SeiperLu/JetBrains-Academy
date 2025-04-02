class WhimsicalGame {
    public String isMagicalMirror(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        if (reversed.equals(input)) {
            return input + " is a palindrome";
        } else {
            return input + " is not a palindrome";
        }
    }
}
