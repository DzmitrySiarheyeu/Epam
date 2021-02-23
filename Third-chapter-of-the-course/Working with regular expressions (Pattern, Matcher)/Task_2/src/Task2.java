/*
 *   Задание: Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
 *   и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми
 *   парсерами XML для решения данной задачи нельзя.
 *
 *   Dzmitry Siarheyeu
 *   23.02.2021
 */

import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        XMLAnalyzer xmlCodeObj = null;

        try {
            xmlCodeObj = XMLAnalyzer.fileProcessing("./Third-chapter-of-the-course\\Working with regular expressions (Pattern, Matcher)\\Task_2/resources/task2.xml");
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        System.out.println("Reading XML file:");

        xmlCodeObj.analyze();
    }
}
