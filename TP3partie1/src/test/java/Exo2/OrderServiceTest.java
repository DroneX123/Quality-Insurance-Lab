package Exo2;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {

@Test
    void TestOrderCreation(){


    //orderController(orderService(orderDao))


    OrderService mockOrderService=mock(OrderService.class);
    OrderController orderController = new OrderController(mockOrderService);
    Order order =new Order("order1");
    orderController.creatOrder(order);
    //verify that orderService call create Order
    verify(mockOrderService,times(1)).createOrder(order);







}
    @Test
    void TestDeaSave() {
        // Arrange
        OrderDao mockOrderDao = mock(OrderDao.class); // Mock the OrderDao
        OrderService orderService = new OrderService(mockOrderDao); // Real Service
        Order order = new Order("order1");

        // Act
        orderService.createOrder(order); // Call createOrder

        // Assert
        verify(mockOrderDao, times(1)).saveOrder(order); // Verify that saveOrder is called exactly once with the correct order
    }


}