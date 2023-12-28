package extends1.super1;



public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 자기자신 (생략가능)
        System.out.println("super value = " + super.value); //super는 부모가서 찾는거

        this.hello(); //생략가능
        super.hello();
    }
}
