package com.builder.eraser;

public class EraserProp {
	
	private String eraserBrand;
	
	private String eraserType;
	
	private Integer price ;

	public EraserProp(String eraserBrand, String eraserType, Integer price) {
		super();
		this.eraserBrand = eraserBrand;
		this.eraserType = eraserType;
		this.price = price;
	}

	public String getEraserBrand() {
		return eraserBrand;
	}

	public void setEraserBrand(String eraserBrand) {
		this.eraserBrand = eraserBrand;
	}

	public String getEraserType() {
		return eraserType;
	}

	public void setEraserType(String eraserType) {
		this.eraserType = eraserType;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "EraserProp [eraserBrand=" + eraserBrand + ", eraserType=" + eraserType + ", price=" + price + "]";
	}
	
	

}
