
public class TimeSpanTester {

	public static void main(String[] args) {
		//This testing code is pretty bare-bones.
		//Feel free to put in your own tests as well. 
		
		//TimeSpanned t1 = new TimeSpanned(0, 125);
		TimeSpanned t1 = new TimeSpanned(0, 125);
		System.out.println(t1); //Should output "2h5m"
		
		t1.add(1, 70);
		System.out.println(t1); //Should output "4h15m"
		
		//uncommenting the next line should give you an error "The field TimeSpan.hours is not visible." Make sure your fields are private!
		//t.hours = 5;
		
		System.out.println( t1.getHours() );  //Should output 4
		
		System.out.println( t1.getMinutes() ); //Should output 15
		
		System.out.println( t1.getTotalHours() ); //Should output 4.25 // Did not use divisor and modulus for calculations thus test prints actual 
		
		TimeSpanned t2 = new TimeSpanned(2, 50);
		t1.add(t2); 
		System.out.println(t1); //Should output "7h5m"
	}

}
