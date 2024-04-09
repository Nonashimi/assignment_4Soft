package Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector();
        NutritionPlanBuilder builder = new WeightLossNutritionPlanBuilder();
        director.setBuilder(builder);
        director.constructNutritionPlan();
        NutritionPlan nutritionPlan = builder.getNutritionPlan();
        nutritionPlan.setCaloricIntake(1500);
        nutritionPlan.setCarbohydratesRatio(50);
        nutritionPlan.setProteinsRatio(30);
        nutritionPlan.setFatsRatio(20);
        nutritionPlan.setMealPlans(Arrays.asList("Завтрак: Омлет с овощами", "Обед: Греческий салат", "Ужин: Куриный грудка с овощами"));
        nutritionPlan.setFitnessGoal("Похудение");
        nutritionPlan.setDietaryRestrictions(Arrays.asList("Безглютеновая", "Веган"));

        System.out.println("План питания для похудения:");
        System.out.println("Калорийный прием: " + nutritionPlan.getCaloricIntake());
        System.out.println("Соотношение макронутриентов (г):");
        System.out.println("Углеводы: " + nutritionPlan.getCarbohydratesRatio());
        System.out.println("Белки: " + nutritionPlan.getProteinsRatio());
        System.out.println("Жиры: " + nutritionPlan.getFatsRatio());
        System.out.println("Меню:");
        for (String meal : nutritionPlan.getMealPlans()) {
            System.out.println("- " + meal);
        }
        System.out.println("Цель фитнеса: " + nutritionPlan.getFitnessGoal());
        System.out.println("Диетические ограничения: " + Arrays.toString(nutritionPlan.getDietaryRestrictions().toArray()));
    }
}
