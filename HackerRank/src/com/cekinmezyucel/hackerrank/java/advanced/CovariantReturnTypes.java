package com.cekinmezyucel.hackerrank.java.advanced;

class Flower {
	public String whats_Your_Name() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower {
	public String whats_Your_Name() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	public String whats_Your_Name() {
		return "Lily";
	}
}

class Lotus extends Flower {
	public String whats_Your_Name() {
		return "Lotus";
	}
}

class State {
	public Flower your_National_Flower() {
		return new Flower();
	}
}

class WestBengal extends State {
	public Jasmine your_National_Flower() {
		return new Jasmine();
	}
}

class Karnataka extends State {
	public Lotus your_National_Flower() {
		return new Lotus();
	}
}

class AndhraPradesh extends State {
	public Lily your_National_Flower() {
		return new Lily();
	}
}

public class CovariantReturnTypes {

}
