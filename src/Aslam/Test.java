package Aslam;

public class Test {
	
	public static void main(String[] args) {
		
		 test1 t = new test1();
		 
		 t.test1();
		 
		 
		 test2 t1 = new test2();
		  
		 t1.test3();

	}

}

class test1
{
	
  public void test1()
  {
	  System.out.println("test1 method");
  }
}  
  
  class test2 extends test1
  {
	  
	  public void test2()
	  {
  
		  System.out.println("test2 method");
	  } 
	  
	  public void test3()
	  {
            super.test1();
            this.test2();
		  System.out.println("test3 method");
	  } 
  }


