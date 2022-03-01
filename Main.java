//Tarea Fraccion
public class Main {
    public static void main(String args[]){
        Fraccion unCuarto = new Fraccion(1,4);
        
        //Operaciones Basicas
        Fraccion resDiv = unCuarto.dividir(1,3);
        Fraccion resMul = unCuarto.multiplicar(5,7);
        Fraccion resSuma = unCuarto.sumar(6,9);
        Fraccion resResta = unCuarto.restar(3,4);
        
        //Operaciones Especiales
        Fraccion resPot = unCuarto.potencia(3);
        Fraccion resRaiz = unCuarto.raizCuadrada();
        Fraccion resPorc = unCuarto.porcentajeDecimal();
        Fraccion resResiduo = unCuarto.residuo();
        
        
        
        System.out.println("Obj un cuarto: " + unCuarto.numerador + "/" + unCuarto.denominador);
        System.out.println("Obj Resultado division: " + resDiv.numerador + "/" + resDiv.denominador);
        System.out.println("Obj  Resultado multiplicacion: " + resMul.numerador + "/" + resMul.denominador);
        System.out.println("Obj  Resultado restar:" + resResta.numerador + "/" + resResta.denominador);
        System.out.println("Obj  Resultado sumar:" + resSuma.numerador + "/" + resSuma.denominador); 
        
        System.out.println("Obj  Resultado potencia:" + resPot.numerador + "/" + resPot.denominador);
        System.out.println("Obj  Resultado raiz cuadrado:" + resRaiz.numerador + "/" + resRaiz.denominador);
        System.out.println("Obj  Resultado Porcentaje:" + resPorc.denominador + "%");
        System.out.println("Obj  Resultado Decimal:" + resPorc.numerador);
        System.out.println("Obj  Resultado Residuo:" + resResiduo.denominador);
        
    }
}
