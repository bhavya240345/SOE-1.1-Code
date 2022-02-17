 class Calculator{
    private String username;  
    private double runningTotal;
  
    //Constructor
    Calculator(String userName){
        username = userName;
    }
  
    //get the username
    public String getUserName(){
         return username;
    }
 
    //set runningTotal
    public void setrunningTotal(double total){
        runningTotal = total;
    }
   
    //get runningtotal
    public double getRunningTotal(){
        return runningTotal;
    }

    //method for adding two numbers
    public double addTwoNumbers(double num1,double num2){
        double total1;
        total1 = num1 + num2;
        runningTotal = runningTotal + total1;
        return runningTotal;
    }
    
    //method for subtracting two numbers
    public double subtractTwoNumbers(double num1,double num2){
        double total1;
        total1 = num1 - num2;
        runningTotal = runningTotal + total1;
        return total1;
    }

    //method for multiplying two numbers
    public double multiplyTwoNumbers(double num1,double num2){
        double total1;
        total1 = num1 * num2;
        runningTotal = runningTotal + total1;
        return total1;
    }
    
    //method for dividing two numbers
    public double divideTwoNumbers(double num1,double num2){
        double total1;
        total1 = num1 / num2;
        runningTotal = runningTotal + total1;
        return total1;
    }

    //method for checking number that it is even or odd 
    public boolean checkIsEven(int checkNum){
        int remainder = checkNum % 2;
        if( remainder == 0 ){
            return true;
        }
        else{
            return false;
        }
    }
    
    //method for getting the current status
    public void getCurrentStatus(){
        System.out.println( username + "" + " running total is "  + "" +  runningTotal );
    }
}