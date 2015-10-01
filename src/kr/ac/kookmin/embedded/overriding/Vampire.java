package kr.ac.kookmin.embedded.overriding;

class Vampire extends Monster{
	boolean frighten(int x){
		System.out.println("a bite?");
		return false;
	}
}