 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author wwwpa
 */
public class BatchCollection {
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;
    
	public static Batch[] batch ={
                       
                        new Batch(106, ENROLLMENTCLOSED),
                        new Batch(107, ENROLLMENTCLOSED),
                        new Batch(108, ENROLLMENTCLOSED),
			new Batch(109, ENROLLMENTCLOSED),
			new Batch(110, ENROLLMENTOPEN),
			new Batch(111, ENROLLMENTOPEN)
			
	};
   
   public boolean checkBatchStatus(int batchTNo){
       for(int i=0; i<batch.length; i++){
           if(batchTNo==batch[i].getBatchNo()){
               if(batch[i].getBatchStatus()==ENROLLMENTOPEN){
                   return true;
               }
                    
           }
       }
       return false;
   }
   
   public boolean checkBatchExits(int batchNo){
       for(int i=0; i<batch.length; i++){
           if(batchNo==batch[i].getBatchNo()){
               return true;
           }
       }
       return false;
   }
   
   public void extendBatchArray(){
       Batch[] temp = new Batch[batch.length+1];
       for(int i=0; i<batch.length; i++){
           temp[i]=batch[i];
       }
       batch=temp;
   }
   
   public boolean addNewBatch(int batchNo){
       extendBatchArray();
       this.batch[this.batch.length-1]=new Batch(batchNo,1);
       return true;
   }
   
   public boolean updateBatchStatus(int batchNo, int status){
       for(int i=0; i<batch.length; i++){
           if(batch[i].getBatchNo()==batchNo){
               batch[i].setBatchStatus(status);
               return true;
           }
       }
       return false;
   }
    
   public Batch[] getallBatch(){
       Batch[]tempBatch= new Batch[batch.length];
       for(int i=0; i<batch.length; i++){
           tempBatch[i]=batch[i];
       }
       return tempBatch;
   }
}
