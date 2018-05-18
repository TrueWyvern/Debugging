/* This program is intended to take a numerical grade and
 * convert it to either a letter or level grade.  It
 * contains errors which need to be debugged.
 */
import java.util.*;
public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double type;         
	do
        {
	    System.out.println("MAIN MENU");
	    System.out.println("=========");
	    System.out.println("1. Convert to a Level grade");
	    System.out.println("2. Convert to a Letter grade");
	    System.out.println("3. Exit \n");
	    System.out.println("Please enter your selection: ");
	    type=sc.nextDouble();

	    if (type == 1) { 
                percentageToAlpha();  
            }
	    if (type == 2) { 
                percentageToLevel();
            }
        } while (type != 3);
    }

    // Conversion function percentage to Alpha
    public static void percentageToAlpha ()
    {
	double grade;  
	String alphaGrade;
	String messageOut;

	System.out.println("Please enter the numeric grade: "); 
	grade=sc.nextDouble();

	if (grade < 50) {
		alphaGrade="F";
	}else if ((grade >= 50) && (grade <53))
	{
		alphaGrade = "D-";
	}else if ((grade >= 53) && (grade <57))
	{
		alphaGrade = "D";
	}else if ((grade >= 57) && (grade <60))
	{
		alphaGrade = "D+";
	}else if ((grade >= 60) && (grade <63))  
	{
		alphaGrade = "C-";
	}else if ((grade >= 63) && (grade <67))
	{
		alphaGrade = "C";
	}else if ((grade >= 67) && (grade <70))
	{
		alphaGrade = "C+";
	}else if ((grade >= 70) && (grade <73))
	{
		alphaGrade = "B-";
	}else if ((grade >= 73) && (grade <77))
	{
		alphaGrade = "B";
	}else if ((grade >= 77) && (grade <80))
	{
		alphaGrade = "B+";
	}else if ((grade >= 80) && (grade <85))
	{
		alphaGrade = "A-";
	}else if ((grade >= 85) && (grade <90))
	{
		alphaGrade = "A";
	}else if ((grade >= 90) && (grade <=100))
	{
		alphaGrade = "A+";
	}else
        {
                alphaGrade = "Error - invalid mark, try again!";
	}

	messageOut=(grade + "% = " + alphaGrade);
	System.out.println(messageOut);
        
    }

    // Conversion function percentage to level
    public static void percentageToLevel ()

    {
	double grade;
	String levelGrade="";
	String messageOut;

	System.out.println("Please enter the numeric grade: ");
	grade=sc.nextDouble();

	if (grade < 50) {
		levelGrade="R";
	}else if ((grade >= 50) && (grade <53))
	{
		levelGrade="L1-";
	}else if ((grade >= 53) && (grade <57))
	{
		levelGrade="L1";
	}else if ((grade >= 57) && (grade <60))
	{
		levelGrade="L1+";
	}else if ((grade >= 60) && (grade <63))
	{
		levelGrade="L2-";
	}else if ((grade >= 63) && (grade <67))
	{
		levelGrade="L2";
	}else if ((grade >= 67) && (grade <70))
	{
		levelGrade="L2+";
	}else if ((grade >= 70) && (grade <73))
	{
		levelGrade="L3-";
	}else if ((grade >= 73) && (grade <77))
	{
		levelGrade="L3";                   
	}else if ((grade >= 77) && (grade <80))
	{
		levelGrade="L3+";
	}else if ((grade >= 80) && (grade <85))
	{
		levelGrade="L4-";
	}else if ((grade >= 85) && (grade <90))
	{
		levelGrade="L4";
	}else if ((grade >= 90) && (grade <=100))   
	{
		levelGrade="L4+";
	}else if (grade>100){
		levelGrade="Error - invalid mark, try again!";
	}

	messageOut=(grade + "% = " + levelGrade);  
	System.out.println(messageOut);
    }

}
