package com.automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksCheck
{

        public static void main(String[] args) throws InterruptedException {
            // ✅ Setup ChromeDriver automatically
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            // ✅ Use implicit wait instead of Thread.sleep()
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // ✅ Get all links
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total links found: " + links.size());

            for (WebElement link : links) {
                String url = link.getAttribute("href");

                // ✅ Skip invalid or non-http links
                if (url == null || url.isEmpty() || !url.startsWith("http")) {
                    continue;
                }

                try {
                    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                    conn.setRequestMethod("HEAD");
                    conn.setConnectTimeout(3000);
                    conn.connect();

                    int statusCode = conn.getResponseCode();
                    if (statusCode >= 400) {
                        System.out.println("❌ Broken link: " + url + " | Status: " + statusCode);
                    } else {
                        System.out.println("✅ Working link: " + url + " | Status: " + statusCode);
                    }

                    conn.disconnect();
                } catch (Exception e) {
                    System.out.println("⚠️ Error checking link: " + url + " | " + e.getMessage());
                }
            }

            driver.quit();
        }
    }

