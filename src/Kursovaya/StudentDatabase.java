package Kursovaya;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Student {
    private final String Name;
    private final int Age;
    private final int Course;
    private final double AverageGrade;
    private double averageGrade;
    private double name;
    private double age;
    private double course;

    public Student(String name, int age, int course, double averageGrade) {
        this.Name = name;
        this.Age = age;
        this.Course = course;
        this.AverageGrade = averageGrade;
    }

    // геттеры

    @Override
    public String toString() {
        return "Имя: " + Name + ", Возраст: " + Age + ", Курс: " + Course + ", Средний балл: " + AverageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}

public class StudentDatabase {
    public void MAIN(String[] args) {
        HashMap<Integer, Student> studentDatabase = new HashMap<>();
        studentDatabase.put(1, new Student("Иванов Иван", 19, 2, 4.5));
        studentDatabase.put(2, new Student("Петров Петр", 21, 3, 4.2));
        studentDatabase.put(2, new Student("Пупкин Василий", 22, 3, 3.1));
        studentDatabase.put(2, new Student("Карамышев Антон", 20, 2, 5.0));
        studentDatabase.put(2, new Student("Палкина Анна", 24, 5, 4.99));
        studentDatabase.put(2, new Student("Перов Семен", 22, 4, 2.1));
        studentDatabase.put(2, new Student("Пудов Аркадий", 19, 1, 3.5));
        studentDatabase.put(2, new Student("Колокольникова Мария", 21, 3, 3.7));
        studentDatabase.put(2, new Student("Петров Петр", 18, 1, 4.1));
        studentDatabase.put(2, new Student("Петров Петр", 23, 5, 4.9));


        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Студенты");
            int rowNum = 0;
            for (Integer id : studentDatabase.keySet()) {
                Row row = sheet.createRow(rowNum++);
                Student student = studentDatabase.get(id);
                row.createCell(0).setCellValue(id);
                row.createCell(1).setCellValue(student.getName());
                row.createCell(2).setCellValue(student.getAge());
                row.createCell(3).setCellValue(student.getCourse());
                row.createCell(4).setCellValue(student.getAverageGrade());
            }

            try (FileOutputStream fileOut = new FileOutputStream("students.xlsx")) {
                workbook.write(fileOut);
            }
            System.out.println("Файл Excel успешно создан.");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла Excel: " + e.getMessage());
        }
    }
}
