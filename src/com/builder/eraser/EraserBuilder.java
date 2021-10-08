package com.builder.eraser;

public class EraserBuilder {
	
	private String eraserBrand;
	
	private String eraserType;
	
	private Integer price ;

	public EraserBuilder setEraserBrand(String eraserBrand) {
		this.eraserBrand = eraserBrand;
		return this;
	}

	public EraserBuilder setEraserType(String eraserType) {
		this.eraserType = eraserType;
		return this;

	}

	public EraserBuilder setPrice(Integer price) {
		this.price = price;
		return this;

	}

	public EraserProp build() {
		return new EraserProp(eraserBrand, eraserType, price);
	}
   
}
