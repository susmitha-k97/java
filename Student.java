
public class Student {
	String stdname;
	int regno;
    double percentage;
	String branch;
public static void main(String[] args)
{
	Student s1=new Student();
	s1.stdname="scott";
	s1.regno=101;
	s1.percentage=81.2;
	s1.branch="cse";
	System.out.println("Student name : "+s1.stdname);
	System.out.println("Student id: "+s1.regno);
	System.out.println("Student score: "+s1.percentage);
	System.out.println("Student branch: "+s1.branch);
	Student s2=new Student();
	s2.stdname="tarak";
	s2.regno=102;
	s2.percentage=91.2;
	s2.branch="csm";
	System.out.println("Student name : "+s2.stdname);
	System.out.println("Student id: "+s2.regno);
	System.out.println("Student score: "+s2.percentage);
	System.out.println("Student branch: "+s2.branch);
	Student s3=new Student();
	s3.stdname="yesh";
	s3.regno=103;
	s3.percentage=71.2;
	s3.branch="csd";
	System.out.println("Student name : "+s3.stdname);
	System.out.println("Student id: "+s3.regno);
	System.out.println("Student score: "+s3.percentage);
	System.out.println("Student branch: "+s3.branch);
	Student s4=new Student();
	s4.stdname="sree";
	s4.regno=104;
	s4.percentage=51.2;
	s4.branch="csbs";
	System.out.println("Student name : "+s4.stdname);
	System.out.println("Student id: "+s4.regno);
	System.out.println("Student score: "+s4.percentage);
	System.out.println("Student branch: "+s4.branch);
	Student s5=new Student();
	s5.stdname="somu";
	s5.regno=105;
	s5.percentage=79.2;
	s5.branch="civil";
	System.out.println("Student name : "+s5.stdname);
	System.out.println("Student id: "+s5.regno);
	System.out.println("Student score: "+s5.percentage);
	System.out.println("Student branch: "+s5.branch);
}
}
