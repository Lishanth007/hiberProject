package CrudDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.env.internal.DefaultSchemaNameResolver.SchemaNameResolverJava17Delegate;

public class Retrieve {

	
		public static void main(String[] args) {
			SessionFactory sf = hiberConfig.ImplementSessionFactroy();
			
			Session sObj = sf.openSession();
			
			Transaction ts = sObj.beginTransaction();
			
			Aliens a1 = sObj.get(Aliens.class, 1);
			System.out.println("AlienID: "+a1.getAid());
			System.out.println("AlienID: "+a1.getAlienname());
			System.out.println("AlienID: "+a1.getColor());
			System.out.println("AlienID: "+a1.getPlante());
	}

}
