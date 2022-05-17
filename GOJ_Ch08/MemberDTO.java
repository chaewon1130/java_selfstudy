package GOJ_Ch08;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	public MemberDTO() {
	}
	public MemberDTO(String name) {
		super();
		this.name = name;
	}
	public MemberDTO(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public MemberDTO(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
}
