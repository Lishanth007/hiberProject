package CrudDemo;

import java.io.ObjectInputFilter.Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.mysql.cj.xdevapi.SessionFactory;

public class hiberConfig {

	public static SessionFactory ImplementSessionFactroy() {
		Configuration con = new Configuration();
		con.configure();
		
		return con.buildSessionFactory();
	}

}
