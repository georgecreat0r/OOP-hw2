package Actor;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder() {
        isTakeOrder = false;
        if (!isMakeOrder) {
            isMakeOrder = true;
            System.out.println(name + " сделал заказ.");
        } else {
            System.out.println(name + " уже сделал заказ.");
        }
    }

    @Override
    public void setTakeOrder() {
        if (isMakeOrder) {
            isMakeOrder = false;
            isTakeOrder = true;
            System.out.println(name + " получил заказ.");
        } else {
            System.out.println(name + " ещё не сделал заказ.");
        }
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
