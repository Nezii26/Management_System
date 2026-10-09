/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class Student {
        private String studentId;
        private String studentName;
        private String studentNic;
        private int prfMarks;
        private int dbmsMarks;

    Student(String nic, String name) {
        this.studentNic=nic;
        this.studentName=name;
       
    }
        
	Student(String studentId, String studentName, String studentNic, int prfMarks, int dbmsMarks){
		this.studentId=studentId;
                this.studentName=studentName;
                this.studentNic=studentNic;
                this.prfMarks=prfMarks;
                this.dbmsMarks=dbmsMarks;
	}
	
        @Override
	public String toString(){
		return studentId+"\t"+studentName+"\t"+studentNic+"\t"+prfMarks+"\t"+dbmsMarks;
	
	}
	//getters
	public String getstudentId(){
		return studentId;
	}
	public String getstudentNic(){
		return studentNic;
	}
	public String getstudentName(){
		return studentName;
	}
	public int getprfMarks(){
		return prfMarks;
	}
	public int getdbmsMarks(){
		return dbmsMarks;
	}
	//setter
	public void setstudentId(String studentId){
		this.studentId = studentId;
	}
	public void setstudentNic(String studentNic) {
            this.studentNic = studentNic;
        }
         public void setstudentName(String studentName){
		this.studentName = studentName;
	}
	public void setprfMarks(int prfMarks){
		this.prfMarks = prfMarks;
	}
	public void setdbmsMarks(int dbmsMarks){
		this.dbmsMarks = dbmsMarks;
	}
    
	
}
