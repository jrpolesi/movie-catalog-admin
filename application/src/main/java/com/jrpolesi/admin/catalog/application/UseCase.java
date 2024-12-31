package com.jrpolesi.admin.catalog.application;

import com.jrpolesi.admin.catalog.domain.category.Category;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UseCase {
    public Category execute() {
        return Category.newCategory("name", "description", true);
    }
}