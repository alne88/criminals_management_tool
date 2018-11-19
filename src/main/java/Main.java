import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = Config.getSessionFactory();
        Session session = sessionFactory.openSession();

//        Transaction transaction = session.beginTransaction();
//
//        Prisoners prisoners = new Prisoners();
//        prisoners.setName("Vitya");
//        prisoners.setCellNumber(1);
//        prisoners.setAlias("Vitya");
//
//        FinalMeal finalMeal = new FinalMeal();
//        finalMeal.setVegan(true);
//        finalMeal.setName("Nomm");
//        finalMeal.setDessert(true);
//        finalMeal.setCalories(10d);
//        finalMeal.setPrice(150);
//        Set<FinalMeal> meals = new HashSet<>();
//        meals.add(finalMeal);
//        prisoners.setMeals(meals);
//
//        session.persist(finalMeal);
//        session.persist(prisoners);
//
//        transaction.commit();


        Prisoners findPrisoner = session.find(Prisoners.class, 2L);

        Set<FinalMeal> finalMeal = findPrisoner.getMeals();

        for (FinalMeal meal: finalMeal) {
            System.out.println(findPrisoner.getName() + " - " + meal.getName());
        }

        session.close();
        sessionFactory.close();
    }
}
