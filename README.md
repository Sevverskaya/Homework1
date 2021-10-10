# Домашнее задание к лекции: Введение в Java (06.10.2021)

В качестве задания предлагается решить три задачи, 
на каждую из них написан класс-заготовка с методом, куда нужно
вставить код решения задачи.
  
На все задачи написаны тесты.
После решения задачи нужно убедиться, что тесты проходят:

`gradle build test`

#Задача 1 
Класс **ReverseInteger**, метод reverse

На входе дано любое целое число, вернуть число, записанное в обратном порядке. 

*Пример*: 

          1234 -> 4321
          -23 -> -32
          120 -> 21
          2,147,483,648 -> exception, error message
          Если результат(число записанное в обратном порядке) вышло за пределы int [-2,147,483,648,  2,147,483,647] выбросить
          своё unchecked исключение. В методе main класса main если произошло исключение написать пользователю,
          что введено число, которое не может быть конвертировано.
               
#Задача 2 
Класс **LongestSubstring**, метод getLengthOfLongestSubstring

На входе дана строка символов, нужно вернуть длину наибольшей подстроки без повторяющихся символов.

*Пример*:
 
        dnmdncbb  -> 5 (mdncb)
        amam -> 2 (am)

#Задача 3 
Класс **TwoSums**, метод getTwoSum

На входе дан упорядоченный по возрастанию массив целых чисел больше или равных 0 (nums) 
и  целое число больше или равное 0 (target).

Вернуть два числа из массива nums, которые в сумме дадут число target.

*Пример*:
 
        nums = [1, 4, 6, 7, 10], target = 10
        Результат - [4, 6]

Если чисел нет - вернуть пустой массив.

_**Подумать о решении, которое будет содержать наименьшее количество проходов по массиву.**_
      
