package com.state.eraser;

public class Packing implements EraserManufactureState {

	Eraser eraser;
	
	
	public Packing(Eraser eraser) {
		super();
		this.eraser = eraser;
	}

	@Override
	public void injectionMolding() {
		// TODO Auto-generated method stub
        System.out.println("Inject Molding is completed ");
	}

	@Override
	public void screenPrinting() {
		// TODO Auto-generated method stub
        System.out.println("screenPrinting is  completed ");

	}

	@Override
	public void Embossing() {
		// TODO Auto-generated method stub
        System.out.println("Embossing is  completed ");

	}

	@Override
	public void packing() {
		// TODO Auto-generated method stub
       System.out.println("Start Packing ");
       eraser.setState(eraser.getPacking());
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		 System.out.println("When Packing done, ready to deliver ");
	}

}
