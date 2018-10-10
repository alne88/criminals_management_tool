import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = Config.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.close();
    }
}
