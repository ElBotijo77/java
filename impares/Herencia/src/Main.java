//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    C obj = new C();

    //Acceso a la clase C
    System.out.println("---Acceso desde exterior---");
    System.out.println("Campo c2 de C = " + obj.c2);
    System.out.println("Campo c1 de C = " + obj.c1);
    System.out.println("Campo c1 oculto de B = " + ((B)obj).c1);
    System.out.println("Campo c1 oculto de A = " + ((A)obj).c1);

    //Acceso desde la misma clase C
    obj.verCampos();

    obj.c2 = "azul";
    obj.c1 = 'k';

    B obj3 = (B)obj;
    System.out.println("obj3.c2 -> " + obj3.c2);
    System.out.println("obj3.c1 -> " + obj3.c1);

    System.out.println("----Sobrescritura------");
    C obj2 = new C();
    obj2.metodoA();
    obj2.metodoB();
    obj2.metodoC();
    System.out.println("-------------------");
    obj2.metodoSobrescrito1();
    ((B)obj2).metodoSobrescrito1();
    ((A)obj2).metodoSobrescrito1();
    System.out.println("-------------------");
    obj.metodoSobrescrito2();
}
