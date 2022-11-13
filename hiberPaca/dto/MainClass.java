package hiberPaca.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
	 
		ModelClass obj = new ModelClass();
		ModelClass obj2 = new ModelClass();
		
		ModelClass obj5 = new ModelClass();
		
		obj.setModelId("t1");
		obj.setName("Kafumisi");
		obj.setTribe("Musoga");
		
		obj2.setModelId("t2");
		obj2.setName("Kagogwa");
		obj2.setTribe("Muganda");
		
		obj5.setModelId("t7");
		obj5.setName("Mudaliso");
		obj5.setTribe("Muganda");
		
		SessionFactory Fac = new Configuration().configure().buildSessionFactory();
		Session session = Fac.openSession();
		session.beginTransaction();
		session.save(obj);
		session.save(obj2);
		
		session.save(obj5);
		session.getTransaction().commit();
		
		
	}

}
