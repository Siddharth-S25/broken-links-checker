# 🔗 Broken Links Checker (Selenium + Java)

A real-world automation challenge using **Selenium WebDriver + Java** to detect broken links on any webpage.  
This project demonstrates how to combine **UI automation** with **API validation techniques** — a valuable skill for **Automation Test Engineers and SDETs**.

---

## 💡 Project Overview

Modern websites often have hundreds of hyperlinks.  
Broken links not only hurt SEO but also lead to poor user experience.  

This automation script:
- Scans all `<a>` tags on a webpage  
- Validates each link using **HTTP HEAD requests**  
- Prints working and broken links with status codes  

It’s a **simple yet powerful example** of combining Selenium for web automation and Java’s networking libraries for validation.

---

## 🚀 Features

✅ Uses **WebDriverManager** to auto-configure ChromeDriver  
✅ Scans all `<a>` tags dynamically  
✅ Validates URLs via **HttpURLConnection**  
✅ Reports broken links with HTTP status ≥ 400  
✅ Uses **implicit waits** (no `Thread.sleep()`)  
✅ Modular, clean, and easy to extend  

---

## 🧰 Tech Stack

| Component | Description |
|------------|--------------|
| **Language** | Java |
| **Automation Framework** | Selenium WebDriver |
| **Build Tool** | Maven |
| **Browser** | Google Chrome |
| **Driver Setup** | WebDriverManager |
| **HTTP Validation** | Java `HttpURLConnection` |
| **Testing Type** | Functional / Validation Automation |

---

## 📦 Setup Instructions

## 🪜 1. Clone this repository
bash
--git clone https://github.com/Siddharth-S25/broken-links-checker.git

-cd broken-links-checker

---
## 2. Open in IntelliJ IDEA 

Open the folder in IntelliJ.

Make sure Maven dependencies are installed.

Run BrokenLinksCheck.java from the src/main/java folder

---

💻 **Example Output**
Total links found: 42

✅ Working link: https://www.google.com | Status: 200

❌ Broken link: https://invalid-url.com | Status: 404

---

🧩 **Learning Takeaways**

Combining UI + API automation

Using implicit waits effectively

Handling network exceptions

Writing clean, modular test code

Building maintainable test utilities


