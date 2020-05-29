import meal.HamburgerMeal;
import meal.Meal;
import meal.TacoMeal;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal = new HamburgerMeal();
        meal.doMeal();

        System.out.println();

        Meal meal1 = new TacoMeal();
        meal1.doMeal();
    }
}
