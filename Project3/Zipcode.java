//
// Zip code class to find a postal
//barcode given an inputted zipcode.
//Also can find zipcode given an 
//inputted barcode.
//*******************************


public class Zipcode{


    private String zipcode;
    private String barcode;

//These variables stand for the first, second,
//etc. digits of the zipcode entered.

    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;

//These strings stand for each segment of code 
//corresponding to each digit of the zipcode entered.
    private String code1;
    private String code2;
    private String code3;
    private String code4;
    private String code5;
    private String checkDigit;

//These strings stand for each segment of barcode
//entered.

    private String bc1;
    private String bc2;
    private String bc3;
    private String bc4;
    private String bc5;

//These characters stand for each digit that
//corresponds to each segment of barcode entered.
    
    private char dig1;
    private char dig2;
    private char dig3;
    private char dig4;
    private char dig5;

    public Zipcode(int zip_number){

//These calculations separate each digit of the zipcode entered.

    first = (zip_number/10000) % 10;
    second = (zip_number/1000) % 10;
    third = (zip_number/100) % 10;
    fourth = (zip_number/10) % 10;
    fifth = zip_number % 10;
    barcode = "";
    code1 = "";
    code2 = "";
    code3 = "";
    code4 = "";
    code5 = "";
    checkDigit = "";
//Each of these methods input the correct piece of
//barcode into its variable. Barcodefinal method
//joins these codes into the final long barcode.
    FirstCode();
    SecondCode();
    ThirdCode();
    FourthCode();
    FifthCode();
    CheckDig();
    Barcodefinal();
    }

    public void FirstCode(){


        if(first == 1) { 
            code1 = ":::||"; 
        } 
        else if(first == 2) { 
            code1 = "::|:|"; 
        } 
        else if (first == 3) { 
            code1 = "::|||"; 
        } 
        else if (first == 4) { 
            code1 = ":|:::"; 
        } 
        else if (first == 5) { 
            code1 = ":|:||"; 
        } 
        else if (first == 6) { 
            code1 = ":||::"; 
        } 
        else if (first == 7) { 
            code1 = "|::::"; 
        } 
        else if (first == 8) { 
            code1 = "|::||"; 
        } 
        else if (first == 9) { 
            code1 = "|:|::"; 
        } 
        else if (first == 0) { 
            code1 = "||:::"; 
        } 
    }

    public void SecondCode(){


        if(second == 1) { 
            code2 = ":::||"; 
        } 
        else if(second == 2){ 
            code2 = "::|:|"; 
        } 
        else if (second == 3){ 
            code2 = "::|||"; 
        } 
        else if (second == 4){ 
            code2 = ":|:::"; 
        } 
        else if (second == 5){ 
            code2 = ":|:||"; 
        } 
        else if (second == 6){ 
            code2 = ":||::"; 
        } 
        else if (second == 7){ 
            code2 = "|::::"; 
        } 
        else if (second == 8){ 
            code2 = "|::||"; 
        } 
        else if (second == 9){ 
            code2 = "|:|::"; 
        } 
        else if (second == 0){ 
            code2 = "||:::"; 
        } 
    }
    
    public void ThirdCode(){


        if(third == 1){ 
            code3 = ":::||"; 
        } 
        else if(third == 2){ 
            code3 = "::|:|"; 
        } 
        else if (third == 3){ 
            code3 = "::|||"; 
        } 
        else if (third == 4){ 
            code3 = ":|:::"; 
        } 
        else if (third == 5){ 
            code3 = ":|:||"; 
        } 
        else if (third == 6){ 
            code3 = ":||::"; 
        } 
        else if (third == 7){ 
            code3 = "|::::"; 
        } 
        else if (third == 8){ 
            code3 = "|::||"; 
        } 
        else if (third == 9){ 
            code3 = "|:|::"; 
        } 
        else if (third == 0){ 
            code3 = "||:::"; 
        } 

    }
    public void FourthCode(){

        if(fourth == 1){ 
            code4 = ":::||"; 
        } 
        else if(fourth == 2){ 
            code4 = "::|:|"; 
        } 
        else if (fourth == 3){ 
            code4 = "::|||"; 
        } 
        else if (fourth == 4){ 
            code4 = ":|:::"; 
        } 
        else if (fourth == 5){ 
            code4 = ":|:||"; 
        } 
        else if (fourth == 6){ 
            code4 = ":||::"; 
        } 
        else if (fourth == 7){ 
            code4 = "|::::"; 
        } 
        else if (fourth == 8){ 
            code4 = "|::||"; 
        } 
        else if (fourth == 9){ 
            code4 = "|:|::"; 
        } 
        else if (fourth == 0){ 
            code4 = "||:::"; 
        } 

    }

