package ua.training;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Model {
    private int lowBound;
    private int topBound;
    private int secretValue;
    private List<Integer> userHistory = new ArrayList<>();

    Model() {
        lowBound = GlobalConstants.DEFAULT_LOW_BOUND;
        topBound = GlobalConstants.DEFAULT_TOP_BOUND;
    }

    void setNewSecretValue() {
        secretValue = generateRandomIntValueInRange();
    }

    /**
     * To test this method run testGenerateRandomIntValueInRangeFrom0To100
     * test is @Ignored by default
     */
    int generateRandomIntValueInRange() {
        return (int) Math.ceil
                (Math.random() * (topBound - lowBound - 1) + lowBound);
    }

    int getSecretValue() {
        return secretValue;
    }

    int getLowBound() {
        return lowBound;
    }

    int getTopBound() {
        return topBound;
    }

    List<Integer> getUserHistory() {
        return userHistory;
    }

    boolean checkValue(int value) {
        addValueToUserHistory(value);
        if (value == secretValue) {
            return true;
        } else if (value < secretValue) {
            lowBound = value;
        } else {
            topBound = value;
        }
        return false;
    }

    private void addValueToUserHistory(int value) {
        userHistory.add(value);
    }

}
