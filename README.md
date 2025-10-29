# 🔗 Broken Links Checker (Selenium + Java)

A **real-world automation challenge** using **Selenium WebDriver + Java** to detect broken links on any webpage.  
This project demonstrates how to combine **UI automation** with **API validation** techniques — a valuable skill for Automation Test Engineers and SDETs.

---

## 🚀 Features
- ✅ Uses **WebDriverManager** to auto-configure ChromeDriver  
- ✅ Scans all `<a>` tags on a page  
- ✅ Validates links using HTTP `HEAD` requests  
- ✅ Reports **working** and **broken** links with status codes  
- ✅ Uses **implicit waits** instead of `Thread.sleep()`  
- ✅ Clean, modular, and easy to extend

---

## 🧰 Tech Stack
| Component | Description |
|------------|-------------|
| Language | Java |
| Automation Framework | Selenium WebDriver |
| Dependency Manager | Maven (recommended) |
| Browser | Google Chrome |
| Driver Setup | WebDriverManager |
| HTTP | Java `HttpURLConnection` |

---

## 📦 Setup Instructions

1. **Clone this repository**
   ```bash
   git clone https://github.com/yourusername/broken-links-checker.git
   cd broken-links-checker