    public void FifthCode(){

    
        if(fifth == 1){ 
            code5 = ":::||"; 
        } 
        else if(fifth == 2){ 
            code5 = "::|:|"; 
        } 
        else if (fifth == 3){ 
            code5 = "::|||"; 
        } 
        else if (fifth == 4){ 
            code5 = ":|:::"; 
        } 
        else if (fifth == 5){ 
            code5 = ":|:||"; 
        } 
        else if (fifth == 6){ 
            code5 = ":||::"; 
        } 
        else if (fifth == 7){ 
            code5 = "|::::"; 
        } 
        else if (fifth == 8){ 
            code5 = "|::||"; 
        } 
        else if (fifth == 9){ 
            code5 = "|:|::"; 
        } 
        else if (fifth == 0){ 
            code5 = "||:::"; 
        } 
    }

    public void CheckDig(){
    int sum = first + second + third
    + fourth + fifth;

//Calculations for checkDigit can be shown here.
//The check digit cannot exceed 50, (using 99999)
//so these calculations work.


    if (sum <= 10) {
        sum = 10 - sum;
    }
    else if (sum >= 10) {
        sum = 20 - sum;
    }
    else if (sum >= 20) {
        sum = 30 - sum;
    }
    else if (sum >= 30) {
        sum = 40 - sum;
    }
     else if (sum >= 40) {
        sum = 50 - sum;
    }

        if(sum == 1){
        checkDigit = ":::||";
        }
        else if(sum == 2){
        checkDigit = "::|:|";
        }
        else if(sum == 3){
        checkDigit = "::|||";
        }
        else if(sum == 4){
        checkDigit = ":|:::";
        }
        else if(sum == 5){
        checkDigit = ":|:||";
        }
        else if(sum == 6){
        checkDigit = ":||::";
        }
        else if(sum == 7){
        checkDigit = "|::::";
        }
        else if(sum == 8){
        checkDigit = "|::||";
        }
        else if(sum == 9){
        checkDigit = "|:|::";
        }
        else if(sum == 0){
        checkDigit = "||:::";
        }
        else if(sum == 10){
        checkDigit = "||:::";
        }
    }

    public void Barcodefinal(){
    barcode = "|" + code1+ code2 + code3
            + code4 + code5 + checkDigit + "|";
    }

    public String getBarcode(){
    return barcode;
    }

    public Zipcode(String bar_code){

    zipcode = "";
    bc1 = bar_code.substring(1,6);
    bc2 = bar_code.substring(6,11);
    bc3 = bar_code.substring(11,16);
    bc4 = bar_code.substring(16,21);
    bc5 = bar_code.substring(21,26);

    dig1 = dig1;
    dig2 = dig2;
    dig3 = dig3;
    dig4 = dig4;
    dig5 = dig5;

//These methods input the correct 
//digit for each segment of
//barcode inputted. ZipcodeFinal joins
//each digit and inputs it into the variable
//zipcode.

    FirstDigit();
    SecondDigit();
    ThirdDigit();
    FourthDigit();
    FifthDigit();
    ZipcodeFinal();
    }

