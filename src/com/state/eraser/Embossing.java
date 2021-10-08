package com.state.eraser;

public class Embossing implements EraserManufactureState {

	Eraser eraser;
	
	public Embossing(Eraser eraser) {
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
      System.out.println("Screen Printing process completed ");
     
	}

	@Override
	public void Embossing() {
		// TODO Auto-generated method stub
      System.out.println("Embossing is in process, once its done we can dispatch");
      eraser.setState(eraser.getEmbossing());
	}

	@Override
	public void packing() {
		// TODO Auto-generated method stub
		System.out.println("Packing will happen once embossing is completed ");
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Deliver the eraser after packing ");
	}

}
