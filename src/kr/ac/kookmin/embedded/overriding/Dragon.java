package kr.ac.kookmin.embedded.overriding;

class Dragon extends Monster{
	boolean frighten(int degree){
		System.out.println("breath fire");
		return true;
	}
}