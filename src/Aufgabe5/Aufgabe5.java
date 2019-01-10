package Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String matrikelnummer;
    private int jahrgang;

    Student(String name, String matrikelnummer, int jahrgang)
    {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang)
    {
        this.jahrgang = jahrgang;
    }


    List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("axel", "123", 2018));
        studentList.add(new Student("maggi", "456", 2018));
        studentList.add(new Student("lari", "789", 2018));

        for(Student s: studentList)
    {
        System.out.println(s);
    }
}
