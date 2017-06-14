package springweb.z01_dto;

public class Code {
	private String key;
	private String value;
	
	
	/**
	 * @param key
	 * @param value
	 */
	public Code(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
