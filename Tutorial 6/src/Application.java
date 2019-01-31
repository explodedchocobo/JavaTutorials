public class Application {
	public static void main(String[] args) {
		
		int loop = 0;
		
		while(true) {
			System.out.println("Looping: " + loop);
			
			if(loop == 5) {
				System.out.println("Done");
				break;
			}
			
			loop++;
			
			System.out.println("Running");
		}
	}
}
