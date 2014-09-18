package com.shushanfx.gradle.test;

import com.shushanfx.gradle.Main;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by dengjianxin on 2014/9/18.
 */
public class TestMain {
    @Test
    public void testTest(){
        Main m = new Main();
        m.test("Hello");

    }

    @Test
    public void testGet(){
        Main m = new Main();
        assertEquals("It is true!", "Hello", m.get("Hello"));
    }
}
