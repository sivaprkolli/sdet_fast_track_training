package org.sft.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPart4 {

    public static void main(String[] args) {
        try{
            int a = 5/0;
            FileInputStream file = new FileInputStream("");
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
        }

        catch (ArrayIndexOutOfBoundsException ai){

        }

        catch (IndexOutOfBoundsException ie){

        }

        catch (FileNotFoundException fe){

        }

        catch (IOException io){

        }

        catch (NullPointerException ne){

        }

        catch (RuntimeException e){
            e.printStackTrace();
        }

        catch (Exception e){

        }

    }
}
