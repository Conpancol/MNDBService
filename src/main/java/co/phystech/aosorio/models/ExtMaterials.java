/**
 * 
 */
package co.phystech.aosorio.models;

import org.mongodb.morphia.annotations.Embedded;

/**
 * @author AOSORIO
 *
 */
@Embedded
public class ExtMaterials extends Materials {
	
	private String orderNumber;
	private String unit;
	private double quantity;
		
	public ExtMaterials() {
		super();
	}
	
	public ExtMaterials(Materials material) {
		
		this.setItemcode(material.getItemcode());
		this.setDescription(material.getDescription());
		this.setType(material.getType());
		this.setCategory(material.getCategory());
		this.setDimensions(material.getDimensions());
		this.setCode(material.getCode());
		
	}
	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}
	/**
	 * @param d the quantity to set
	 */
	public void setQuantity(double d) {
		this.quantity = d;
	}
	
	

}
