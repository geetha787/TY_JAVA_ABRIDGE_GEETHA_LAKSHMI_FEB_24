package com.capgemini.quiz.day4;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("GeeksForGeeks"); 
        
        // making str eligible for gc 
        str = null;  
              
        // calling garbage collector 
        System.gc();  
              
        // waiting for gc to complete 
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
      
        System.out.println("end of main"); 
    }
	

  
    @Override
    protected void finalize()  
    { 
        System.out.println("finalize method called"); 
    }
}
    


