package ua.training;

import java.lang.Math;

class Model {

    /**
     * To test this method run testGenerateRandomIntValueInRangeFrom0To100
     * test is @Ignored by default
     */
    int generateRandomIntValueInRange(int lowBound, int topBound) {
        return (int) Math.ceil
                (Math.random() * (topBound - lowBound - 1) + lowBound);
    }

}
