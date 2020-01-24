public class Token implements Comparable<Token>
{

	private String word;
	private int counter;
	
	public Token(String word) 
	{
		this.word = word;
		counter = 0;
	}
	
	private String getWord() 
	{
		return word;
	}
	
	private int getCounter() 
	{
		return counter;
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