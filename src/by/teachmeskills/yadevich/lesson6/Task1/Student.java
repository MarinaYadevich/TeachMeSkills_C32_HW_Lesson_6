package by.teachmeskills.yadevich.lesson6.Task1;

import java.util.Arrays;

/** Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти объекты в массив.
 * Пройти по массиву циклом for и вывести информацию на консоль.
 */

public class Student { // создала класс для описания студентов
    String name; // поле класса
    String surname; // поле класса
    String passportNumber; // поле класса
    String groupName; // поле класса

    Student(String name, String surname, String passportNumber, String groupName){ // создала конструктор
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
    }

    public static void main(String[] args) {
        // создала объекты класса Student
        Student student1 = new Student("Marina","Yadevich","4569384F756","C32");
        Student student2 = new Student("Masha","Lyah","768485H8443","C32");
        Student student3 = new Student("Misha","Yaroshenko","89265638Y8364","C32");
        Student student4 = new Student("Lera","Osherenko","73540463L747","C32");
        Student student5 = new Student("Ira","Desyatnik","3540563T5639","C32");
        Student student6 = new Student("Tanya","Chigir","69456583Y737","C32");
        Student student7 = new Student("Nelly","Lagodich","538563H7563","C32");
        Student student8 = new Student("Yura","Kylaga","925438H7255","C32");
// создадим массив и сразу проинициализируем обьектами
        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8}; // поместила объекты в массив

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}
