/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class Batch {
    private int batchNo;
    private int batchStatus;
	
	Batch(int batchNo, int batchStatus){
		this.batchNo=batchNo;
		this.batchStatus=batchStatus;
	}

	
	public String toString(){
		return batchNo+"\t"+batchStatus;
	}
	
	public int getBatchNo(){
		return batchNo;
	}
	
	public int getBatchStatus(){
		return batchStatus;
	}
	
	public void setBatchNo(int batchNos){
		this.batchNo = batchNo;
	}
	
	public void setBatchStatus(int batchStatus){
		this.batchStatus = batchStatus;
	}

    
}
