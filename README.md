# Проект по тестированию главной страницы сайта "Росатом. Единый карьерный портал"
> <a target="_blank" href="https://rosatom-career.ru/">Ссылка на единый портал</a>

![This is an image](/images/rosatom-career.ru.jpeg)

#### Список проверок, реализованных в автотестах
- Наличие требуемых заголовков в верхнем меню страницы
- Наличие заданных пунктов подменю для меню "Молодым специалистам"
- Наличие блока подписки на социальные сети в подвале сайта
- Наличие имиджевого текста на первой странице
- Выполнение поиска заданной вакансии. Проверка, что открылась соответствующая страница и содержимое строки поиска соответствует заданному
#### Список проверок ручного тестирования
- Визуальная характеристика главной страницы сайта, соответствие единому корпоративному стилю
- Адаптивность вёрстки
- Соответствие вёрстки сайта общепринятым стандартам

## Проект реализован с использованием
Java Gradle IntelliJ IDEA Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram Jira

![This is an image](/icons/Java.png)![This is an image](/icons/Gradle.png)![This is an image](/icons/Intelij_IDEA.png)![This is an image](/icons/Selenide.png)![This is an image](/icons/Selenoid.png)![This is an image](/icons/JUnit5.png)![This is an image](/icons/Jenkins.png)![This is an image](/icons/Allure_Report.png)![This is an image](/icons/AllureTestOps.png)![This is an image](/icons/Telegram.png)![This is an image](/icons/Jira.png)


## Запуск автотестов выполняется на сервере Jenkins
> <a target="_blank" href="http://185.251.90.229:8080/job/RosatomCareerSiteAutoTests/">Ссылка на проект в Jenkins</a> (логин: User, пароль: 1)

### Параметры

* login (default user1)
* password (default 1234)
* test_group (default ui_tests). Параметр определяет группу тестов для запуска.

### Для запуска автотестов в Jenkins
#### 1. Открыть <a target="_blank" href="http://185.251.90.229:8080/job/RosatomCareerSiteAutoTests/">проект</a>

![This is an image](/images/jenkins1.png)

#### 2. Выбрать пункт **Собрать с параметрами**
#### 3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
#### 4. Нажать **Собрать**
#### 5. Результат запуска сборки можно посмотреть в отчёте Allure

![This is an image](/images/jenkins2a.png)

### Пример отображения результатов запуска автотестов в отчётах Allure
![This is an image](/images/resultstrend.png)
### Статистика запуска автотестов выполняется нарастающим итогом
![This is an image](/images/successtests.png)

### Пример отображения результатов выполнения шагов по каждому тесту
![This is an image](/images/passed.png)

## Локальный запуск автотестов
### Пример командной строки:
```bash
gradle clean ui_tests -DtestUrl=http://65.108.161.82:4444/wd/hub
```

Получение отчёта:
```bash
allure serve build/allure-results
```

## Проект в Allure TestOps
> <a target="_blank" href="https://allure.autotests.cloud/project/804">Сссылка на проект в AllureTestOps</a> (запрос доступа admin@qa.guru)

### Пример результатов запуска Launchers в Allure TestOps
![This is an image](/images/launchers.png)
### Пример сводного отчёта
![This is an image](/images/testopsboard.png)

## По результатам ручного тестирования выявлены дефекты, зафиксированные в соответствующих задачах AllureTestOps
### Тест план выполнения ручного тестирования
![This is an image](/images/testplan2.png)
### Сводные результаты ручного тестирования
![This is an image](/images/failedresult.png)
### Пример описания дефекта в Allure TestOps
![This is an image](/images/testops2.png)
### Список выявленных дефектов, открытых как задачи в Allure TestOps
![This is an image](/images/defects.png)

## Результаты выполнения тестов и информация о выявленных дефектах интегрированы с Atlassian Jira
> <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-286">Ссылка на задачу в Jira</a> (запрос доступа admin@qa.guru)

Задачи на выявленные дефекты оформлены как подзадачи к данной. Связаны с соответствующими дефектами в Allure TestOps

![This is an image](/images/jira2.png)

## Настроено автоматическое оповещение о результатах сборки Jenkins в Telegram-бот
![This is an image](/images/bot.png)


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
