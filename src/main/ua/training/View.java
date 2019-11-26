package ua.training;

class View {
    static final String EQUAL_SIGN = "=";
    static final String SPACE_SIGN = " ";
    static final String OPENS_SQUARE_BRACKET = "]";
    static final String CLOSING_SQUARE_BRACKET = "[";

    static final String INPUT_PROMPT
            = "Please input INT value in current secret number range: ";
    static final String WRONG_INPUT_MESSAGE
            = "Wrong input! Repeat please! ";
    static final String WIN_MESSAGE
            = "This is the correct number! You win! Secret number = ";
    static final String USER_INPUT_HISTORY = "User input history: ";

    void printLine(String message) {
        System.out.println(message);
    }

    String concatenateString(String... message) {
        StringBuilder resultString = new StringBuilder();

        for (String str : message) {
            resultString.append(str);
        }
        return resultString.toString();
    }
}
