public class FindInt {
    public static boolean find(int[] data, int target) {
	boolean flag = false;
	for (int i = 0; i < data.length && !flag; i++) {
	    if (data[i] == target) {
		flag = true;
	    }
	}
	return flag;
    }


    /* Refactoring 1; break with explicit variable name */
    public static boolean find_rev_break(int[] data, int target) {
	boolean found = false;
	for (int i = 0; i < data.length; i++) {
	    if (data[i] == target) {
		found = true;
		break;
	    }
	}
	return found;
    }


    /* Refactoring 1; return */
    public static boolean find_rev_return(int[] data, int target) {
	for (int i = 0; i < data.length; i++) {
	    if (data[i] == target) {
		return true;
	    }
	}
	return false;
    }
}
