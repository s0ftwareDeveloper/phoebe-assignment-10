package coderscampus.phoebe_assignment_10.spoonacular.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {

    @JsonProperty("meals")
    private Meal[] meals;

    @JsonProperty("nutrients")
    private Nutrients nutrients;

    public Meal[] getMeals() {
        return meals;
    }

    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }
}
