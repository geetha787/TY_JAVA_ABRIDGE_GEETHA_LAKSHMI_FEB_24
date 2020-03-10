package com.capgemini.quiz.day7;




	class Alpha  
	{ 
	    static String s = " "; 
	    protected Alpha()  
	    { 
	        s += "alpha "; 
	    } 
	} 
	class SubAlpha extends Alpha  
	{ 
	    private SubAlpha()  
	    { 
	        s += "sub "; 
	    } 
	} 
	public class Quiz6 extends Alpha {
		private Quiz6 ()  
	    { 
	        s += "subsub "; 
	    } 
	    public static void main(String[] args)  
	    { 
	        new Quiz6(); 
	        System.out.println(s); 
	    } 
}
