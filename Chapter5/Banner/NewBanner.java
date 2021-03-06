public class NewBanner {
    private final String _content;

    public NewBanner(String content) {
	_content = content;
    }

    private void printBorder() {
	System.out.print("+");
	for (int i = 0; i < _content.length(); i++) {
	    System.out.print("-");
	}
	System.out.println("+");	
    }

    private void printContent(int times) {
	for (int i = 0; i < times; i++) {
	    System.out.println("|" + _content + "|");
	}
    }

    public void print(int times) {
	printBorder();
	printContent(times);
	printBorder();
    }
}
