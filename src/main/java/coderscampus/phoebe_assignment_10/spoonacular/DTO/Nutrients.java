package coderscampus.phoebe_assignment_10.spoonacular.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

    @JsonProperty("calories")
    private Double calories;

    @JsonProperty("carbohydrates")
    private Double carbs;

    @JsonProperty("fat")
    private Double fat;

    @JsonProperty("protein")
    private Double protein;

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }
}
