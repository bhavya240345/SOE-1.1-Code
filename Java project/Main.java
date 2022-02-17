import java.util.Random;  //for random()

class Main{  //Main class
    public static void main(String[] args) {   //main method

        Calculator calculator = new Calculator("User1");   //instance of Calculator Class
        
        double mainTotal = 0;
        calculator.setrunningTotal(mainTotal);  //set the value of runningTotal field
        
        //for addition
        double num1 = Math.random();
        double num2 = Math.random();
        mainTotal = calculator.addTwoNumbers(num1,num2);
        System.out.println("Result of Addition operation : " + mainTotal);
        calculator.setrunningTotal(mainTotal);
    
        //for Subtraction
        num1 = Math.random();
        num2 = Math.random();
        mainTotal = calculator.subtractTwoNumbers(num1,num2);
        System.out.println("Result of Subtraction operation : " + mainTotal);
        calculator.setrunningTotal(mainTotal);
    
        //for Multiplication
        num1 = Math.random();
        num2 = Math.random();
        mainTotal = calculator.multiplyTwoNumbers(num1,num2);
        System.out.println("Result of Multiplication operation : "+ mainTotal);
        calculator.setrunningTotal(mainTotal);
  
        //for Division
        num1 = Math.random();
        num2 = Math.random();
        mainTotal = calculator.divideTwoNumbers(num1,num2);
        System.out.println("Result of Division operation : "+ mainTotal);
        calculator.setrunningTotal(mainTotal);
        
        //for checking the number is even or odd
        int intTotal = (int) (calculator.getRunningTotal()*10);
         boolean r1 = calculator.checkIsEven(intTotal);
        if(r1 == true){
            System.out.println("intTotal is Even"); 
        }else{
            System.out.println("intTotal is Odd"); 
        }

        //current status 
        calculator.getCurrentStatus();
   }
}