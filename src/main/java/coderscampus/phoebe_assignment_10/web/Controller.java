package coderscampus.phoebe_assignment_10.web;

import coderscampus.phoebe_assignment_10.spoonacular.DTO.DayResponse;
import coderscampus.phoebe_assignment_10.spoonacular.DTO.WeekResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class Controller {

    @Value("${spoonacular.urls.base}")
    private String urlBase;
    @Value("${spoonacular.urls.mealplan}")
    private String urlMealPlan;
    @Value("${user.apikey}")
    private String apiKey;

    private URI generateURI(String timeFrame, String numCalories, String diet, String exclusions) {
        return UriComponentsBuilder.fromHttpUrl(urlBase + urlMealPlan)
                                   .queryParam("timeFrame", timeFrame)
                                   .queryParam("targetCalories", numCalories)
                                   .queryParam("diet", diet)
                                   .queryParam("exclude", exclusions)
                                   .queryParam("apiKey", apiKey)
                                   .build()
                                   .toUri();
    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {

        RestTemplate rt = new RestTemplate();

        URI uri = generateURI("week", numCalories, diet, exclusions);

        return rt.getForEntity(uri, WeekResponse.class);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {

        RestTemplate rt = new RestTemplate();

        URI uri = generateURI("day", numCalories, diet, exclusions);

        return rt.getForEntity(uri, DayResponse.class);
    }
}
