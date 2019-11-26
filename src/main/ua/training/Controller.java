package ua.training;

import java.util.Scanner;

class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setNewSecretValue();

        while (!model.checkValue(inputIntValueWithScannerAndRange(scanner))) {
        }

        view.printLine(View.WIN_MESSAGE + model.getSecretValue());
        view.printLine(View.USER_INPUT_HISTORY
                + model.getUserHistory().toString());
    }

    private int inputIntValueWithScannerAndRange(Scanner scanner) {
        int inputValue = inputIntValueWithScanner(scanner);

        while (inputValue <= model.getLowBound()
                || inputValue >= model.getTopBound()) {
            view.printLine(View.WRONG_INPUT_MESSAGE);
            inputValue = inputIntValueWithScanner(scanner);
        }
        return inputValue;
    }

    private int inputIntValueWithScanner(Scanner scanner) {
        view.printLine(getInputIntPrompt());
        while (!scanner.hasNextInt()) {
            view.printLine(View.WRONG_INPUT_MESSAGE);
            view.printLine(getInputIntPrompt());
            scanner.next();
        }
        return scanner.nextInt();
    }

    private String getInputIntPrompt() {
        return view.concatenateString(View.INPUT_PROMPT,
                View.OPENS_SQUARE_BRACKET, String.valueOf(model.getLowBound()),
                View.SPACE_SIGN, String.valueOf(model.getTopBound()),
                View.CLOSING_SQUARE_BRACKET, View.SPACE_SIGN, View.EQUAL_SIGN,
                View.SPACE_SIGN);
    }

}
