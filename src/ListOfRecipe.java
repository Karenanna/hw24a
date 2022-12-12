import java.util.HashSet;
import java.util.Set;

public class ListOfRecipe {
    private Set<Recipe> recipes;

    public void setRecipe(Set<Recipe> recipe) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.add(recipe);
    }
    public void remove(Recipe recipe) {
        recipes.remove(recipe);
    }
}

