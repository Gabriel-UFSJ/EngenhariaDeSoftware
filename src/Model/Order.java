package Model;

public class Order extends Entity{

	private String DocumentNumber;
	private Integer Data;
	
	public String getDocumentNumber() {
		return DocumentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		DocumentNumber = documentNumber;
	}
	public Integer getData() {
		return Data;
	}
	public void setData(Integer data) {
		Data = data;
	}
	
	public String toString() {
		return "ID: " + getID();
	}
	
}
