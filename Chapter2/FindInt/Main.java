public class Main {
    public static void main(String[] args) {
	int [] data = {
	    1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
	};
	if (FindInt.find(data, 5)) {
	    System.out.println("Found!");
	} else {
	    System.out.println("Not found...");
	}
	if (FindInt.find_rev_break(data, 5)) {
	    System.out.println("Found!");
	} else {
	    System.out.println("Not found...");
	}
	if (FindInt.find_rev_return(data, 5)) {
	    System.out.println("Found!");
	} else {
	    System.out.println("Not found...");
	}
    }
}
