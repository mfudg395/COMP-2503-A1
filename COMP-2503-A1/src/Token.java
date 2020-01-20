public class Token implements Comparable {

	private String word;
	
	public Token(String word) {
		this.word = word;
	}
	
	private String getWord() {
		return word;
	}
	
	@Override
	public int compareTo(Object other) {
		return 0;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (other == null)
			return false;
		Token checkToken = (Token) other;
		return word.equals(checkToken.getWord());
	}

}