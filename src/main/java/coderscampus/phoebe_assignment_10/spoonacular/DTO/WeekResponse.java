package coderscampus.phoebe_assignment_10.spoonacular.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
    @JsonProperty("week")
    private Week week;

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }
}
