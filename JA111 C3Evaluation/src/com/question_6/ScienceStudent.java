package com.question_6;

public class ScienceStudent implements Student{
	
	private int maths;
	private int chemistry;
	private int physics;
	private int biology;
	
	public ScienceStudent() {
		// TODO Auto-generated constructor stub
	}

	public ScienceStudent(int maths, int chemistry, int physics, int biology) {
		super();
		this.maths = maths;
		this.chemistry = chemistry;
		this.physics = physics;
		this.biology = biology;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}


	@Override
	public double findPercentage() {
		int total = biology+chemistry+maths+physics;
		return total/4;
	}
    

}
