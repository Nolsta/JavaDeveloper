package awethu.java;

public class Students {

	
		// TODO Auto-generated method stub
		String surname;
		String name;
		String subject;
		int classtest1;
		int classtest2;
		int summative;
		int exam;
		double finalMark;
		String grade;
	
		
		public Students(String aGrade,double aFinalMark,String aSurname,String aName,String aSubject,int aClassTest1,int aClassTest2,int aSummative,int aExam)
		{
			surname=aSurname;
			name=aName;
			subject=aSubject;
			classtest1=aClassTest1;
			classtest2=aClassTest2;
			summative=aSummative;
			exam=aExam;
			grade=aGrade;
			finalMark=aFinalMark;
		}
		public String getSurname()
		{
			return surname;
		}
		public String getName()
		{
			return name;
		}
		public String getSubject()
		{
			return subject;
		}
		public int getClasstest1()
		{
			return classtest1;
		}
		public int getClasstest2()
		{
			return classtest2;
		}
		public int getSummative()
		{
			return summative;
		}
		public int getExam()
		{
			return exam;
		}
		public double getFinalMark()
		{
			return finalMark;
		}
		public String getGrade()
		{
			return grade;
		}
	}
