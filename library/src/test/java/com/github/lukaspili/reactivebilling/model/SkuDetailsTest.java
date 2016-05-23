package com.github.lukaspili.reactivebilling.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author dhartwich1991
 */
public class SkuDetailsTest {
    private SkuDetails skuDetails;

    @Before
    public void setUp() throws Exception {
        skuDetails = new SkuDetails("productId", 123456789, PurchaseType.PRODUCT, "10.00", "EUR",
                "AwesomeItem", "Best item in the world!");
    }

    @After
    public void tearDown() throws Exception {
        skuDetails = null;
    }

    @Test
    public void getProductId() throws Exception {
        assertThat(skuDetails.getProductId()).isEqualTo("productId");
    }

    @Test
    public void getPurchaseType() throws Exception {
        assertThat(skuDetails.getPurchaseType()).isEqualTo(PurchaseType.PRODUCT);
    }

    @Test
    public void getPrice() throws Exception {
        assertThat(skuDetails.getPrice()).isEqualTo("10.00");
    }

    @Test
    public void getPriceAmountMicros() throws Exception {
        assertThat(skuDetails.getPriceAmountMicros()).isEqualTo(123456789);
    }

    @Test
    public void getPriceCurrencyCode() throws Exception {
        assertThat(skuDetails.getPriceCurrencyCode()).isEqualTo("EUR");
    }

    @Test
    public void getTitle() throws Exception {
        assertThat(skuDetails.getTitle()).isEqualTo("AwesomeItem");
    }
    @Test
    public void getDescription() throws Exception {
        assertThat(skuDetails.getDescription()).isEqualTo("Best item in the world!");

    }

}