package Seminar2.Task1;

import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{
    List<Buyer> listBuyers = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();
    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + "entered the market");
        listBuyers.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        System.out.println(actor.getName() + "left the market");
        listBuyers.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + "is took in queue");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + "took order");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + "made order");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + "released from queue");
        actorsQueue.poll();

    }
}
