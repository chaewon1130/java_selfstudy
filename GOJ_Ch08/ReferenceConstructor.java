package GOJ_Ch08;

public class ReferenceConstructor {
	public static void main(String[] args) {
		ReferenceConstructor reference = new ReferenceConstructor();
	}
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("dongho");
		MemberDTO dto3 = new MemberDTO("dongho", "01012345678");
		MemberDTO dto4 = new MemberDTO("dongho", "01012345678", "abcd@gmail.com");
	}
}
