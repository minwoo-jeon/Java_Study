package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myid", "jeon");
        member.print();
        member.changeData("myId2","Seo");
        member.print();
    }
}
