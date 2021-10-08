package com.state.eraser;

public class Eraser {
	
	EraserManufactureState injectionMolding;
	
	EraserManufactureState screenPrinting;
	
	EraserManufactureState embossing;
	
	EraserManufactureState packing;
	
	EraserManufactureState deliver;
	
	EraserManufactureState state;
	
	public Eraser() {
		
		injectionMolding = new InjectMolding(this);
		screenPrinting  = new ScreenPrinting(this);
		embossing = new Embossing(this);
		packing = new Packing(this);
		deliver = new Deliver(this);
		state=injectionMolding;		
		
	}

	//getters & setters
	public EraserManufactureState getInjectionMolding() {
		return injectionMolding;
	}

	public void setInjectionMolding(EraserManufactureState injectionMolding) {
		this.injectionMolding = injectionMolding;
	}

	public EraserManufactureState getScreenPrinting() {
		return screenPrinting;
	}

	public void setScreenPrinting(EraserManufactureState screenPrinting) {
		this.screenPrinting = screenPrinting;
	}

	public EraserManufactureState getEmbossing() {
		return embossing;
	}

	public void setEmbossing(EraserManufactureState embossing) {
		this.embossing = embossing;
	}

	public EraserManufactureState getState() {
		return state;
	}

	public void setState(EraserManufactureState state) {
		this.state = state;
	}
	

	public EraserManufactureState getPacking() {
		return packing;
	}

	public void setPacking(EraserManufactureState packing) {
		this.packing = packing;
	}

	public EraserManufactureState getDeliver() {
		return deliver;
	}

	public void setDeliver(EraserManufactureState deliver) {
		this.deliver = deliver;
	}

	//Methods 
	public void InjectMoldProcess() {
		state.injectionMolding();
	}
	
	public void screenPrintProcess() {
		state.screenPrinting();
	}
	
	public void embossingProcess() {
		state.Embossing();
	}
	
	public void packing() {
		state.packing();
	}
	
	public void deliverProduct() {
		state.deliver();
	}

}
