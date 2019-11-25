package ua.training;

import java.lang.Math;

class Model {
    private int lowBound;
    private int topBound;
    private int secretValue;

    Model() {
        lowBound = GlobalConstants.DEFAULT_LOW_BOUND;
        topBound = GlobalConstants.DEFAULT_TOP_BOUND;
    }

    void setNewSecretValue() {
        secretValue = generateRandomIntValueInRange();
    }

    /**
     * Just for testing
     */
    int getSecretValue() {
        return secretValue;
    }

    int getLowBound() {
        return lowBound;
    }

    int getTopBound() {
        return topBound;
    }

    boolean checkValue(int value) {
        if (value == secretValue) {
            return true;
        } else if (value < secretValue) {
            lowBound = value;
        } else {
            topBound = value;
        }
        return false;
    }

    /**
     * To test this method run testGenerateRandomIntValueInRangeFrom0To100
     * test is @Ignored by default
     */
    int generateRandomIntValueInRange() {
        return (int) Math.ceil
                (Math.random() * (topBound - lowBound - 1) + lowBound);
    }

}
