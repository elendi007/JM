package level.jbc.one;

public class Main {
    public static void main(String[] args){
        School school = new School();

        StudentList<String> studentList = new StudentList<>();
        studentList.add("IVAN");
        studentList.add("OLGA");
        System.out.println(studentList.get(1));

        SchoolClass classA = new SchoolClass();

        school.schoolMap.put(classA, studentList);
    }
}
