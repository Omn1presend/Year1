package Kursovaya;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Main {
    private final String Name;
    private final int Age;
    private final int Course;
    private final double AverageGrade;
    private double averageGrade;
    private double name;
    private double age;
    private double course;

    public Main(String name, int age, int course, double averageGrade) {
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

    public double getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getCourse() {
        return course;
    }

            public static void main(String[] args) {
                HashMap<Integer, Main> students = new HashMap<>();
                students.put(1, new Main("Иванов Иван", 19, 2, 4.5));
                students.put(2, new Main("Петров Петр", 21, 3, 4.2));
                students.put(3, new Main("Пупкин Василий", 22, 3, 3.1));
                students.put(9, new Main("Карамышев Антон", 20, 2, 5.0));
                students.put(8, new Main("Палкина Анна", 24, 5, 4.99));
                students.put(7, new Main("Перов Семен", 22, 4, 2.1));
                students.put(6, new Main("Пудов Аркадий", 19, 1, 3.5));
                students.put(4, new Main("Колокольникова Мария", 21, 3, 3.7));
                students.put(5, new Main("Петров Петр", 18, 1, 4.1));
                students.put(10, new Main("Петров Петр", 23, 5, 4.9));


                try (Workbook workbook = new XSSFWorkbook()) {
                    Sheet sheet = workbook.createSheet("Студенты");
                    int rowNum = 0;
                    for (Integer id : students.keySet()) {
                        Row row = sheet.createRow(rowNum++);
                        Main main = students.get(id);
                        row.createCell(0).setCellValue(id);
                        row.createCell(1).setCellValue(main.getName());
                        row.createCell(2).setCellValue(main.getAge());
                        row.createCell(3).setCellValue(main.getCourse());
                        row.createCell(4).setCellValue(main.getAverageGrade());
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
