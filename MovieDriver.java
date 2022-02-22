import java.util.Scanner; 
public class MovieDriver {
	public static void main(String[] args)
	{
		while (true)
		{
		Scanner keyboard = new Scanner(System.in);
		Movie m = new Movie();
	
		System.out.println("Enter the name of a movie");
		String name = keyboard.nextLine(); 
		m.setTitle(name);
		
		System.out.println("Enter the rating of the movie");
		String rating = keyboard.nextLine();
		m.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets=Integer.parseInt(keyboard.nextLine());
		m.setSoldTickets(tickets);
		
		System.out.println(m);
		System.out.println("Do you want to enter another? (y or n)");
		String option = keyboard.nextLine();

		if(option.equalsIgnoreCase("n"))
		{
			System.out.println("Goodbye");	
			break;
		}	
		}			
	}	
}