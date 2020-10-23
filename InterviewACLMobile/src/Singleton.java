
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() throws Exception {
		if(instance!=null) {
			throw new Exception("Already instance has been created");
		}
	}
	
	public static Singleton getInstance() throws Exception {
		if(instance==null) {
			synchronized(Singleton.class) {
				if(instance==null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	public Object readResolve() throws Exception {
		throw new Exception("Cannot be deserialized");
	}

	protected Object clone() {
		throw new Exception("Clone not supported");
	}
	
}
