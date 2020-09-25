package br.edu.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUtil {
	private static JPAUtil instance;
	private final String PERSISTENCE_UNIT = "PU_recliclagem";
	private ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<EntityManager>();
	private EntityManagerFactory entityManagerFactory;

	private JPAUtil() {
	}

	public static JPAUtil getInstance() {
		if (instance == null) {
			instance = new JPAUtil();
		}
		return instance;
	}

	public EntityManager getEntityManager() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		}
		EntityManager entityManager = threadEntityManager.get();

		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = entityManagerFactory.createEntityManager();
			this.threadEntityManager.set(entityManager);
		}
		return entityManager;
	}

	public void closeEntityManager() {
		EntityManager em = threadEntityManager.get();
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			if (transaction.isActive()) {
				transaction.commit();
			}
			em.close();
			threadEntityManager.set(null);
		}
	}

	public void closeEntityManagerFactory() {
		closeEntityManager();
		entityManagerFactory.close();
	}

}
