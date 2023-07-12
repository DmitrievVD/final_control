# Итоговая контрольная работа

## Информация о проекте

Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.
Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
Программа, может использоваться в различных системах, поэтому необходимо
разработать класс в виде конструктора

## Задание

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека). [Ссылка](task.md)
2. Создать директорию, переместить файл туда. [Ссылка](task.md)
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория. [Ссылка](task.md)
4. Установить и удалить deb-пакет с помощью dpkg. [Ссылка](task.md)
5. Выложить историю команд в терминале ubuntu [Ссылка](task.md)
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы). [Ссылка](chart/chartAnimal.png)


7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека” [Ссылка](sql/task7.sql)
8. Создать таблицы с иерархией из диаграммы в БД [Ссылка](sql/task8.sql)
9. Заполнить низкоуровневые таблицы именами(животных), командами
    которые они выполняют и датами рождения [Ссылка](sql/task9.sql)
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу. [Ссылка](sql/task10.sql)
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице [Ссылка](sql/task11.sql)
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам. [Ссылка](sql/task12.sql)

13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме. [Ссылка](src/main/java/Animals)

14. Написать программу, имитирующую работу реестра домашних животных.[Ссылка](src/main/java/Main.java)

## В программе должен быть реализован следующий функционал:

14.1 Завести новое животное

14.2 определять животное в правильный класс

14.3 увидеть список команд, которое выполняет животное

14.4 обучить животное новым командам

14.5 Реализовать навигацию по меню

15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней int переменной на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.
