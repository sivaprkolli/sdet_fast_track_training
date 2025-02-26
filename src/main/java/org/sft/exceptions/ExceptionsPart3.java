package org.sft.exceptions;

public class ExceptionsPart3 {

    public void test1(){
        System.out.println("Test1");
    }

    public static void main(String[] args) {
        ExceptionsPart3 exceptionPart3 = null;
       // exceptionPart3 = new ExceptionPart3();
        try{
            int a = 5/1;
            int[] b = {1,2,43,5,6,7,7};
            int c = b[6];
            exceptionPart3.test1();
        }catch (ArithmeticException ae){
            System.out.println("ArithmeticException");
            ae.printStackTrace();
        }catch (IndexOutOfBoundsException ibe){
            System.out.println("IndexOutOfBoundsException");
            ibe.printStackTrace();
        }catch (NullPointerException re){
            System.out.println("NullPointerException");
            re.printStackTrace();
        }catch (Exception e){

        }catch (Throwable te){

        }
        finally {
            System.out.println("Manadatory Block");
        }
    }
}
