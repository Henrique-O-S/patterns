import java.util.ArrayList;

public class SmartStrategy implements OrderingStrategy{
    private ArrayList<StringDrink> drinks = new ArrayList<StringDrink>();
    private ArrayList<StringRecipe> recipes = new ArrayList<StringRecipe>();
    private ArrayList<StringBar> bars = new ArrayList<StringBar>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        drinks.add(drink);
        recipes.add(recipe);
        bars.add(bar);
        if(bar.isHappyHour())
            happyHourStarted(bar);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (int i = 0; i < drinks.size(); i++)
            bars.get(i).order(drinks.get(i), recipes.get(i));
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
