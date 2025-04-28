package Exo2;

public class OrderService {
   public OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void createOrder(Order order){
        orderDao.saveOrder(order);


    }
}
