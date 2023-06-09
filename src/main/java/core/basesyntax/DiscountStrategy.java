package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final String NEW_YEAR = "New Year";
    private static final String BIRTH_DATE = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BLACK_FRIDAY:
                return new BlackFridayDiscountService();
            case BIRTH_DATE:
                return new BirthdayDiscountService();
            case NEW_YEAR:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
