package org.guyzilla.hibernate.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.guyzilla.domain.Member;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MemberDao {
	private static SessionFactory factory;
	private final static Logger LOGGER = Logger.getLogger(MemberDao.class
			.getName());
	private static Session session;

	public MemberDao() {
		LOGGER.setLevel(Level.INFO);

	}

	public Member findById(Long id) {
		Session session = null;
		Member Member = null; 
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Member = (Member) session.get(Member.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}
		return Member;
	}

	public Member authenticate(String username, String password) {

		Session session = null;
		Member user = null;

		try { 
			session = HibernateUtil.openSession();
			System.out.println (session.isOpen());
			session.beginTransaction();

			Query q = session
					.createQuery(" from Member where username = :username and password = :password");
			q.setString("username", username);
			q.setString("password", password);

			List result = q.list();
			if (result.size() > 0)
				user = (Member) result.get(0);
			session.getTransaction().commit();
		}  catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}

		return user;
	}

	public List listMembers() {
		LOGGER.setLevel(Level.INFO);
		List<Member> list = new ArrayList<Member>();
		Session session = null;
		Member user = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();

			list = session.createQuery("FROM Member").list();
			session.getTransaction().commit();
		}  catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}
		return list;
	}

	/* Method to INSERT Member */
	public Long addMember(Member obj) {
		
		Long key = null;
		Session session = null;
		Member user = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			key = (Long) session.save(obj);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}
		return key;
	}

	/* Method to UPDATE Member */
	public void updateMember(Member obj) {
		Session session = null;
		Member user = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.update(obj);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}
	}

	/* Method to DELETE Member */
	public void deleteMember(Long key) {
		Session session = null;
		Member user = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Member obj = (Member) session.get(Member.class, key);
			session.delete(obj);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}
	}

}
