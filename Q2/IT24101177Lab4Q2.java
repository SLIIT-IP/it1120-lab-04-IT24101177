import java.util.Scanner;
    public class IT24101177Lab4Q2{
    
    public static void main(String[]args){

   Scanner input=new Scanner(System.in);
   
  double ExMarks;        //exam marks
  double Finalmarks;     //final exam marks
  double LabSub;         // lab submission marks
  double PerExam;        //percentage given for the exam
  double PerLab;         //percentage given for the lab submission

  {System.out.println("Please enter exam marks (out of 100):");}
  ExMarks=input.nextDouble();

if(ExMarks>101)
{System.out.println("Invalid input for ExMarks submission marks .Terminating programme.");} 

{System.out.print("Please enter lab submission marks (out of 100):");
  LabSub=input.nextDouble();}

 if(LabSub>101)
{System.out.println("Invalid input for lab submission marks .Terminating programme.");} 

{System.out.print("Please enter the percentage given for the exam:");
  PerExam=input.nextDouble();}

if (PerExam>51)
 {System.out.println("The percentages must add up to 100.Terminating programme.");} 

  {System.out.print("Please enter the percentage given for the lab submission:");
  PerLab=input.nextDouble();}

if(PerLab>51)
 {System.out.println("The percentages must add up to 100.Terminating programme.");}

Finalmarks=(ExMarks*PerExam/100)+(LabSub*PerLab/100);

 System.out.print("Final exam mark is:"+Finalmarks);
  }

}
  
