package ua.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {
    private Model model;

    @Before
    public void initTestObject() {
        model = new Model();
        model.setNewSecretValue();
    }

    @Ignore
    @Test
    public void testGenerateRandomIntValueInRangeFrom0To100() {
        boolean isInRange = true;
        int value;

        for (int i = 0; i < 10000; i++) {
            value = model.generateRandomIntValueInRange();
            if (value <= 0 || value >= 100) {
                isInRange = false;
                break;
            }
        }
        Assert.assertTrue(isInRange);
    }

    @Test
    public void testCheckValueIfIsCorrectMustReturnTrue() {
        boolean isCorrect = model.checkValue(model.getSecretValue());

        Assert.assertTrue(isCorrect);
    }

    @Test
    public void testCheckValueIfIsHigherMustReturnFalse() {
        boolean isCorrect = model.checkValue(model.getSecretValue() + 1);

        Assert.assertFalse(isCorrect);
    }

}