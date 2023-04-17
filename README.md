#Это заддания от тинькофф на первом этапе Tinkoff Solution Cup. Backend.
##Первое задание
Калькулятор кэшбэка 🤑
Текст задачи
Дан код, который должен поиндексно перемножать два массива (сумма покупки и процент начисляемого кэшбэка) и выводить результат — сумму кэшбэка, которую должен получить покупатель. Необходимо найти и исправить ошибку.
Ограничение
Метод List<Double> TCupUtil.getDoubles ( BufferedReader br) читает поток чисел из System.in. Его реализация неважна для задачи.
Ответ должен быть распечатан в System.out.
Пример
Входные данные:
0.1;0.02
100;300
Выходные данные:
16.0
Изначальный код:
import java.io.*;
import java.util.*;
import java.lang.*;

class CalculateSum
{
    public static void main(String args[])
    {
        BufferedReader inputDataBR = new BufferedReader(new InputStreamReader(System.in));

        List<Double> persents = TCupUtil.getDoubles(inputDataBR);
        List<Double> purchases = TCupUtil.getDoubles(inputDataBR);

        double sum = 0;
        for (int i = 0; i < purchases.size(); i+=2) {
            sum = sum + purchases.get(i) * persents.get(i+1);
        }
        System.out.println(sum);
    }
}


##Второе задание
Съешь же ещё этих мягких французских булок, да выпей чаю 🥖
Необходимо написать функцию, определяющую, является ли предложение панграммой.
Панграмма - это предложение, которое содержит каждую отдельную букву алфавита по крайней мере один раз.
Например, предложение:
Съешь же ещё этих мягких французских булок, да выпей чаю.
является панграммой, потому что в нем используются все буквы алфавита от А до Я по крайней мере один раз.
Ограничения
Функция должна принимать на вход строку;
Функция должна возвращать булевое значение соответственно тому, является текст панграммой или нет;
Регистр букв не должен учитываться;
Все символы кроме кириллицы должны игнорироваться.
Пример
Входные параметры:
Съешь же ещё этих мягких французских булок, да выпей чаю.
Выходные параметры:
True

Изначальный код:
import java.util.*;
import java.lang.*;

class Pangram
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        // здесь решение

        System.out.println("True");
    }
}


##Третье задание
Камуфляж и шпионаж 🕵️
Необходимо написать функцию, которая декодирует и расшифровывает строку.
Ограничения
Функция должна принимать на вход строку;
Функция должна возвращать строку.
Пример
Входные параметры:
РҐРѕС‰СѓСЏ СЋСЉРЅР¶СѓР±, Рѕ С‘РѕС€СЊС‡С‰ СЋСЉРѕС‘СѓР±.
Выходные параметры:
Хакер пляшет, а чайник плачет.
Подсказка:
о - к - н - а

Изначальный код:
import java.util.*;
import java.lang.*;

class Camouflage
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        
        // декодируйте строку

        String result = "декодированный текст";

        System.out.println(result);
    }
}


##Четвертое задание
Помоги буквам найти свою пару 💛
Написать функцию, которая находит все уникальные символьные комбинации из заданной строки.
Например, для строки
abc
уникальные комбинации будут
a, ab, abc, ac, acb, b, ba, bac, bc, bca, c, ca, cab, cb, cba
Ограничения
Функция должна принимать на вход строку, для которой нужно найти уникальные комбинации;
Функция должна возвращать список всех уникальных комбинаций в заданной строке;
Функция должа возвращать результат в отсортированном виде;
На выход необходимо отдать строку вида:
a, ab, abc
Пример
Входные параметры:
abc
Выходные:
a, ab, abc, ac, acb, b, ba, bac, bc, bca, c, ca, cab, cb, cba

Изначальный код:
import java.util.*;
import java.lang.*;

class Letters
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        // здесь решение

        String result = "a, ab, abc";
        System.out.println(result);
    }
}


##Пятое задание
Необходимо написать функцию, которая проверяет правильность решения для игры 5 букв.
Ограничения
Функция должна принимать на вход строку вида:
ответ пользователя, правильный ответ
Функция должна возвращать массив из 5 элементов, каждый элемент - это цифра отвечающая за совпадения:
-1: Буква отсутствует
0: Буква есть, но в другом месте
1: Буква на своём месте
Слова должны состоять строго из 5 букв;
При проверке повторяющихся букв должно учитываться их количество. Например, если в ответе ТЕКСТ есть только одна буква Е, а пользователь отправил слово ЕГЕРЬ, то только одна буква Е должна быть помечена как 0, остальные должны быть -1.
На выход необходимо отдать строку вида:
1, 0, -1, 1, -1
Пример
Входные параметры:
ДОЖДЬ, ДЗЮДО
Выходные:
1, 0, -1, 1, -1

