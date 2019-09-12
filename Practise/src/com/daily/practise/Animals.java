package com.daily.practise;
/**
 * This class shows setters and getters implementation of enum
 * @author gv
 *
 */

public class Animals implements Comparable<Animals> {

	int age;
	int height;
	int weight;
	String color;
	String species;
	String animalName;

	public Animals(int age, int height, int weight, String color, String species, String animalName, dietType val,
			gender sex) {

		this.age = age;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.species = species;
		this.animalName = animalName;
		this.food = val;
		this.sex = sex;
	}

	private dietType food = dietType.herbivorous;

	public enum dietType {
		herbivorous, carnivorous, omnivorus;

	}

	public dietType getDietType() {
		return this.food;
	}

	public void setDiet(dietType diet) {
		this.food = diet;
	}

	private gender sex = gender.female;

	public enum gender {
		male, female;

	}

	public gender getSex() {
		return this.sex;
	}

	public void setGender(gender sex) {
		this.sex = sex;
	}

	public void eat() {

		switch (food) {
		case herbivorous:
			System.out.println(this.animalName + " " + "Eats grass");
			break;
		case carnivorous:
			System.out.println(this.animalName + " " + "Eats meat");
			break;
		case omnivorus:
			System.out.println(this.animalName + " " + "Eats all");
			break;
		default:
			System.out.println(this.animalName + " " + "Eats all!!");
		}

	}

	public void fight(Animals comp1, Animals comp2) {
		String outCome = "";
		if (comp1.compareTo(comp2) == 0) {
			outCome = "draw";
		} else if (comp1.compareTo(comp2) == 1) {
			outCome = comp1.animalName + " " + "of Gender" + " " + comp1.getSex() + " " + "Wins over" + " "
					+ comp2.animalName + " " + "of Gender" + " " + comp2.getSex();
		} else if (comp1.compareTo(comp2) == -1) {
			outCome = comp1.animalName + " " + "of Gender" + " " + comp1.getSex() + " " + "loses over" + " "
					+ comp2.animalName + " " + "of Gender" + " " + comp2.getSex();
		}
		System.out.println("Outcome of fight is" + " " + "" + outCome);
	}

	public boolean mate(Animals comp) {
		if (this.animalName.equalsIgnoreCase(comp.animalName)) {
			if (this.getSex().equals(comp.getSex())) {
				System.out.println(this.animalName + " " + "of Gender " + this.getSex() + " " + " "
						+ "cannot mate with" + " " + comp.animalName + " " + "of Gender" + " " + comp.getSex());
				return false;
			} else {
				System.out.println(this.animalName + " " + "of Gender " + this.getSex() + " " + " " + "can mate with"
						+ " " + comp.animalName + " " + "of Gender" + " " + comp.getSex());
				return true;
			}
		} else {
			System.out.println(this.animalName + " " + "of Gender " + this.getSex() + " " + " " + "cannot mate with"
					+ " " + comp.animalName + " " + "of Gender" + " " + comp.getSex() + " "
					+ "as they are different animal sub-species");
			return false;
		}
	}

	public int compareTo(Animals obj) {
		int isWinner = 10;
		if ((this.height == obj.height) && (this.weight == obj.weight)) {
			isWinner = 0;
		} else if ((this.height > obj.height) && (this.weight > obj.weight)) {
			isWinner = 1;
		} else if ((this.height < obj.height) && (this.weight < obj.weight)) {
			isWinner = -1;
		}
		return isWinner;
	}

	public static void main(String[] args) {

		Animals obj1 = new Animals(5, 1, 10, "brown", "mammal", "Monkey", dietType.omnivorus, gender.male);
		Animals obj2 = new Animals(7, 2, 20, "brown", "mammal", "Monkey", dietType.omnivorus, gender.female);
		Animals obj3 = new Animals(7, 6, 320, "brown", "mammal", "Horse", dietType.herbivorous, gender.male);
		obj1.eat();
		obj2.eat();
		obj1.mate(obj2);
		obj1.fight(obj1, obj2);
		obj3.eat();
		obj2.mate(obj3);
		obj2.fight(obj2, obj3);
	}

}
