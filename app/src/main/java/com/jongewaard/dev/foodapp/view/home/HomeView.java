package com.jongewaard.dev.foodapp.view.home;

import com.jongewaard.dev.foodapp.model.Categories;
import com.jongewaard.dev.foodapp.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
