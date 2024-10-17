package by.teachmeskills.yadevich.lesson6.task1;

public class Runner {
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

        // создадим массив и сразу проинициализируем объектами
        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8};

        for(int i = 0; i < students.length; i++){
             students[i].showStudent(); // вызываем метод
        }
    }
}
