package org.citysorting.input;

public class FileDataInput implements DataInput {

    //этот класс вызывается при вызове из ConsoleMenu(сюда прилетает путь к файлу Path path, количество строк)
    // через билдер создаем объекты City
    // валидатор!

    //Необходимо организовать получение городов через Stream API. "заполнение коллекций должно осуществляться посредством стримов."

    //scanner не закрываем
    //csv закрываем
    //Итоговая коллекция должна быть CustomArrayList,
    // но возвращаться как List<City>.

}
