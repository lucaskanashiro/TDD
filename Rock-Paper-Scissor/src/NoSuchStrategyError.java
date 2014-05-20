
@SuppressWarnings("serial")
public class NoSuchStrategyError extends Exception{

	public NoSuchStrategyError(){
		super("Strategy must be one of R,P,S");
	}
}
