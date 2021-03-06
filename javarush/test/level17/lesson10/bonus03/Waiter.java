package com.javarush.test.level17.lesson10.bonus03;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public  void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (manager.getDishesQueue().isEmpty())
            {                                         //берем новый заказ
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order);

            } else
            {       //относим готовый заказ
                Dishes dishes = manager.getDishesQueue().poll();
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());

            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
