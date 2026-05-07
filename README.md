<div align="center">

# 🌐 Formation Selenium — Test Automation Learning

**First Steps in Selenium WebDriver — Java**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://java.com)
[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://selenium.dev)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org)
[![Chrome](https://img.shields.io/badge/ChromeDriver-4285F4?style=for-the-badge&logo=googlechrome&logoColor=white)](https://chromedriver.chromium.org)

</div>

---

## 📌 About

This is my **first Selenium WebDriver project**, built while learning test automation from scratch. It covers all the essential Selenium actions — from opening a browser to interacting with dropdowns, checkboxes, alerts, and tabs. The project is split into two parts: a practice section and a real e-commerce test suite.

---

## 🌍 Test Sites Used

| Site | Purpose |
|---|---|
| [letskodeit.com/practice](https://www.letskodeit.com/practice) | Practice page for learning Selenium elements |
| [saucedemo.com](https://www.saucedemo.com) | Real e-commerce site (SwagLabs) for full flow testing |

---

## ✅ What Was Practiced

### 🔧 PracticePage — Selenium Element Actions
Learning how to interact with every type of web element:

| Class | What it does |
|---|---|
| `OpenChrome` | First test — open Chrome browser and navigate to a URL |
| `AutoSuggest` | Handle auto-suggest dropdown inputs |
| `CheckBox` | Select and deselect checkboxes |
| `RadioButton` | Click radio buttons |
| `SelectClass` | Select options from a dropdown by text, value, or index |
| `MultipleSelect` | Select multiple options from a list |
| `MouseHover` | Simulate mouse hover over elements |
| `ElementDisplayed` | Check if an element is visible on the page |
| `Enabled_Disabled` | Check if an element is enabled or disabled |
| `SwitchTab` | Switch between multiple browser tabs |
| `SwitchToAlert` | Handle JavaScript alert popups |
| `SwitchWindow` | Switch between multiple browser windows |

### 🛒 SwagLabs — Full E-commerce Test Flow
Testing a real shopping website end to end:

| Class | What it does |
|---|---|
| `Login` | Log in with valid credentials |
| `Logout` | Log out from the account |
| `AddToCart` | Add a product to the shopping cart |
| `Remove` | Remove a product from the cart |
| `CheckOut` | Complete the full checkout process |
| `OpenChrome` | Browser setup and configuration |

---

## 📁 Project Structure
src/test/java/
├── PracticePage/          ← Selenium element practice
│   ├── OpenChrome.java    ← First test — open browser
│   ├── AutoSuggest.java
│   ├── CheckBox.java
│   ├── RadioButton.java
│   ├── SelectClass.java
│   ├── MultipleSelect.java
│   ├── MouseHover.java
│   ├── ElementDisplayed.java
│   ├── Enabled_Disabled.java
│   ├── SwitchTab.java
│   ├── SwitchToAlert.java
│   └── SwitchWindow.java
└── SwagLabs/              ← Real site end-to-end tests
├── Login.java
├── Logout.java
├── AddToCart.java
├── Remove.java
└── CheckOut.java

---

## ▶️ How to Run

```bash
# Clone the project
git clone https://github.com/Ines-Amami/your-repo-name.git

# Run a specific test class
# Open any .java file and run the main() method
# Or run all tests with Maven:
mvn test
```

> Make sure **Java JDK 11+**, **Maven**, and **ChromeDriver** matching your Chrome version are installed.

---

## 📚 What I Learned

- Setting up **Selenium WebDriver** with Java and Maven from scratch
- Opening and controlling a **Chrome browser** programmatically
- Locating elements using **By.id**, **By.xpath**, **By.cssSelector**
- Interacting with **dropdowns, checkboxes, radio buttons, alerts**
- Handling **multiple tabs and windows**
- Building a complete **end-to-end test flow** on a real website
- Writing clean, readable automation code in Java

---

## 👩‍💻 Author

**Ines Amami**

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Ines-Amami)
