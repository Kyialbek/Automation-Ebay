# Automation Ebay Selenium Framework

Modernized Selenium framework for the original 2019 practice project.

## What changed

- Selenium upgraded to Selenium 4.
- WebDriverManager upgraded to a current version.
- JUnit is now declared explicitly.
- Browser setup is centralized in `framework.DriverFactory`.
- Tests share setup and teardown through `framework.BaseTest`.
- Wait logic is centralized in `framework.ElementActions`.
- Page Object examples live in `pages`.
- New framework-style test lives in `tests.EbaySearchTest`.
- Old practice scripts are preserved, but Maven Surefire only runs `*Test.java` classes by default.

## Run

```bash
mvn test
```

Headless Chrome:

```bash
mvn test -Dheadless=true
```

Firefox:

```bash
mvn test -Dbrowser=firefox
```

Custom base URL:

```bash
mvn test -DbaseUrl=https://www.ebay.com
```

## Structure

```text
src/test/java/framework  shared driver, config, waits
src/test/java/pages      page objects
src/test/java/tests      framework-style tests
src/test/java/*          legacy 2019 practice scripts
```