    public void FirstDigit()
    {
        if(bc1.equals(":::||")){
        dig1 = '1';
        }
        else if(bc1.equals("::|:|")){
        dig1 = '2';
        }
        else if(bc1.equals("::|||")){
        dig1 = '3';
        }
        else if(bc1.equals(":|:::")){
        dig1 = '4';
        }
        else if(bc1.equals(":|:||")){
        dig1 = '5';
        }
        else if(bc1.equals(":||::")){
        dig1 = '6';
        }
        else if(bc1.equals("|::::")){
        dig1 = '7';
        }
        else if(bc1.equals("|::||")){
        dig1 = '8';
        }
        else if(bc1.equals("|:|::")){
        dig1 = '9';
        }
        else if(bc1.equals("||:::")){
        dig1 = '0';
        } 
    }
    

    public void SecondDigit()
    {

        if(bc2.equals(":::||")){
        dig2 = '1';
        }
        else if(bc2.equals("::|:|")){
        dig2 = '2';
        }
        else if(bc2.equals("::|||")){
        dig2 = '3';
        }
        else if(bc2.equals(":|:::")){
        dig2 = '4';
        }
        else if(bc2.equals(":|:||")){
        dig2 = '5';
        }
        else if(bc2.equals(":||::")){
        dig2 = '6';
        }
        else if(bc2.equals("|::::")){
        dig2 = '7';
        }
        else if(bc2.equals("|::||")){
        dig2 = '8';
        }
        else if(bc2.equals("|:|::")){
        dig2 = '9';
        }
        else if(bc2.equals("||:::")){
        dig2 = '0';
        }
    }

    public void ThirdDigit()
    {

        if(bc3.equals(":::||")){
        dig3 = '1';
        }
        else if(bc3.equals("::|:|")){
        dig3 = '2';
        }
        else if(bc3.equals("::|||")){
        dig3 = '3';
        }
        else if(bc3.equals(":|:::")){
        dig3 = '4';
        }
        else if(bc3.equals(":|:||")){
        dig3 = '5';
        }
        else if(bc3.equals(":||::")){
        dig3 = '6';
        }
        else if(bc3.equals("|::::")){
        dig3 = '7';
        }
        else if(bc3.equals("|::||")){
        dig3 = '8';
        }
        else if(bc3.equals("|:|::")){
        dig3 = '9';
        }
        else if(bc3.equals("||:::")){
        dig3 = '0';
        }
    }
    public void FourthDigit()
    {

        if(bc4.equals(":::||")){
        dig4 = '1';
        }
        else if(bc4.equals("::|:|")){
        dig4 = '2';
        }
        else if(bc4.equals("::|||")){
        dig4 = '3';
        }
        else if(bc4.equals(":|:::")){
        dig4 = '4';
        }
        else if(bc4.equals(":|:||")){
        dig4 = '5';
        }
        else if(bc4.equals(":||::")){
        dig4 = '6';
        }
        else if(bc4.equals("|::::")){
        dig4 = '7';
        }
        else if(bc4.equals("|::||")){
        dig4 = '8';
        }
        else if(bc4.equals("|:|::")){
        dig4 = '9';
        }
        else if(bc4.equals("||:::")){
        dig4 = '0';
        }
    }
    public void FifthDigit()
    {

        if(bc5.equals(":::||")){
        dig5 = '1';
        }
        else if(bc5.equals("::|:|")){
        dig5 = '2';
        }
        else if(bc5.equals("::|||")){
        dig5 = '3';
        }
        else if(bc5.equals(":|:::")){
        dig5 = '4';
        }
        else if(bc5.equals(":|:||")){
        dig5 = '5';
        }
        else if(bc5.equals(":||::")){
        dig5 = '6';
        }
        else if(bc5.equals("|::::")){
        dig5 = '7';
        }
        else if(bc5.equals("|::||")){
        dig5 = '8';
        }
        else if(bc5.equals("|:|::")){
        dig5 = '9';
        }
        else if(bc5.equals("||:::")){
        dig5 = '0';
        }
    }

    public void ZipcodeFinal(){ //joins each character into string


    zipcode = "" + dig1 + dig2 + dig3 + dig4 + dig5;

    }

    public String getZipcode(){
    
        return zipcode;
    }

}
