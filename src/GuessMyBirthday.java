import javax.swing.JOptionPane;

public class GuessMyBirthday{
	public static void main(String[] args) {
		String set1 = 
				" 1  3  5  7\n" + 
				" 9 11 13 15\n" + 
				"17 19 21 23\n" + 
				"25 27 29 31";
		
		String set2 = 
				" 2  3  6  7\n" + 
				"10 11 14 15\n" + 
				"18 19 22 23\n" + 
				"26 27 30 31";
		
		String set3 = 
				" 4  5  6  7\n" + 
				"12 13 14 15\n" + 
				"20 21 22 23\n" + 
				"28 29 30 31";
		
		String set4 = 
				" 8  9 10 11\n" + 
				"12 13 14 15\n" + 
				"24 25 26 27\n" + 
				"28 29 30 31";
		
		String set5 = 
				"16 17 18 19\n" + 
				"20 21 22 23\n" + 
				"24 25 26 27\n" + 
				"28 29 30 31";
		
		//Begin GUI setup
		
		int day = 0;
		
		String q1 = JOptionPane.showInputDialog("Is your " +
		"day of birth in this set?\n\n" + set1 + "\n\nEnter 0 for NO and 1 for YES");	
		int ans1 = Integer.parseInt(q1);
		if(ans1 == 1)
			day += 1;
		
		String q2 = JOptionPane.showInputDialog("Is your " +
		"day of birth in this set\n\n?" + set2 + "\n\nEnter 0 for NO and 1 for YES");	
		int ans2 = Integer.parseInt(q2);
		if(ans2 == 1)
			day += 2;
				
		String q3 = JOptionPane.showInputDialog("Is your " +
		"day of birth in this set?\n\n" + set3 + "\n\nEnter 0 for NO and 1 for YES");	
		int ans3 = Integer.parseInt(q3);
		if(ans3 == 1)
			day += 4;
		
		String q4 = JOptionPane.showInputDialog("Is your " +
		"day of birth in this set?\n\n" + set4 + "\n\nEnter 0 for NO and 1 for YES");	
		int ans4 = Integer.parseInt(q4);
		if(ans4 == 1)
			day += 8;
				
		String q5 = JOptionPane.showInputDialog("Is your " +
		"day of birth in this set?\n\n" + set5 + "\n\nEnter 0 for NO and 1 for YES");	
		int ans5 = Integer.parseInt(q5);
		if(ans5 == 1)
			day += 16;
		
		JOptionPane.showMessageDialog(null, "Your day of birth is "
		    + day + "!", "We know your day of birth!", JOptionPane.PLAIN_MESSAGE);
	}
}