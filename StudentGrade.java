/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codealpha;
import java.util.*;
class Result {
    Scanner sc = new Scanner(System.in);
    int n,i=0,j=0;
    int[] roll;
    String [] fname;
    String [] lname;
    float [][] marks;
    float [] total;
    float [] avg;
    float [][] max;
    float [][] min;
    String [] grade;
    String Aa = "A+";
    String A = "A";
     String Bb = "B+";
    String B = "B";
     String Cc = "C+";
    String C = "C";
     String P = "P";
    String F = "F";
    void input(){
    System.out.print("Enter Number Of Student :");
    n = sc.nextInt();
    roll = new int[n];
    fname = new String[n];
    lname = new String[n];
    marks = new float[n][5];
    total = new float[n];
    avg = new float[n];
    max = new float[n][5];
    min = new float[n][5];
    grade= new String[n];
    }
    void in_marks(){
    while(i<n){
    System.out.print("Enter Roll Number Of Student "+(i+1)+" : ");
    roll[i] = sc.nextInt();
    System.out.print("Enter Name Of Student "+(i+1)+" : ");
    fname[i] = sc.nextLine();
    lname[i] = sc.nextLine();
    System.out.println("Enter Marks :");
    System.out.println("English : ");
    marks [i][0]=sc.nextFloat();
    System.out.println("Maths : ");
    marks [i][1]=sc.nextFloat();
    System.out.println("Physics : ");
    marks [i][2]=sc.nextFloat();
    System.out.println("Chemistry : ");
    marks [i][3]=sc.nextFloat();
    System.out.println("Biology : ");
    marks [i][4]=sc.nextFloat();
    System.out.println();
    i++;
    }
    }
    void cal(){
    for(int i=0;i<n;i++){
    max[i][0] = marks[i][0];
    min[i][0] = marks[i][0];
    
    for(j=0;j<5;j++){
    total[i] += marks[i][j];
    avg[i] = total[i]/5;
    
    if(max[i][0] < marks[i][j]){
    max[i][0] = marks[i][j];
    }
    if (min[i][0] > marks[i][j]){
    min[i][0] = marks[i][j];
    }
    if(avg[i]>=90){
    grade[i]=Aa;
    }
    else if(avg[i]>=80){
    grade[i]=A;
    }
    else if(avg[i]>=70){
    grade[i]=Bb;
    }
    else if(avg[i]>=60){
    grade[i]=B;
    }
    else if(avg[i]>=50){
    grade[i]=Cc;
    }
    else if(avg[i]>=40){
    grade[i]=C;
    }
    else if(avg[i]>=30){
    grade[i]=P;
    }
    else{
    grade[i] = F;
    }
    }
    }
    }
void disp(){
System.out.println("****************** RESULT ********************");
for(i=0;i<n;i++){ System.out.println("~~~~~~~~~~~~~"+fname[i]+lname[i]+"("+roll[i]+")"+""
        + "~~~~~~~~\nMax Marks:"+max[i][0]+"| Min Marks:"+min[i][0]+"| Avg Marks:"+avg[i]+"|"
        + "Grade:"+grade[i]+"\n");
}
}
}
public class StudentGrade{
public static void main(String[] args){
Result grade = new Result();
grade.input();
grade.in_marks();
grade.cal();
grade.disp();
}
}
