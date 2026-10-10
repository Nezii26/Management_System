/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class Access_StudentController {
    
	private StudentController studentController;
	private static Access_StudentController access_StudentController;
        
	private Access_StudentController(){
		studentController=new StudentController();
	}
	public static Access_StudentController getInstance(){
		if(access_StudentController==null){
			access_StudentController=new Access_StudentController();
		}
		return access_StudentController;
	}
	public StudentController getStudentController(){
		return studentController;
	}
}
