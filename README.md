ДЗ 12. Коллекції: списки

1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок. Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості. Порахувати скільки разів зустрічається переданий рядок як другий аргумент.

2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини. Конвертувати масив у список відповідного типу даних та повернути з методу.

Наприклад:

Було Array [1, 2, 3]

Стало List [1, 2, 3]


3. Створити метод findUnique, що приймає на вхід числовий список, що складається з довільних значень, які можуть повторюватися в необмеженій кількості. Необхідно повернути новий числовий список, що містить тільки унікальні числа.


4. ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр. Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості. Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.

Наприклад:

bird: 2

fox: 1

cat: 1


4. *** Створити метод findOccurance, що приймає на вхід рядковий список як параметр. Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості. Обчислити скільки разів трапляється кожне слово. Результат повернути у вигляді списку структур, що описують повторення кожного окремого взятого слова.

Наприклад:

[
{name: "bird", occurrence: 2},

{name: "fox", occurrence: 1},

{name: "cat", occurrence: 1}
]

0. Створити новий пакет phonebook.

1. Створити клас Телефонний довідник.

2. Створити клас Запис.

3. Клас Запис зберігає Ім'я та Телефон.

4. Клас Телефонний Довідник зберігає безліч записів типу даних Запис.

5. У класі Телефонний Довідник реалізувати метод add. Метод додає Запис до Телефонного Довідника.

Примітка: Під одним прізвищем може зберігатися кілька телефонів, тому можлива наявність декількох записів.

6. У класі Телефонний Довідник реалізувати метод find(). Метод здійснює пошук конкретного запису на ім'я. Якщо запис знайдений (перший знайдений), тоді його необхідно повернути, інакше повертається null.

7. Мається на увазі дотримання відомих (на даний момент) правил написання коду в ОВП та правил "Чистоти коду".

8. * У класі Телефонний Довідник реалізувати метод findAll(). Метод здійснює пошук записів на ім'я. Якщо записи знайдені, тоді їх необхідно повернути, інакше повертається null.

Така реалізація викликана тим, що під одним прізвищем може зберігатися кілька телефонів і при запиті по конкретному імені необхідно повертати всі записи, що є в наявності.

