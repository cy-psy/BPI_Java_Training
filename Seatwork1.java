package Seatwork1;

public class Seatwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		House house = new House();
		Tree tree = new Tree();
		
		book.title = "Lengend of the Pineapple";
		book.page = 115;
		book.bookDtl();
		
		house.location = "Balete Drive";
		house.window = 4;
		house.houseDtl();
		
		tree.name = "Mangosteen";
		tree.count = 83;
		tree.treeDtl();
	}

}
