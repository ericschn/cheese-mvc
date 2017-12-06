package org.launchcode.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Eric Schneider via LaunchCode
 */
public class Cheese {

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message="description must not be empty.")
    private String description;

    @NotNull
    private CheeseType type;

    private int cheeseId;
    private static int nextId = 1;

    public Cheese(String name, String description) {
        this();    // calls default constructor
        this.name = name;
        this.description = description;
    }

    // Default constructor
    public Cheese() {
        cheeseId = nextId;
        nextId++;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
}
