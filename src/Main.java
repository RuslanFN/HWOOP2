public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor human1 = new Human("Вася");
        Actor human2 = new Human("Петя");
        Actor human3 = new Human("Ваня");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();

    }
}