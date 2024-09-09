import Actor.Human;
import Market.Market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        // Покупатели.
        Human h = new Human("Steve");
        Human h1 = new Human("Van");
        Human h2 = new Human("Mark");
        Human h3 = new Human("Billy");
        Human h4 = new Human("Brad");

        // Покупатели заходят магазин.
        market.acceptToMarket(h);
        market.acceptToMarket(h1);
        market.acceptToMarket(h2);
        market.acceptToMarket(h3);
        market.acceptToMarket(h4);

        // Обновление магазина.
        market.update();
    }
}