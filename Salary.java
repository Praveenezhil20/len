import java.io.*;
import java.util.Scanner;
abstract class Employee
{
proctected int empid;
proctected long mobile;
proctected string name;address,mailid;
proctected double salary,bp,da,hra,pf,club,gross,net;

proctected void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Employee name:");
name=sc.nextLine();
System.out.println("Enter the Employee id:");
empid=sc.nextInt();
System.out.println("Enter the Address:");
address=sc.nextLine();
System.out.println("Enter the mail id:");
mailid=sc.nextLine();
System.out.println("Enter the mobile id:");
mobile=sc.nextLong();
}
proctected CalculateSalary()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net(gross-pf-club);
}
proctected void Display()
{
System.out.println("\t\t PAY SLIP\n");
System.out.println("Employee Name:"+name);
System.out.println(Employee id:"+empid);
System.out.println("Mail id:"+mailid);
System.out.println("Address:"+address);
System.out.println("Mobile no:"+mobile);
System.out.println("Basic Pay:Rs:"+string.format("%2f",bp));
System.out.println("Gross Pay:Rs:"+string.format("%2f",gross));
System.out.println("Net Pay:Rs:"+string.format("%2f",net));
}
abstract void getBasicPay();
}
class Programmer extends Employee
{
Scanner sc=new Scanner(System.in);
public void getBasicPay()
{
System.out.println("Enter the basic pay for programmer:");
bp=sc.nextDouble();
}
}
class Asstprfessor extends Employee
{
Scanner sc=new Scanner(System.in);
public void getBasicPay()
{
System.out.println("Enter the basic pay for astprofessor:");
bp=sc.nextDouble();
}
}
class Associateprofessor extends Employee
{
Scanner sc=new Scanner(System.in);
public void getBasicPay()
{
System.out.println("Enter the basic pay for Associateprofessor:");
bp=sc.nextDouble();
}
}
class Professor extends Employee
{
Scanner sc=new Scanner(System.in);
public void getBasicPay()
{
System.out.println("Enter the basic pay for professor:");
bp=sc.nextDouble();
}
}
class Salary
{
public static void main(String args[])
{
int ch=0;
Scanner sc=new Scanner(System.in);
do
{
Employee emp=NULL;
System.out.println("\nPAYROLL\n1.Programmer\n2.Asstprofessor\n3.Associateprofessor\n4.Professor\n5.Exit");
System.out.println("Entr choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
{
emp=new Programmer();
break;
}
case 2:
{
emp=new Asstprfessor():
break;
}
case 3:
{
emp=new Associateprofessor();
break;
}
case 4:
{
emp=new Professor();
break;
}
case 5:
{
System.out.println("Ends");
}
default:
{
System.out.println("Invalid choice");
}
}
if(ch==1||ch==2||ch==3||ch==4)
{
emp.getData();
emp.getBasicPay();
emp.CalculateSalary();
emp.Display();
}
}while(ch!=5);
}
}