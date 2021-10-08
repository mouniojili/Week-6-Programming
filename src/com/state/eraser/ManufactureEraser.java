package com.state.eraser;

import com.builder.eraser.EraserBuilder;
import com.builder.eraser.EraserProp;

public class ManufactureEraser {
	
	
	public static void main(String[] args) {
   
		//builder Pattern 
		EraserProp paperEraser = new EraserBuilder().setEraserBrand("Natraj").setEraserType("Paper Eraser").setPrice(5).build();
		EraserProp inkEraser = new EraserBuilder().setEraserBrand("Apsara").setEraserType("Ink Eraser").setPrice(15).build();

		System.out.println(paperEraser);
		System.out.println(inkEraser);
		
	//State Pattern to manufacture Eraser	
		Eraser eraser = new Eraser();
		eraser.InjectMoldProcess();
		eraser.screenPrintProcess();
		eraser.embossingProcess();
		eraser.packing();
		eraser.deliverProduct();
		
	}

}
