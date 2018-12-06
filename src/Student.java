public class Student
{
    public final static int NUM_TESTS = 3;
    private String name;
    private int[] tests;
    private String grade;

    public Student()
    {
        name = "";
        tests = new int[NUM_TESTS];
        grade = "";
    }

    public Student(String studName, int[] stduTest, String studGrade)
    {
        name = studName;
        tests = stduTest;
        grade = studGrade;
    }

    public double getTestAverage()
    {
        double sum = 0;
        for (int n : tests)
            sum += n;
        return sum / NUM_TESTS;
    }

    public void computeGrade()
    {
        if (name.equals(""))
            grade = "No grade";
        else
        {
            if (getTestAverage() >= 65)
                grade = "Pass";
            else
                grade = "Fail";
        }
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public String getGrade()
    {
        return grade;
    }
}
