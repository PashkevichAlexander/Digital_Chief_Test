# Digital_Chief_Test
## Инструкция

1) Установить **MySql**

2) Запустить **script.sql** находящийся в корне проекта

3) В **resources** изменить  **username: (ваш username)**  и  **password: (ваш password)**

4) В файле **requests.http**, находящемся в корне проекта находятся requests для работы с нашим приложением

![img.png](img.png)

5) запуская команды поочередно можно наблюдать обмен **json** между клиент/сервер 



## Описание зависимостей

1) Зависимость **lombok**:

**Lombok** – это основанная на аннотациях библиотека **Java**, позволяющая сократить шаблонный код. 
В Lombok предлагаются различные аннотации, цель которых – заменить ненужный повторяющийся код. 

2) Зависимость **spring-boot-starter-jpa**:

**Spring Data JPA** обрабатывает большую часть сложности доступа к базе данных на основе **JDBC** и **ORM** 
(реляционное сопоставление объектов). Это уменьшает количество, шаблонного кода.

3) Зависимость **spring-boot-starter-web**:

**Starter of Spring web** использует **Spring MVC, REST** и **Tomcat** в качестве встроенного сервера по умолчанию. 
Зависимость **spring-boot-starter-web** подключает все зависимости, связанные с веб-разработкой. 
Это также уменьшает их количество. **Spring-boot-starter-web** подключает следующие зависимости:

* org.springframework.boot:spring-boot-starter
* org.springframework.boot:spring-boot-starter-tomcat
* org.springframework.boot:spring-boot-starter-validation
* com.fasterxml.jackson.core:jackson-databind
* org.springframework:spring-web
* org.springframework:spring-webmvc

4) Зависимость **Mysql-connector-java**:

При помощи драйвера **MySQL Connector** СУБД **MySQL** предоставляет приложениям Java возможность соединения с базой данных, который реализует
интерфейс **API Java Database Connectivity (JDBC)**

5) Плагин **spring-boot-maven-plugin**

Плагин **Spring Boot Maven** обеспечивает поддержку **Spring Boot** в **Apache Maven**. 
Он позволяет упаковывать исполняемые файлы **jar** или **war-архивы**, запускать приложения 
**Spring Boot**, генерировать информацию о сборке и запускать приложение Spring Boot 
перед запуском интеграционных тестов.

5) Проект **spring-boot-starter-parent** — это специальный начальный проект, который 
предоставляет конфигурации по умолчанию для нашего приложения и полное дерево 
зависимостей для быстрой сборки нашего проекта **Spring Boot** . Он также предоставляет 
конфигурации по умолчанию для подключаемых модулей **Maven**, таких как **maven-failsafe-plugin** , 
**maven-jar-plugin** , **maven-surefire-plugin и maven-war-plugin** 