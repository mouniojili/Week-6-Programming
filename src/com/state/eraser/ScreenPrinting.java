package com.state.eraser;

public class ScreenPrinting implements EraserManufactureState {

	Eraser eraser;
	
	
	public ScreenPrinting(Eraser eraser) {
		super();
		this.eraser = eraser;
	}

	@Override
	public void injectionMolding() {
		// TODO Auto-generated method stub
	       System.out.println("Injection molding in process completed ");
	}

	@Override
	public void screenPrinting() {
		// TODO Auto-generated method stub
       System.out.println("Screenprinting in process ");
       eraser.setState(eraser.getScreenPrinting());
	}

	@Override
	public void Embossing() {
		// TODO Auto-generated method stub
       System.out.println("ScreenPrinting is in process, once its done embossing is done");
	}

	@Override
	public void packing() {
		// TODO Auto-generated method stub
		System.out.println("After embossing we can pack ");
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Not ready to deliver ");
	}

}
