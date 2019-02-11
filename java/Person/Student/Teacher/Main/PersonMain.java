package com.Person.Student.Teacher.Main;

public class PersonMain 
{
	public static void main(String[] args) 
	{
	      Student s1 = new Student("Shubhangi", "Kundalhalli");
	      s1.addCourseGrade("IM500",87);
	      s1.addCourseGrade("IM600", 98);
	      s1.printGrades();
	      System.out.println("Average of grades is " + s1.getAverageGrade());
	      
	     
	      Teacher t1 = new Teacher("Sasi", "Igate");
	      System.out.println(t1);
	      String[] courses = {"01", "02", "03"};
	      for (String course: courses) 
	      {
	         if (t1.addCourse(course)) 
	         {
	        	 System.out.println(course + " Course get added");
	         } 
	         else 
	         {
	        	 System.out.println(course + " Course cannot be added.");
	         }
	      }
	      for (String course: courses) 
	      {
	         if (t1.removeCourse(course)) 
	         {
	        	 System.out.println(course + " Course get removed.");
	         } 
	         else 
	         {
	        	 System.out.println(course + "Course cannot be removed.");
	         }
	      }
	   }
}
