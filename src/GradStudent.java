public class GradStudent extends Student
{
    private int gradID;

    public GradStudent()
    {
        super();
        gradID = 0;
    }

    public GradStudent (String studName, int[] stduTest, String studGrade, int gradStudID)
    {
        super(studName, stduTest, studGrade);
        gradID = gradStudID;
    }

    public int getGradID()
    {
        return gradID;
    }

    public void computeGrade()
    {
        super.computeGrade();
        if (getTestAverage() >= 90)
            setGrade("Pass with distinction");
    }
}
