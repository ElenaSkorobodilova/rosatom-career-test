# Проект по тестированию главной страницы сайта "Росатом. Единый карьерный портал"
<a target="_blank" href="https://rosatom-career.ru/">Ссылка на единый портал</a>

![This is an image](/images/rosatom-career.ru.jpeg)

## Проект в Allure TestOps с тестовыми планами ручного и автотестирования. Cводные результаты прогонов тестов
<a target="_blank" href="https://allure.autotests.cloud/project/804">Сссылка на проект в AllureTestOps</a> (запрос доступа admin@qa.guru)

<img src="/images/launchers.png" width="100%"/></a>
![This is an image](/images/testopsboard.png)

### По отдельному тест плану выполнено ручное тестирование, по результатам которых заведены дефекты
![This is an image](/images/testplan2.png)
![This is an image](/images/testops2.png)
![This is an image](/images/defects.png)

## Сборка и запуск автотестов выполняются на сервере Jenkins
<a target="_blank" href="http://185.251.90.229:8080/job/RosatomCareerSiteAutoTests/">Ссылка на проект в Jenkins</a> (логин: User, пароль: 1)

## Проект реализован с использованием:
Java Gradle IntelliJ IDEA Selenide Selenoid JUnit5 Github Jenkins Allure Report Allure TestOps Telegram Jira

![This is an image](/icons/AllureTestOps.png)

## USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
