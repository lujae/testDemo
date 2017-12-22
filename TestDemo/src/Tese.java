import org.omg.CORBA.ShortSeqHelper;

public class Tese {

	public static void main(String[] args) {
	
		InternalSingleton instance = InternalSingleton.getInstance();
		System.out.println(instance.toString());
		
		InternalSingleton instance2 = InternalSingleton.getInstance();
		System.out.println(instance.equals(instance2));
	}
float i= 3;
}
