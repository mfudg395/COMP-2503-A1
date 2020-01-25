public class Token implements Comparable<Token>
{

	private String word;
	private int counter;
	
	public Token(String word) {
		this.word = word;
		counter = 1;
	}
	
	public String getWord() {
		return word;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public String toString(){
		return word + " : " + counter;
	}
	
	public void increment(){
		counter++;
	}
	
	@Override
	public int compareTo(Token other) {
		return this.word.compareTo(other.getWord());
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (other == null)
			return false;
		Token checkToken = (Token) other;
		return this.word.equals(checkToken.getWord());
	}
}
