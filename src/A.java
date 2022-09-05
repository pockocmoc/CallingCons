/*
   Продемонстрировать порядок вызова конструкторов
 */
public class A {
    A() {
        System.out.println("В конструкторе А.");
    }
}

// создать подкласс путем расширения класса А
class B extends A {
    B() {
        System.out.println("В конструкторе B.");
    }
}
// создать еще один подкласс путем расширения класса B
class C extends B {
    C() {
        System.out.println("В конструкторе С.");
    }
}
class  CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
