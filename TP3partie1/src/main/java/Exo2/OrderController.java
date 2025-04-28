package Exo2;

public class OrderController {
   public  OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void creatOrder(Order order){
        orderService.createOrder(order);

    }

}
