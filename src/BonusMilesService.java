public class BonusMilesService {
    public int calculate(int balance) {
        int bonus;

        if (balance < 1099) {
            bonus = 0;
        } else {
            bonus = balance / 100;
        }
        return bonus;
    }
}
