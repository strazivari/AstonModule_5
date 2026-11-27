package org.citysorting.validation;

public class CityValidator {

    // вызывается из Builder перед созданием объекта City

    // сюда прилетают:
    // String name
    // int population
    // int foundationYear
    // static void validate(String name, int population,int foundationYear)
    // проверяем все 3 поля
    // название не null, не пустое и не состоит из пробелов
    // без левых символов
    // население больше 0
    // год основания от -10000 до текущего года
    // 0 год не допускаем, отрицательные - до нашей эры
    // если все ок, ничего не возвращаем
    // если данные невалидные - IllegalArgumentException
    // в исключении указываем, что именно не так
    // сюда не пихаем вывод в консоль

}
