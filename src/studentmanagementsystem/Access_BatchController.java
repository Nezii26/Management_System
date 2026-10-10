/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class Access_BatchController {
   
	private final BatchController batchController;
	private static Access_BatchController access_BatchController;
        
	private Access_BatchController(){
		batchController=new BatchController();
	}
	public static Access_BatchController getInstance(){
		if(access_BatchController==null){
			access_BatchController=new Access_BatchController();
		}
		return access_BatchController;
	}
	public BatchController getBatchCollection(){
		return batchController;
	}

}
