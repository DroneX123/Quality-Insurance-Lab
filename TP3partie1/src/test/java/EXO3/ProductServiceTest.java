package EXO3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void testProductApiClientCalledWithCorrectArgument() {
        // Arrange
        ProductApiClient mockProductApiClient = mock(ProductApiClient.class);
        ProductService productService = new ProductService(mockProductApiClient);

        String expectedProductId = "123";
        String mockResponse = "API/123";

        // Configure mock behavior
        when(mockProductApiClient.getProduct(expectedProductId)).thenReturn(mockResponse);

        // Act
        String result = productService.getProduct(expectedProductId); // Fixed method name

        // Assert
        verify(mockProductApiClient, times(1)).getProduct(expectedProductId);
        assertEquals(mockResponse, result);
    }

    @Test
    void testProductApiFailure() {
        // Arrange
        ProductApiClient mockApiClient = mock(ProductApiClient.class);
        ProductService service = new ProductService(mockApiClient);
        String failingProductId = "456";

        // Configure mock to throw exception
        when(mockApiClient.getProduct(failingProductId))
                .thenThrow(new RuntimeException("API error"));

        // Act & Assert
        try {
            service.getProduct(failingProductId); // Fixed method name
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            // Verify that the exception was thrown as expected
            assertEquals("API error", e.getMessage());
        }

        // Ensure the mock method was called once
        verify(mockApiClient, times(1)).getProduct(failingProductId);
    }
}
