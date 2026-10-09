/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class Access_StudentCollection {
    
	private StudentCollection studentCollection;
	private static Access_StudentCollection access_StudentCollection;
        
	private Access_StudentCollection(){
		studentCollection=new StudentCollection();
	}
	public static Access_StudentCollection getInstance(){
		if(access_StudentCollection==null){
			access_StudentCollection=new Access_StudentCollection();
		}
		return access_StudentCollection;
	}
	public StudentCollection getStudentCollection(){
		return studentCollection;
	}
}
