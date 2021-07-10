# Автотесты на проверку наличия информации о компании  [**aeroidea.ru**](https://aeroidea.ru)

## Стек и инструменты
Тесты были написаны на Java + JUnit5 + Selenide + Gradle

| Java | Gradle | Junit5 | Selenide |
|:----:|:------:|:------:|:--------:|
| <img src="forReadme/JAVA.svg" width="40" height="40"> | <img src="forReadme/Gradle.svg" width="40" height="40"> | <img src="forReadme/Junit5.svg" width="40" height="40"> | <img src="forReadme/Selenide.svg" width="40" height="40"> |

Запускаются и прогоняются через Jenkins + Selenoid

| Jenkins | Selenoid | 
|:--------:|:-------------:|
| <img src="forReadme/Jenkins.svg" width="40" height="40"> | <img src="forReadme/Selenoid.svg" width="40" height="40"> | 

С отчетами в Allure + Telegram
| Allure Report | Telegram |
|:---------:|:--------:|
| <img src="forReadme/Allure.svg" width="40" height="40"> | <img src="forReadme/Telegram.svg" width="40" height="40"> |

## Запуск через Jenkins https://jenkins.autotests.cloud/view/QA.GURU%20students/job/c06-dbusygin91-forCompany/

### С какими параметрами можно запустить тесты:
* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

### Пример странички с выбором параметров сборки
![alt "Выбор параметров"](./forReadme/Screenshot_1.png)

### Как запустить тесты из командной строки
Запустить тесты с дефолтными параметрами:
```bash
gradle clean test
```

Запустить тесты с нужными нам параметрами:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Сформировать отчет в Allure:
```bash
allure serve build/allure-results
```

## Прогоняются тесты в Selenoid https://selenoid.autotests.cloud/#/

### Пример прогона теста в Selenoid
![alt "Video from Selenoid"](./forReadme/video.mp4 "Video from Selenoid")