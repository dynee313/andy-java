package com.bakeryblueprint.modernjava.week01_jaehyun;

public class Apple {
    private String owner;
    private String color;
    private int weight;

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(owner).append(" : ").append(color).append(" : ").append(weight);
		return builder.toString();
	}
}