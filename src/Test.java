import java.util.*;
public class Test
{
    public static void main(String[] arg)
    {
        Student s = new Student("Kai", new int[] {65,68,64}, "none");
        Student t = new UnderGrad("Lin", new int[] {70, 70, 69}, "none");
        Student u = new GradStudent("San", new int[] {90,99,89}, "none", 2143);
        /*
        s.computeGrade();
        t.computeGrade();
        u.computeGrade();
        System.out.println(s.getName() + "," + s.getGrade());
        System.out.println(t.getName() + "," + t.getGrade());
        System.out.println(u.getName() + "," + u.getGrade());
        */
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s);
        studentList.add(t);
        studentList.add(u);

        for (Student stu : studentList)
        {
            stu.computeGrade();
            System.out.println(stu.getName() + ", " + stu.getGrade());
        }

        int gid = ((GradStudent)u).getGradID();
        System.out.println(u.getName() + ", " + gid);

    }
}
