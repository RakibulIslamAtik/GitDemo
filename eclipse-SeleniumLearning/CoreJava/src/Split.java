
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passwordText = "Please use temporary password 'rahulshettyacademy'to Login.";
		String [] passwordArray = passwordText.split("'");
		
		
		System.out.println(passwordArray[0]);
		System.out.println(passwordArray[1]);
		System.out.println(passwordArray[2]);
		
		
		String [] passwordArray2 = passwordArray[1].split("'");
		String pass=passwordArray2[0];
		String password = passwordArray[1].split("'")[0];
		//return password;

		System.out.println(pass);
		System.out.println(password);

	}

}
