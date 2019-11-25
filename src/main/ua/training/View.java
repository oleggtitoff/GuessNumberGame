package ua.training;

class View {
    public static final String EQUAL_SING = "=";
    public static final String SPACE_SING = " ";
    public static final String OPENS_SQUARE_BRACKET = "]";
    public static final String CLOSING_SQUARE_BRACKET = "[";

    public static final String INPUT_PROMPT
            = "Please input INT value in current secret number range: ";
    public static final String WRONG_INPUT_MESSAGE
            = "Wrong input! Repeat please! ";
    public static final String WIN_MESSAGE
            = "This is the correct number! You win!";
    public static final String USER_INPUT_HISTORY = "User input history: ";

    public void printLine(String message) {
        System.out.println(message);
    }

    public String concatenateString(String... message) {
        StringBuilder resultString = new StringBuilder();

        for (String str : message) {
            resultString.append(str);
        }
        return resultString.toString();
    }
}
