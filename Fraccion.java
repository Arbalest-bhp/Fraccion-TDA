public class Fraccion{
	
	//Atributos
	double numerador = 0;
	double denominador = 1;

	//Métodos
	
	//Constructor
	public Fraccion(double n, double d){
		this.numerador = n;
		this.denominador = d;
	}
         //DividirFraccion
	Fraccion dividir(double num, double denom){
		double nuevoNumerador = this.numerador * denom;
		double nuevoDenominador = this.denominador * num;

                Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

                return fraccionResultado;
	} 

        //MultiplicarFraccion
        Fraccion multiplicar(double num, double denom){
		double nuevoNumerador = this.numerador * num;
		double nuevoDenominador = this.denominador * denom;

                Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

                return fraccionResultado;            
        }

        //SumarFraccion
        Fraccion sumar(double num, double denom){
            if(this.denominador == denom){
                double nuevoNumerador = this.numerador + num;
                double nuevoDenominador = this.denominador;
                Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
                return fraccionResultado;
                
            }else{
		double nuevoNumerador = (this.numerador * denom) + (this.denominador * num);
		double nuevoDenominador = this.denominador * denom;

                Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

                return fraccionResultado;
            }
        } 
        
        //RestarFraccion
        Fraccion restar(double num, double denom){
            if(this.denominador == denom){
                double nuevoNumerador = this.numerador - num;
                double nuevoDenominador = this.denominador;
                Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
                return fraccionResultado;
                
            }else{
		double nuevoNumerador = (this.numerador * denom) - (this.denominador * num);
		double nuevoDenominador = this.denominador * denom;

                Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

                return fraccionResultado;
            }
        } 
        //PotenciaFraccion
        Fraccion potencia(double poten){
            double resNum = 1;
            double resDen = 1;
            while (poten != 0){
                resNum = resNum * this.numerador;
                resDen = resDen * this.denominador;
                poten--;
            }
            double nuevoNumerador = resNum;
            double nuevoDenominador = resDen;
            
            Fraccion fraccionresultado = new Fraccion(nuevoNumerador, nuevoDenominador);
            return fraccionresultado;
        }
        
        //RaizCuadrado number to the half power
        Fraccion raizCuadrada(){
            double resultado;
            double raizCuad = this.numerador / 2;
            do {
                    resultado = raizCuad;
                    raizCuad = (resultado + (this.numerador / resultado)) / 2;
            } while ((resultado - raizCuad) != 0);
        
            double nuevoNumerador = raizCuad;
            //Denominador
            double resultado1;
            double raizCuad1 = this.denominador / 2;
            do {
                    resultado1 = raizCuad1;
                    raizCuad1 = (resultado1 + (this.denominador / resultado1)) / 2;
            } while ((resultado1 - raizCuad1) != 0);
                  
            double nuevoDenominador = raizCuad1;
            
            Fraccion fraccionresultado = new Fraccion(nuevoNumerador, nuevoDenominador);
            return fraccionresultado;            
        }
        
        //Porcentaje
         Fraccion porcentajeDecimal(){
            double decimal = this.numerador/ this.denominador;
            double porcentaje = decimal * 100;
            
            Fraccion porcentajeresultado = new Fraccion(decimal, porcentaje);
            return porcentajeresultado; 

        }
        //Residuo dividen top, divisor bottom
         Fraccion residuo(){
             double quotient = this.numerador/ this.denominador;
             double residuo = this.numerador % this.denominador;
             
            Fraccion residuoresultado = new Fraccion(quotient, residuo);
            return residuoresultado; 
         }
        


} //Fraccion




