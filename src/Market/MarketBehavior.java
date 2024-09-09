package Market;

import Actor.Actor;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket();
    void update();
}
