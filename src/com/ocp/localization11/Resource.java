package com.ocp.localization11;

public class Resource implements AutoCloseable{
   public void close() throws Exception {
	   System.out.print("close-");
   }
   public void open () {
	   System.out.print("open-");
   }
	
   
   public static void main(String[] args) {
	   
	   Resource res1 = new Resource();
	   try {
		   res1.open();
		   res1.close();
	   }catch(Exception e) {
		   System.out.println("Exception -1 ");
	   }
	   //try(res1= new Resource()){
	    try(Resource res2= new Resource()){
		   res2.open();
	   }catch(Exception e){
		   System.out.println("Exception -2");
	   }
	
   }	
}
