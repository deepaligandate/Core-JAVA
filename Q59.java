class AgeDoesnotMatchException extends Exception {
	public AgeDoesnotMatchException() {
		super("Age is less than 18 .Invalid age for vote.");
	}
	
}

class Voter{
	int voterId ;
	String name;
	int age;
	
	public Voter(int voterId , String name,int age) throws AgeDoesnotMatchException{
		if(age>18) {
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		}
		else {
			throw new AgeDoesnotMatchException();
		}
		
	}
	
	@Override
	public String toString() {
		return "voterId=" + voterId + " name=" + name + ", age=" + age ;
	}
	
 }


class VoterDemo {

	public static void main(String[] args) {
		

		try {
			//Voter v = new Voter(1,"sai",20);
			Voter v1 = new Voter(2,"samii",14);
		//System.out.println(v);
		System.out.println(v1);
		
		}catch(AgeDoesnotMatchException e) {
			System.out.println(e);
			}
		}
}		

