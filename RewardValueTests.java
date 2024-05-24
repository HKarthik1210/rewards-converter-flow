import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardsConverter {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardsConverter();
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    private double getCashValue() {
        return 0;
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardsConverter();
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    private int getMilesValue() {
        return 0;
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
}
