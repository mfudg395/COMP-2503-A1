public class Token implements Comparable<Token>
{

	private String word;
	
	public Token(String word) 
	{
		this.word = word;
	}
	
	private String getWord() 
	{
		return word;
	}
	
	public String toString()
	{
		return word;
	}
	
	@Override
	public int compareTo(Token other) 
	{
		return this.word.compareTo(other.getWord());
	}
	
	@Override
	public boolean equals(Object other) 
	{
		if (other == this)
			return true;
		if (other == null)
			return false;
		Token checkToken = (Token) other;
		return word.equals(checkToken.getWord());
	}

}