package test;

import base.BaseTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

public class ResponsiveUITest extends BaseTest {

    @Test
    public void testResponsiveUI() throws InterruptedException {
        // Desktop view
        driver.manage().window().setSize(new Dimension(1366, 768));
        Thread.sleep(2000);
        System.out.println("✅ Desktop layout loaded");

        // Tablet view
        driver.manage().window().setSize(new Dimension(768, 1024));
        Thread.sleep(2000);
        System.out.println("✅ Tablet layout loaded");

        // Mobile view
        driver.manage().window().setSize(new Dimension(375, 667));
        Thread.sleep(2000);
        System.out.println("✅ Mobile layout loaded");

        // Reset
        driver.manage().window().maximize();
    }
}

