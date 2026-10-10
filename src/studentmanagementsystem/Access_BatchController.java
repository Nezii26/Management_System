/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class Access_BatchCollection {
   
	private final BatchCollection batchCollection;
	private static Access_BatchCollection access_BatchCollection;
        
	private Access_BatchCollection(){
		batchCollection=new BatchCollection();
	}
	public static Access_BatchCollection getInstance(){
		if(access_BatchCollection==null){
			access_BatchCollection=new Access_BatchCollection();
		}
		return access_BatchCollection;
	}
	public BatchCollection getBatchCollection(){
		return batchCollection;
	}

}
