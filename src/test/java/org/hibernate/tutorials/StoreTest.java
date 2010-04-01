package org.hibernate.tutorials;

import java.io.Serializable;
import java.util.Date;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.tutorials.domain.Event;
import org.hibernate.tutorials.util.HibernateUtil;

public class StoreTest extends TestCase {

	public void testCreateStore() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Event theEvent = new Event();
		theEvent.setTitle("My Event");
		theEvent.setDate(new Date());
		Serializable s = session.save(theEvent);
		
		Event anEvent = (Event) session.load(Event.class, s);
		session.getTransaction().commit();
		
		assertEquals(anEvent, theEvent);
		
	}
	
}
