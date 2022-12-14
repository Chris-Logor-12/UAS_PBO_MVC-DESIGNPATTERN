package uas_pbomvc;

import uas_pbomvc.Student;
import uas_pbomvc.StudentController;


public class UAS_PBOMVC {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Ricos");
      student.setRollNo("16");
      return student;
   }
}