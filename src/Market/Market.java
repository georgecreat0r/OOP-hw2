package Market;

import Actor.Actor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior {

    List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        System.out.println("Посетитель " + actor.getName() + " зашёл в магазин и добавлен в очередь.");
    }

    @Override
    public void releaseFromMarket() {
        releaseFromQueue();
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromMarket();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (int i = 0; i < queue.size(); i++) {
            if (!queue.get(i).isMakeOrder()){
                queue.get(i).setMakeOrder();
            }
        }
    }

    @Override
    public void giveOrders() {
        Actor actor;
        for (int i = 0; i < queue.size(); i++) {
            actor = queue.get(i);
            if (actor.isMakeOrder()) {
                actor.setTakeOrder();
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        Iterator<Actor> iterator = queue.iterator();
        Actor actor;
        while (iterator.hasNext()) {
            actor = iterator.next();
            if (actor.isTakeOrder()) {
                iterator.remove();
                System.out.println("Посетитель " + actor.getName() + " покинул очередь и вышел из магазина.");
            }
        }
    }
}
