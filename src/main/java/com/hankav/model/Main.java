package com.hankav.model;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.mail.internet.AddressException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hankav.dao.HibSessionFactory;

public class Main {

	public static void main(String[] args) throws ParseException, HibernateException, IOException, AddressException {
		
		/* create football sport */
		
		
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session =
		 * factory.openSession(); session.beginTransaction(); Sport sport = new Sport();
		 * sport.setName("football"); Market m1 = new Market();
		 * m1.setName("Full Time Result"); m1.setMylines(Arrays.asList("team1", "team2",
		 * "draw")); m1.setSport(sport); m1.setSublines(false); Market m2 = new
		 * Market(); m2.setName("Total Goals"); m2.setMylines(Arrays.asList("over",
		 * "under")); m2.setSport(sport); m2.setSublines(true); Market m3 = new
		 * Market(); m3.setName("Half Time Result");
		 * m3.setMylines(Arrays.asList("team1", "team2", "draw")); m3.setSport(sport);
		 * m3.setSublines(false); Market m4 = new Market();
		 * m4.setName("1st Half Goals"); m4.setMylines(Arrays.asList("over", "under"));
		 * m4.setSport(sport); m4.setSublines(true); Market m5 = new Market();
		 * m5.setName("Handicap Goals"); m5.setMylines(Arrays.asList("team1", "team2"));
		 * m5.setSport(sport); m5.setSublines(true);
		 * 
		 * Market m6 = new Market(); m6.setName("1st Half Score");
		 * m6.setMylines(Arrays.asList("0-0", "0-1", "0-2", "1-0", "2-0", "1-1", "1-2",
		 * "2-1", "2-2")); m6.setSport(sport); m6.setSublines(false);
		 * 
		 * Market m7 = new Market(); m7.setName("Full Time Score");
		 * m7.setMylines(Arrays.asList("0-0", "0-1", "0-2", "1-0", "2-0", "1-1", "1-2",
		 * "2-1", "2-2", "1-3", "3-1", "3-3", "0-3", "3-0", "2-3", "3-2"));
		 * m7.setSport(sport); m7.setSublines(false); Market m8 = new Market();
		 * m8.setName("Double Chance"); m8.setMylines(Arrays.asList("1x", "2x", "12"));
		 * m8.setSport(sport); m8.setSublines(false);
		 * 
		 * Market m9 = new Market(); m9.setName("Both Teams To Score");
		 * m9.setMylines(Arrays.asList("yes", "no")); m9.setSport(sport);
		 * m9.setSublines(false);
		 * 
		 * Set<Market> markets = new LinkedHashSet<>(); markets.add(m1);
		 * markets.add(m2); markets.add(m3); markets.add(m4); markets.add(m5);
		 * markets.add(m6); markets.add(m7); markets.add(m8); markets.add(m9);
		 * sport.setMarkets(markets); session.save(m1); session.save(m2);
		 * session.save(m3); session.save(m4); session.save(m5); session.save(m6);
		 * session.save(m7); session.save(m8); session.save(m9); session.save(sport);
		 * session.getTransaction().commit(); session.close();
		 */
		 
		
		/*end of create football sport */
		
		
		
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session
		 * =factory.openSession(); session.beginTransaction(); Sport sport = new
		 * Sport(); sport.setName("tennis"); Market m1 = new Market();
		 * m1.setName("Set Betting"); m1.setMylines(Arrays.asList("2-0",
		 * "2-1","0-2","1-2","3-0","3-1","3-2","0-3","1-3","2-3")); m1.setSport(sport);
		 * m1.setSublines(false); Market m2 = new Market();
		 * m2.setName("First Set Winner");
		 * m2.setMylines(Arrays.asList("team1","team2")); m2.setSport(sport);
		 * m2.setSublines(false); Market m3 = new Market(); m3.setName("Total Sets");
		 * m3.setMylines(Arrays.asList("Over","Under")); m3.setSport(sport);
		 * m3.setSublines(true); Market m4 = new Market();
		 * m4.setName("1st Set Total Games");
		 * m4.setMylines(Arrays.asList("Under","Over")); m4.setSport(sport);
		 * m4.setSublines(true); Market m5 = new Market(); m5.setName("Handicap Games");
		 * m5.setMylines(Arrays.asList("team1", "team2")); m5.setSport(sport);
		 * m5.setSublines(true); Market m6 = new Market();
		 * m6.setName("To Win the Match");
		 * m6.setMylines(Arrays.asList("team1","team2")); m6.setSport(sport);
		 * m6.setSublines(false); Market m7 = new Market(); m7.setName("Total Games");
		 * m7.setMylines(Arrays.asList("Over","Under")); m7.setSport(sport);
		 * m7.setSublines(true); Set<Market> markets = new LinkedHashSet<>();
		 * markets.add(m6); markets.add(m2); markets.add(m1); markets.add(m3);
		 * markets.add(m4); markets.add(m5); markets.add(m7); sport.setMarkets(markets);
		 * session.save(m6); session.save(m2); session.save(m1); session.save(m3);
		 * session.save(m4); session.save(m5); session.save(m7); session.save(sport);
		 * session.getTransaction().commit(); session.close();
		 */
		
		
		
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session =
		 * factory.openSession(); session.beginTransaction(); Sport sport = new Sport();
		 * sport.setName("cricket"); Market m1 = new Market();
		 * m1.setName("To Win The Match");
		 * m1.setMylines(Arrays.asList("team1","team2")); m1.setSport(sport);
		 * m1.setSublines(false); Market m2 = new Market();
		 * m2.setName("First Wicket Method");
		 * m2.setMylines(Arrays.asList("Caught","Bowled","LBW","Run Out","Stumped"));
		 * m2.setSport(sport); m2.setSublines(false); Market m3 = new Market();
		 * m3.setName("1st Over Total Runs");
		 * m3.setMylines(Arrays.asList("Over","Under")); m3.setSport(sport);
		 * m3.setSublines(true); Market m4 = new Market();
		 * m4.setName("Total Runs in Match"); m4.setMylines(Arrays.asList("Under",
		 * "Over")); m4.setSport(sport); m4.setSublines(true); Market m5 = new Market();
		 * m5.setName("Total Match Sixes"); m5.setMylines(Arrays.asList("Over",
		 * "Under")); m5.setSport(sport); m5.setSublines(true);
		 * 
		 * Market m6 = new Market(); m6.setName("Highest 1st 15 Overs Score");
		 * m6.setMylines(Arrays.asList("team1","team2")); m6.setSport(sport);
		 * m6.setSublines(false);
		 * 
		 * Market m7 = new Market(); m7.setName("A Hundred To Be Scored In Match");
		 * m7.setMylines(Arrays.asList("Yes","No")); m7.setSport(sport);
		 * m7.setSublines(false);
		 * 
		 * Market m8 = new Market(); m8.setName("Fall Of 1st Wicket");
		 * m8.setMylines(Arrays.asList("Under","Over")); m8.setSport(sport);
		 * m8.setSublines(true); Set<Market> markets = new LinkedHashSet<>();
		 * markets.add(m6); markets.add(m2); markets.add(m1); markets.add(m3);
		 * markets.add(m4); markets.add(m5); markets.add(m7); markets.add(m8);
		 * sport.setMarkets(markets); session.save(m6); session.save(m2);
		 * session.save(m1); session.save(m3); session.save(m4); session.save(m5);
		 * session.save(m7); session.save(m8); session.save(sport);
		 * session.getTransaction().commit(); session.close();
		 */
		
		
		
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session =
		 * factory.openSession(); session.beginTransaction(); Sport sport = new Sport();
		 * sport.setName("basketball"); Market m1 = new Market();
		 * m1.setName("Money Line"); m1.setMylines(Arrays.asList("team1","team2"));
		 * m1.setSport(sport); m1.setSublines(false); Market m2 = new Market();
		 * m2.setName("Total"); m2.setMylines(Arrays.asList("Over","Under"));
		 * m2.setSport(sport); m2.setSublines(true); Market m3 = new Market();
		 * m3.setName("Spread"); m3.setMylines(Arrays.asList("team1","team2"));
		 * m3.setSport(sport); m3.setSublines(true); Market m4 = new Market();
		 * m4.setName("1st Half Money Line"); m4.setMylines(Arrays.asList("team1",
		 * "team2")); m4.setSport(sport); m4.setSublines(false); Market m5 = new
		 * Market(); m5.setName("1st Half Total"); m5.setMylines(Arrays.asList("Over",
		 * "Under")); m5.setSport(sport); m5.setSublines(true);
		 * 
		 * Market m6 = new Market(); m6.setName("1st Half Spread");
		 * m6.setMylines(Arrays.asList("team1","team2")); m6.setSport(sport);
		 * m6.setSublines(true);
		 * 
		 * Market m7 = new Market(); m7.setName("1st Quarter Money Line");
		 * m7.setMylines(Arrays.asList("team1","team2")); m7.setSport(sport);
		 * m7.setSublines(false);
		 * 
		 * Market m8 = new Market(); m8.setName("1st Quarter Total");
		 * m8.setMylines(Arrays.asList("Under","Over")); m8.setSport(sport);
		 * m8.setSublines(true); Market m9 = new Market();
		 * m9.setName("1st Quarter Spread");
		 * m9.setMylines(Arrays.asList("team1","team2")); m9.setSport(sport);
		 * m9.setSublines(true); Set<Market> markets = new LinkedHashSet<>();
		 * markets.add(m6); markets.add(m2); markets.add(m1); markets.add(m3);
		 * markets.add(m4); markets.add(m5); markets.add(m7); markets.add(m8);
		 * markets.add(m9); sport.setMarkets(markets); session.save(m6);
		 * session.save(m2); session.save(m1); session.save(m3); session.save(m4);
		 * session.save(m5); session.save(m7); session.save(m8); session.save(m9);
		 * session.save(sport); session.getTransaction().commit(); session.close();
		 */
		 
		
		
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session =
		 * factory.openSession(); session.beginTransaction(); Sport sport = new Sport();
		 * sport.setName("hockey"); Market m1 = new Market(); m1.setName("Money Line");
		 * m1.setMylines(Arrays.asList("team1","team2")); m1.setSport(sport);
		 * m1.setSublines(false); Market m2 = new Market(); m2.setName("Total");
		 * m2.setMylines(Arrays.asList("Over","Under")); m2.setSport(sport);
		 * m2.setSublines(true); Market m3 = new Market(); m3.setName("Handicap");
		 * m3.setMylines(Arrays.asList("team1","team2")); m3.setSport(sport);
		 * m3.setSublines(true); Market m4 = new Market();
		 * m4.setName("First Period Money Line"); m4.setMylines(Arrays.asList("team1",
		 * "team2")); m4.setSport(sport); m4.setSublines(false); Market m5 = new
		 * Market(); m5.setName("First Period Total");
		 * m5.setMylines(Arrays.asList("Over", "Under")); m5.setSport(sport);
		 * m5.setSublines(true);
		 * 
		 * 
		 * Market m6 = new Market(); m6.setName("First 10 Minute Money Line");
		 * m6.setMylines(Arrays.asList("team1","team2")); m6.setSport(sport);
		 * m6.setSublines(false);
		 * 
		 * Market m7 = new Market(); m7.setName("First 10 Minute Total");
		 * m7.setMylines(Arrays.asList("Under","Over")); m7.setSport(sport);
		 * m7.setSublines(true); Set<Market> markets = new LinkedHashSet<>();
		 * markets.add(m6); markets.add(m2); markets.add(m1); markets.add(m3);
		 * markets.add(m4); markets.add(m5); markets.add(m7); sport.setMarkets(markets);
		 * session.save(m6); session.save(m2); session.save(m1); session.save(m3);
		 * session.save(m4); session.save(m5); session.save(m7); session.save(sport);
		 * session.getTransaction().commit(); session.close();
		 */
		  
		  
		  
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session =
		 * factory.openSession(); session.beginTransaction(); Sport sport = new Sport();
		 * sport.setName("american football"); Market m1 = new Market();
		 * m1.setName("Money Line"); m1.setMylines(Arrays.asList("team1","team2"));
		 * m1.setSport(sport); m1.setSublines(false); Market m2 = new Market();
		 * m2.setName("Total"); m2.setMylines(Arrays.asList("Over","Under"));
		 * m2.setSport(sport); m2.setSublines(true); Market m3 = new Market();
		 * m3.setName("Spread"); m3.setMylines(Arrays.asList("team1","team2"));
		 * m3.setSport(sport); m3.setSublines(true); Market m4 = new Market();
		 * m4.setName("First Half Money Line"); m4.setMylines(Arrays.asList("team1",
		 * "team2")); m4.setSport(sport); m4.setSublines(false); Market m5 = new
		 * Market(); m5.setName("First Half Total"); m5.setMylines(Arrays.asList("Over",
		 * "Under")); m5.setSport(sport); m5.setSublines(true);
		 * 
		 * Market m6 = new Market(); m6.setName("First Half Spread");
		 * m6.setMylines(Arrays.asList("team1","team2")); m6.setSport(sport);
		 * m6.setSublines(true);
		 * 
		 * Market m7 = new Market(); m7.setName("First Quarter Money Line");
		 * m7.setMylines(Arrays.asList("team1","team2")); m7.setSport(sport);
		 * m7.setSublines(false);
		 * 
		 * Market m8 = new Market(); m8.setName("First Quarter Total");
		 * m8.setMylines(Arrays.asList("Under","Over")); m8.setSport(sport);
		 * m8.setSublines(true); Market m9 = new Market();
		 * m9.setName("First Quarter Spread");
		 * m9.setMylines(Arrays.asList("team1","team2")); m9.setSport(sport);
		 * m9.setSublines(true); Set<Market> markets = new LinkedHashSet<>();
		 * markets.add(m6); markets.add(m2); markets.add(m1); markets.add(m3);
		 * markets.add(m4); markets.add(m5); markets.add(m7); markets.add(m8);
		 * markets.add(m9); sport.setMarkets(markets); session.save(m6);
		 * session.save(m2); session.save(m1); session.save(m3); session.save(m4);
		 * session.save(m5); session.save(m7); session.save(m8); session.save(m9);
		 * session.save(sport); session.getTransaction().commit(); session.close();
		 */
			  
			  
			  
			  
		/*
		 * SessionFactory factory = HibSessionFactory.getFactory(); Session session =
		 * factory.openSession(); session.beginTransaction(); Sport sport = new Sport();
		 * sport.setName("mma"); Market m1 = new Market(); m1.setName("To Win Fight");
		 * m1.setMylines(Arrays.asList("team1","team2")); m1.setSport(sport);
		 * m1.setSublines(false); Market m2 = new Market(); m2.setName("Total Rounds");
		 * m2.setMylines(Arrays.asList("Over","Under")); m2.setSport(sport);
		 * m2.setSublines(true); Market m3 = new Market();
		 * m3.setName("Will Fight Go The Distance");
		 * m3.setMylines(Arrays.asList("Yes","No")); m3.setSport(sport);
		 * m3.setSublines(false);
		 * 
		 * Set<Market> markets = new LinkedHashSet<>(); markets.add(m2);
		 * markets.add(m1); markets.add(m3); sport.setMarkets(markets);
		 * session.save(m2); session.save(m1); session.save(m3); session.save(sport);
		 * session.getTransaction().commit(); session.close();
		 */
				 
			 
		 
		
		 
		 
		

	}

}
