package models;

import app.models.ProductModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductModelTest {
    private ProductModel model;

    @BeforeEach
    public void setUp() {
        model = new ProductModel();
    }

    @Test
    void test_calculate_payment_expected_result() {
        assertEquals(4, model.calculatePayment(2, 2));
    }

    @Test
    void test_calculate_payment_unexpected_result() {
        assertNotEquals(5, model.calculatePayment(2, 2));
    }


}
