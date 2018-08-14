package level.jbc.one;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        School school = new School();

        ArrayList<Student> studentList = new ArrayList<>();
        SchoolClass schoolClass = new SchoolClass();

        school.schoolMap.put(schoolClass, studentList);
    }
}