Изначальный код:
import java.util.*;
import java.lang.*;

class FiveLetters
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        // здесь решение

        String result = "11111";
        System.out.println(result);
    }
}


##Шестое задание
Сжатие самоизолирующихся последовательностей 📉
Текст задачи
Написать функцию, которая будет принимать на вход массив чисел и отдавать сжатые последовательности в виде массива кортежей.
Ограничения
Функция должна принимать на вход строку с числами вида:
1, 2, 2, 3, 4, 3, 3, 3
Функция должна возвращать массив кортежей с числами
Каждый элемент кортежа должен удовлетворять формату:
(x, y)
x - число из последовательности;
y - количество раз, которое это число встречается в последовательности.
На выход необходимо отдать строку вида:
(1, 1), (2, 2), (3, 1), (4, 1), (3, 3)
Пример
Входные параметры:
1, 2, 2, 3, 4, 3, 3, 3
Выходные:
(1, 1), (2, 2), (3, 1), (4, 1), (3, 3)

Изначальный код:
import java.util.*;
import java.lang.*;

class Compression
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        // здесь решение

        String result = "(1,1)"; // это пример, вычислите свой результат

        System.out.println(result);
    }
}


##Седьмое задание
Многопоточный самолёт✈️
У самолёта есть 1 винт и 1 камера, которую конструкторы установили сразу за винтом. Возникает проблема, камера должна снимать, обстановку перед самолётом так, чтобы на каждом снимке не было лопастей винта самолёта
Винт и камера работают параллельно, при этом камера должна снимать только в тот момент, когда перед ней нет лопасти винта.
Требуется описать класс самолёта, конструктор которого принимает на вход числа propellerSpeed - скорость вращения винта(оборотов/сек.) и cameraSpeed - количество снимков в секунду, которое может делать камера(снимков/сек.).
Ограничения
Винт может находится в двух положениях: Closed(Лопасть перекрывает камеру) и Opened(Не перекрывает);
Положение винта меняется каждые 1/propellerSpeed секунд;
Камере требуется делать преднастройку перед КАЖДЫМ снимком 1/cameraSpeed секунд;
Изначально камера находится в НЕнастроенном состоянии;
Камера МОЖЕТ проводить настройку, если перед ней находится лопасть винта;
Смена положения пропеллера и снимок камеры происходят с помощью вывода на консоль строки с сообщением(Closed/Opened/Photo);
Для вывода в консоль, используйте метод Application.threadPrintln.
Пример
Входные параметры:
propellerSpeed = 1
cameraSpeed = 2
Выходные:
Раз в секунду меняется положение винта, когда винт в положение Opened, камера начинает делать снимки два раза в секунду.
Пример вывода в консоль:
Closed
Opened
Photo
Photo
Closed
Opened
Photo
Photo
Closed
Примечание
Вам требуется описать только два метода: engineWorkProcess и cameraWorkProcess. При проверке эти методы будут обёрнуты в цикл и запущены в разных потоках.

Изначальный код:
public class Airplane {

    public Airplane(long propellerSpeed, long cameraSpeed) {

    }

    public void engineWorkProcess() {
        // Напиши код работы винта здесь
        Application.threadPrintln("Closed");
        Application.threadPrintln("Opened");
    }

    public void cameraWorkProcess() {
        // Напиши код работы камеры здесь
        Application.threadPrintln("Photo");
    }
}


##Восьмое задание
Фильтр коллекции
Необходимо отфильтровать одну числовую коллекцию по другой.
Требуется реализовать метод получающий на вход две коллекции. Первая коллекция которую фильтруем, вторая по которой фильтруем. В итоге необходимо вернуть результат содержащий только те элементы из первой коллекции, которые есть во второй.
Ограничения
Любая из коллекций может быть пустой.
Пример
Входные данные:
1. [3,5,4,5,4]
2. [5,4]

Выходные:
[5,4,5,4] Порядок не важен.

Изначальный код:
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<Integer> filterOneCollectionByAnother(List<Integer> firstCollection, List<Integer> secondCollection) {
        // пожалуйста добавьте свой код здесь
    }
}


