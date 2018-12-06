public class UnderGrad extends Student
{
    public UnderGrad() { super();}

    public UnderGrad(String studName, int[] stduTest, String studGrade)
    {
        super(studName, stduTest, studGrade);
    }

    public void computeGrade()
    {
        if (getTestAverage() >= 70)
            setGrade("Pass");
        else
            setGrade("Fail");
    }
}
