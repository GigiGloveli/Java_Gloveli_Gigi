package com.example.java_gloveli_gigi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

public class FrenaUtilTest {
    @Test
    public void testDiscount(){
        FrenaUtil flightUtil = new FrenaUtil();
        double discount = FrenaUtil.discount(240);
        discount = Double.parseDouble(new DecimalFormat("###.#").format(discount));
        Assert.assertEquals(discount, 48.0);

    }

    @Test
    public void testInsert(){
        FrenaUtil flightUtil = new FrenaUtil();
        String result = FrenaUtil.insert(new Frena("tbilisi", "02.03.2023", 5, 150));
        Assert.assertEquals(result, "Item inserted successfully");

    }
}