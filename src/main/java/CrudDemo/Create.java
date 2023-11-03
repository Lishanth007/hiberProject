package CrudDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Create {

	public static void main(String[] args) {
		SessionFactory sf = hiberConfig.ImplementSessionFactroy();
		
		Session sObj = sf.openSession();
		
		Transaction ts = sObj.beginTransaction();
		
		Aliens myAliens1 = new Aliens(1, "Maya", "Green", "venus");
		Aliens myAliens2 = new Aliens(2, "Lishanth", "white", "Mercury");
		Aliens myAliens3 = new Aliens(3, "Barbie", "Blue", "Jupiter");
		
		sObj.save(myAliens1);
		sObj.save(myAliens2);
		sObj.save(myAliens3);
		
		ts.commit();
	}

}
