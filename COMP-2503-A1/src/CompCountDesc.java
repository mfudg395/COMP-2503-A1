import java.util.Comparator;

public class CompCountDesc implements Comparator<Token> {

	@Override
	public int compare(Token t1, Token t2) {
		if (t1.getCounter() == t2.getCounter()) {
			return t1.compareTo(t2);
		}
		return t1.getCounter() - t2.getCounter();
	}
}