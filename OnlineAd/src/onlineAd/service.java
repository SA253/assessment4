package onlineAd;

public class service {
	private String name;
	private String desc;
	private String service;
	private String location;
	private String contact;
	public service(String name, String desc, String service, String location, String contact) {
		super();
		this.name = name;
		this.desc = desc;
		this.service = service;
		this.location = location;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
