package com.jongewaard.dev.foodapp.view.detail;

import java.util.List;

public interface DetailView {
    //TODO #4 Add void method  for showLoading, hideLoading, setMeal, onErrorLoading;
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meals);

    void setMeal(Meals.Meal meal);

    void onErrorLoading(String message);
}
