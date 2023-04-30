package models;

import app.models.ProductIDiscountModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductDiscountModelTest {
    private ProductIDiscountModel model;

    @BeforeEach
    public void setUp() {
        model = new ProductIDiscountModel();
    }



    @Test
    void test_calculate_discount_expected_result() {
        assertEquals(10.0, model.calculateDiscount(100.0));
    }

    @Test
    void test_calculate_discount_unexpected_result() {
        assertNotEquals(9.0, model.calculateDiscount(100.0));
    }

    @Test
    void test_calculate_discount_payment_expected_result() {
        assertEquals(90.0, model.calculateDiscountPayment(100.0, 10.0));
    }

    @Test
    void test_calculate_discount_payment_unexpected_result() {
        assertNotEquals(100.0, model.calculateDiscountPayment(100.0, 10.0));
    }


    @AfterEach
    void tearDown() {
        model = null;
    }
}