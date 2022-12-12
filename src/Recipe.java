import java.util.Objects;

public class Recipe {
    private String name;

    private int listOfRecipe;

    private int totalCost;

    public Recipe(String name, int listOfRecipe, int totalCost) {
        setName(name);
        setListOfRecipe(listOfRecipe);
        setTotalCost(totalCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getListOfRecipe() {
        return listOfRecipe;
    }

    public void setListOfRecipe(int listOfRecipe) {
        this.listOfRecipe = listOfRecipe;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
