package test;

import base.BaseTest;
import org.testng.annotations.Test;

public class PerformanceTest extends BaseTest {

    @Test
    public void testPageLoadTime() {
        long start = System.currentTimeMillis();
        driver.get("https://lektion.in");
        long end = System.currentTimeMillis();

        long loadTime = end - start;
        System.out.println("⏱ Page Load Time: " + loadTime + " ms");

        assert loadTime < 10000 : "❌ Page took too long to load!";
    }
}