##Девятое задание
Приоритетная доставка 💳
С доставки банковских продуктов начинается сотрудничество между банком и клиентом. Важным этапом при этом является приоритезация и планирование доставок.
Ограничения
Метод принимает на вход (System.in) строку - JSON массив со списком продуктов;
Метод возвращает (System.out) агрегированный список встреч - JSON массив;
В качестве JSON-парсера используется библиотека (уже есть в classpath).
Текст задачи
Необходимо из входного стрима продуктов, готовых к выдаче, составить список встреч с клиентами.
Формат входного стрима продуктов (System.in):
{
  "products": [
    {
      "id": "68fe1976-473f-4e8a-b162-851d1c8b2e27",
      "clientId": "401559ed-b24f-4847-aeb1-d49e6f00db9d",
      "addressId": "da0abd02-a0ae-4620-bcd4-84344aa59d5d",
      "type": "Junior Debit",
      "creationTime": "2023-04-06T05:26:43.968+03:00",
      "meetingTime": "2023-04-05T13:55:24.968+03:00"
    }
  ]
}
в примере строка входного стрима отформатирована для наглядности. В тестовых данных символов перевода каретки не будет, json целиком будет в одной строке:
{"products": [{"id": "68fe1976-473f-4e8a-b162-851d1c8b2e27","clientId": "401559ed-b24f-4847-aeb1-d49e6f00db9d","addressId": "da0abd02-a0ae-4620-bcd4-84344aa59d5d","type": "Junior Debit","creationTime": "2023-04-06T05:26:43.968+03:00","meetingTime": "2023-04-05T13:55:24.968+03:00" }]}
Продукт: привезут от дебетовой карты до ипотеки.
Свойства продукта:
Название поля в JSON	Расшифровка	Тип данных
id	идентификатор продукта	UUID, NOT NULL
type	тип продукта	string, NOT NULL
meetingTime	запланированное время доставки продукта. Основной параметр для сортировки встреч	ISO, со смещением (см. пример),
NOT NULL
clientId	уникальный идентификатор пользователя	UUID, NOT NULL
addressId	уникальный идентификатор адреса пользователя	UUID, NOT NULL
creationTime	время создания продукта	ISO, со смещением (см. пример),
NOT NULL
Формат выходного стрима встреч (System.out):
{
  "meetings": [
    {
      "meetingTime": "2023-04-05T09:54:01.968+03:00",
      "clientId": "401559ed-b24f-4847-aeb1-d49e6f00db9d",
      "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
      "products": [
        {
          "creationTime": "2023-04-06T05:14:19.968+03:00",
          "id": "a78159d1-bfbc-4f76-946b-c216d903508e",
          "type": "Black Debit"
        }
      ]
    }
  ]
}
Порядок полей в рамках одного объекта JSON выходного стрима не важен;
В выходной строке можно использовать форматированный JSON (с символом перевода каретки).
Встреча - подписание документов для получения продукта (-ов). Можно получить несколько продуктов за одну встречу.
Свойства встречи:
Название поля в JSON	Расшифровка	Тип данных
meetingTime	время встречи. Ближайшее из meetingTime готовых к выдаче продуктов клиента	ISO, со смещением (см. пример),
NOT NULL
clientId	уникальный идентификатор пользователя	UUID, NOT NULL
addressId	уникальный идентификатор адреса пользователя	UUID, NOT NULL
products	список продуктов. Формат продукта:
{ "id": "...", "type": "...", "creationTime": "..." }
со значением полей из входного стрима продуктов	массив объектов, NOT NULL
Правила агрегации списка продуктов в список встреч:
Встречи отсортированы по дате meetingTime (ASC). Встречи с одинаковым meetingTime дополнительно сортируются между собой по clientId (лексикографический порядок без учета регистра (ASC)). Встречи с одинаковыми meetingTime и clientId дополнительно сортируются между собой по addressId (лексикографический порядок без учета регистра (ASC)).
При наличии у одного клиента (под определенным clientId) нескольких запланированных получений продуктов на один адрес (addressId), необходимо данные продукты добавить в созданную встречу с ближайшим запланированным временем (см. meetingTime) и общими clientId и addressId.
Продукты во встрече отсортированы по дате их создания creationTime (ASC). Продукты с одинаковым creationTime дополнительно сортируются между собой по id (лексикографический порядок без учета регистра (ASC)).
Все временные поля должны быть в следующем формате ISO: "2023-04-06T05:26:43.968+03:00".
Пример
Входные параметры:
{
  "products": [
    {
      "id": "5d538f86-c70a-11ed-afa1-0242ac120002",
      "type": "Black Debit",
      "meetingTime": "2023-03-15T18:00:00+03:00",
      "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
      "clientId": "dc86186e-c6e7-11ed-afa1-0242ac120002",
      "creationTime": "2023-03-14T10:00:00.145+03:00"
    },
    {
      "id": "6511875a-c70a-11ed-afa1-0242ac120002",
      "type": "All Airlines Debit",
      "meetingTime": "2023-03-15T18:45:00+03:00",
      "addressId": "f2941ac0-d510-11ed-afa1-0242ac120002",
      "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
      "creationTime": "2023-03-14T09:00:00.812+03:00"
    },
    {
      "id": "6e313fe2-c70a-11ed-afa1-0242ac120002",
      "type": "Drive Credit",
      "meetingTime": "2023-03-14T11:00:00+03:00",
      "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
      "clientId": "dc86186e-c6e7-11ed-afa1-0242ac120002",
      "creationTime": "2023-03-14T05:00:00.555+03:00"
    },
    {
      "id": "75e12be5-9fcd-4853-a0dc-4e32f8cb2eac",
      "type": "Junior Debit",
      "meetingTime": "2023-03-15T18:45:00+03:00",
      "addressId": "eb612fb8-d510-11ed-afa1-0242ac120002",
      "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
      "creationTime": "2023-03-14T09:00:00.654+03:00"
    }
  ]
}
Выходные параметры:
{
  "meetings": [
    {
      "meetingTime": "2023-03-14T11:00:00+03:00",
      "clientId": "dc86186e-c6e7-11ed-afa1-0242ac120002",
      "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
      "products": [
        {
          "creationTime": "2023-03-14T05:00:00.555+03:00",
          "id": "6e313fe2-c70a-11ed-afa1-0242ac120002",
          "type": "Drive Credit"
        },
        {
          "creationTime": "2023-03-14T10:00:00.145+03:00",
          "id": "5d538f86-c70a-11ed-afa1-0242ac120002",
          "type": "Black Debit"
        }
      ]
    },
    {
      "meetingTime": "2023-03-15T18:45:00+03:00",
      "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
      "addressId": "eb612fb8-d510-11ed-afa1-0242ac120002",
      "products": [
        {
          "creationTime": "2023-03-14T09:00:00.654+03:00",
          "id": "75e12be5-9fcd-4853-a0dc-4e32f8cb2eac",
          "type": "Junior Debit"
        }
      ]
    },
    {
      "meetingTime": "2023-03-15T18:45:00+03:00",
      "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
      "addressId": "f2941ac0-d510-11ed-afa1-0242ac120002",
      "products": [
        {
          "creationTime": "2023-03-14T09:00:00.812+03:00",
          "id": "6511875a-c70a-11ed-afa1-0242ac120002",
          "type": "All Airlines Debit"
        }
      ]
    }
  ]
}
Клиент с clientId dc86186e-c6e7-11ed-afa1-0242ac120002 заказал карту Drive Credit для себя, а потом еще и карту Black Debit для жены. Обе карты готовы к выдаче. Оба продукта попадают в одну встречу, т. к. едут к одному клиенту на один адрес. Продукты отсортированы по времени в данной встрече. Время встречи выбрано ближайшее среди meetingTime двух продуктов;
Клиент с clientId a0af1e4c-c6f8-11ed-afa1-0242ac120002 заказал карту Junior Debit себе по адресу 6511875a-c70a-11ed-afa1-0242ac120002, а потом еще и карту Junior Debit для сына по адресу eb612fb8-d510-11ed-afa1-0242ac120002. Обе карты готовы к выдаче. Продукты попадают в разные встречи, т.к. едут по разным адресам. Так как время встречи и clientId у данных двух встреч одинаковые, то решающим в сортировке является поле addressId - встреча с адресом eb612fb8-d510-11ed-afa1-0242ac120002 приоритетнее встречи с адресом f2941ac0-d510-11ed-afa1-0242ac120002.ф

Изначальный код:
import java.util.*;
import java.lang.*;
import org.json.JSONObject;
import org.json.JSONArray;

class PriorityDelivery
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String json = scanner.nextLine(); // {"products": [...]}
        //
        // products -> meetings processing
        //
        System.out.println("result here"); // {"meetings": [...]}
    }
}


##Десятое задание
Рекурсивная печать
Текст задачи
На вход приходит n. Необходимо вывести в консоль числа от 1 до n, используя рекурсию. Если n < 1 - ничего не выводить.
Ограничения
n > 0;
если n < 1, ничего не выводить;
для вывода каждого числа использовать System.out.println.
Пример
n = 3
Вывод:
1
2
3
n = 1
Вывод
1
n = 0
Ничего не выводить
n = -1
Ничего не выводить

Изначальный код:
import java.util.Scanner;

class RecursivePrinter
{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var inputNumber = Integer.parseInt(scanner.nextLine());
        print(inputNumber);
    }

    public static void print(int n) {
        // реализуйте этот метод
    }
}
