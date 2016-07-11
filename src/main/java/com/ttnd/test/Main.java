package com.ttnd.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.query.spi.ParameterParser.Recognizer;

import com.ttnd.pojo.Badges;
import com.ttnd.pojo.Badges_Earned;
import com.ttnd.pojo.Badges_Remaining;
import com.ttnd.pojo.Employee;
import com.ttnd.pojo.Practice;
import com.ttnd.pojo.Recognise;
import com.ttnd.pojo.Services;

public class Main {

	public static void main(String[] args) {
		Badges badges1 = new Badges();
		badges1.setBadgeName("Gold");
		badges1.setBadgeWeight(30);

		Badges badges2 = new Badges();
		badges2.setBadgeName("Silver");
		badges2.setBadgeWeight(20);

		Badges badges3 = new Badges();
		badges3.setBadgeName("Bronze");
		badges3.setBadgeWeight(10);

		Practice practice1 = new Practice();
		Practice practice2 = new Practice();
		Practice practice3 = new Practice();
		Practice practice4 = new Practice();
		Practice practice5 = new Practice();
		Practice practice6 = new Practice();
		Practice practice7 = new Practice();

		practice1.setPracticeName("JVM");
		practice2.setPracticeName("Grails");
		practice3.setPracticeName("Drupal");
		practice4.setPracticeName("DevOps");
		practice5.setPracticeName("Feen");
		practice6.setPracticeName("Mean");
		practice7.setPracticeName("Intern");

		Set<Practice> practiceSet1 = new HashSet<>();
		practiceSet1.add(practice1);
		practiceSet1.add(practice2);
		practiceSet1.add(practice3);
		practiceSet1.add(practice4);
		practiceSet1.add(practice5);
		practiceSet1.add(practice6);

		Set<Practice> practiceSet2 = new HashSet<Practice>();
		practiceSet2.add(practice7);

		Services services1 = new Services();
		Services services2 = new Services();

		services1.setServiceName("Technology");
		services1.setPratice(practiceSet1);

		services2.setServiceName("TTND-Intern");
		services2.setPratice(practiceSet2);

		Date date1 = new Date("10/09/1995");
		Date date2 = new Date("22/09/1995");

		Employee employee = new Employee("Sumit", "Sharma", date1, "sumit.ss454@gmail.com", "sumit", "male", services2,
				practice7, "Supervisor");

		Employee employee1 = new Employee("Akshay", "Sharma", date2, "ak@gmail.com", "ak", "male", services1, practice3,
				"Practice Head");

		

		Set<Badges> setBadges = new HashSet<>();
		setBadges.add(badges1);
		setBadges.add(badges2);
		setBadges.add(badges3);

		Map<String, List> map = new HashMap<>();
		// User (Default role) (3 Gold, 2 Silver, 1 Bronze)
		List<Integer> al1 = new ArrayList<>();
		al1.add(3);
		al1.add(2);
		al1.add(1);
		map.put("User", al1);

		// Supervisor (6 Gold, 3 Silver, 2 Bronze)
		List<Integer> al2 = new ArrayList<>();
		al2.add(6);
		al2.add(3);
		al2.add(2);
		map.put("Supervisor", al2);

		// Practice Head (9 Gold, 6 Silver, 3 Bronze)
		List<Integer> al3 = new ArrayList<>();
		al3.add(9);
		al3.add(6);
		al3.add(3);
		map.put("Practice Head", al3);

		Recognise recognise = new Recognise(employee, employee1, "you are good", "Extra Miler", badges1, new Date());

		Badges_Remaining badges_Remaining = new Badges_Remaining();
		badges_Remaining.setEid(employee);
		badges_Remaining.setBid(setBadges);
		badges_Remaining.setValue(map.get(employee.getRole()));

		Badges_Remaining badges_Remaining1 = new Badges_Remaining();
		badges_Remaining1.setEid(employee1);
		badges_Remaining1.setBid(setBadges);
		badges_Remaining1.setValue(map.get(employee1.getRole()));

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(practice1);
		session.save(practice2);
		session.save(practice3);
		session.save(practice4);
		session.save(practice5);
		session.save(practice6);
		session.save(practice7);

		session.save(services1);
		session.save(services2);

		session.save(employee);
		session.save(employee1);

		session.save(badges1);
		session.save(badges2);
		session.save(badges3);

		session.save(badges_Remaining);
		session.save(badges_Remaining1);
	    session.save(recognise);
		transaction.commit();
		session.close();
		factory.close();

	}

}
