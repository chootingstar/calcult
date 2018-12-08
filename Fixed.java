
public class Fixed {

	
	public int add(int a, int b) {
		return a + b;
	}
	public int subract(int a, int b) {
		return a - b;
		

	}
	public int multiply(int a, int b) {
		return a * b;
		

	}
	//irdivide provided by Irina
/*	public int irdivide(int a, int b) {

        if (b == 0) {

            System.out.println("Error! Dividing by zero is not allowed.");

            return 0;
//Apparently there is no way to work around having zero under the message
        }

        else {

            return a / b;

        }

    }*/
	public int divide(int a, int b) {
		//If statement works great
		if( b == 0 ){
			System.out.println("Can't divide by zero");
			} else {
				return a / b;
				}
		return a + b;
		//I want to 'not!' show this return without error messages

		}
	
	//Named sadd to differentiate from add, and it makes a nice pun
	public double sadd(double d, double e) {
//This is a double type code because it wasn't let me use float type
		return d + e;

	}
	
	public static void main(String args[]) {
		Fixed myCalculator = new Fixed();
		System.out.println(myCalculator.add(8,4));
		System.out.println(myCalculator.subract(8,(-4)));
		System.out.println(myCalculator.multiply(8,4));
	System.out.println(myCalculator.divide(8,0));
		float x = (float) myCalculator.sadd(2.07, 1.07);
		/*Because double type data was making unwanted results
		 * I decided that I really needed float type data and
		took myCalculator.sadd(); out and made a new variable
		that would be floatype. Eclipse corrected me to use
	typecasting and now sadd's doubletype is converted to floatype */
		System.out.println(x);
	}
}