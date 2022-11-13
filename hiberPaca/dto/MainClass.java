package hiberPaca.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
	 
		ModelClass obj = new ModelClass();
		ModelClass obj2 = new ModelClass();
		ModelClass obj3 = new ModelClass();
		ModelClass obj4 = new ModelClass();
		
		obj.setModelId("t1");
		obj.setName("Kafumisi");
		obj.setTribe("Musoga");
		
		obj2.setModelId("t2");
		obj2.setName("Kagogwa");
		obj2.setTribe("Muganda");
		
		obj3.setModelId("t32");
		obj3.setName("Sabula");
		obj3.setTribe("Muchwezi");
		
		obj4.setModelId("t42");
		obj4.setName("Kayingini");
		obj4.setTribe("Muganda");
		
		SessionFactory Fac = new Configuration().configure().buildSessionFactory();
		Session session = Fac.openSession();
		session.beginTransaction();
		session.save(obj);
		session.save(obj2);
		session.save(obj3);
		session.save(obj4);
		session.getTransaction().commit();
		
		
	}

}
