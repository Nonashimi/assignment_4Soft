package Ex1;

import java.util.List;

class NutritionPlan {
    private int caloricIntake;
    private int carbohydratesRatio;
    private int proteinsRatio;
    private int fatsRatio;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;
    void setCaloricIntake(int calorInteke){
        this.caloricIntake =calorInteke;
    }
    void setCarbohydratesRatio(int carbohydratesRatio){
        this.carbohydratesRatio = carbohydratesRatio;
    }
    void setProteinsRatio(int proteinsRatio){
        this.proteinsRatio = proteinsRatio;
    }
    void setFatsRatio(int fatsRatio){
        this.fatsRatio = fatsRatio;
    }
    void setMealPlans(List<String> mealPlans){
        this.mealPlans = mealPlans;
    }
    void setFitnessGoal(String fitnessGoal){
        this.fitnessGoal = fitnessGoal;
    }
    void setDietaryRestrictions(List<String> dietaryRestrictions){
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getCaloricIntake() {
        return caloricIntake;
    }

    public int getFatsRatio() {
        return fatsRatio;
    }

    public int getCarbohydratesRatio() {
        return carbohydratesRatio;
    }

    public int getProteinsRatio() {
        return proteinsRatio;
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }
}

abstract class NutritionPlanBuilder {
    protected NutritionPlan nutritionPlan;
    public abstract void setCaloricIntake(int caloricIntake);
    public abstract void setMacronutrientRatios(int carbohydratesRatio, int proteinsRatio, int fatsRatio);
    public abstract void setMealPlans(List<String> mealPlans);
    public abstract void setFitnessGoal(String fitnessGoal);
    public abstract void setDietaryRestrictions(List<String> dietaryRestrictions);

    public abstract NutritionPlan build();

    public NutritionPlan getNutritionPlan() {
        return nutritionPlan;
    }


}

class NutritionPlanDirector {
    private NutritionPlanBuilder builder;

    public void setBuilder(NutritionPlanBuilder builder) {
        this.builder = builder;
    }
    public NutritionPlan constructNutritionPlan() {
        return builder.nutritionPlan;
    }
}

class WeightLossNutritionPlanBuilder extends NutritionPlanBuilder {
    public WeightLossNutritionPlanBuilder() {
        this.nutritionPlan = new NutritionPlan();
    }

    @Override
    public void setCaloricIntake(int caloricIntake) {
         nutritionPlan.setCaloricIntake(caloricIntake);
    }

    @Override
    public void setMacronutrientRatios(int carbohydratesRatio, int proteinsRatio, int fatsRatio) {
        nutritionPlan.setCarbohydratesRatio(carbohydratesRatio);
        nutritionPlan.setProteinsRatio(proteinsRatio);
        nutritionPlan.setFatsRatio(fatsRatio);
    }

    @Override
    public void setMealPlans(List<String> mealPlans) {
        nutritionPlan.setMealPlans(mealPlans);
    }

    @Override
    public void setFitnessGoal(String fitnessGoal) {
        nutritionPlan.setFitnessGoal(fitnessGoal);
    }

    @Override
    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        nutritionPlan.setDietaryRestrictions(dietaryRestrictions);
    }

    @Override
    public NutritionPlan build() {
        return nutritionPlan;
    }

}



