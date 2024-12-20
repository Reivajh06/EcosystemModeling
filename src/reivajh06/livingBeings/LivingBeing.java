package reivajh06.livingBeings;

import java.util.List;

public abstract class LivingBeing {

	protected String name;
	protected String scientificName;
	protected Gender gender;
	protected Diet diet;
	protected Reproduction reproduction;
	protected float hunger;
	protected float thirst;

	public String name() {
		return name;
	}

	public LivingBeing name(String name) {
		this.name = name;
		return this;
	}

	public String scientificName() {
		return scientificName;
	}

	public LivingBeing scientificName(String scientificName) {
		this.scientificName = scientificName;
		return this;
	}

	public Gender gender() {
		return gender;
	}

	public LivingBeing gender(Gender gender) {
		this.gender = gender;
		return this;
	}

	public Diet diet() {
		return diet;
	}

	public LivingBeing diet(Diet diet) {
		this.diet = diet;
		return this;
	}

	public Reproduction reproduction() {
		return reproduction;
	}

	public LivingBeing reproduction(Reproduction reproduction) {
		this.reproduction = reproduction;
		return this;
	}

	public float hunger() {
		return hunger;
	}

	public LivingBeing hunger(float hunger) {
		this.hunger = hunger;
		return this;
	}

	public float thirst() {
		return thirst;
	}

	public LivingBeing thirst(float thirst) {
		this.thirst = thirst;
		return this;
	}

	public String eat() {

	}
}
