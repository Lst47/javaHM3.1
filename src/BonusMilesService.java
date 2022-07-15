public class BonusMilesService {
    public int calculate(int a) {
        int price;

        if (a < 1099) {
            price = 0;
        } else {
            price = a / 100;
        }
        return price;
    }
}
