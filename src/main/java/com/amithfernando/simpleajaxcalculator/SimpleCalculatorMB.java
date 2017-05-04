/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amithfernando.simpleajaxcalculator;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Amith
 */
@ManagedBean
@SessionScoped
public class SimpleCalculatorMB implements Serializable {

    private String outPutValue = "";
    private boolean isOpretorCliked = false;
    private String clickedOpreator = "";
    double previousValue = 0;

    /*
     OPRETOR ACTION #############################################################
     */
    public void clearAction(){
        outPutValue="";
        previousValue=0;
        isOpretorCliked=false;
        clickedOpreator="";
    }
    
    public void plusOperatorClicked() {
        isOpretorCliked = true;
        if (!outPutValue.isEmpty()) {
            previousValue = Double.parseDouble(outPutValue);
        } else {
            previousValue = 0;
        }
        clickedOpreator = "+";
    }

    public void minusOperatorClicked() {
        isOpretorCliked = true;
        if (!outPutValue.isEmpty()) {
            previousValue = Double.parseDouble(outPutValue);
        } else {
            previousValue = 0;
        }
        clickedOpreator = "-";
    }

    public void multiplyOperatorClicked() {
        isOpretorCliked = true;
        if (!outPutValue.isEmpty()) {
            previousValue = Double.parseDouble(outPutValue);
        } else {
            previousValue = 0;
        }
        clickedOpreator = "*";
    }

    public void devisionOperatorClicked() {
        isOpretorCliked = true;
        if (!outPutValue.isEmpty()) {
            previousValue = Double.parseDouble(outPutValue);
        } else {
            previousValue = 0;
        }
        clickedOpreator = "/";
    }

    public void equalOperatorClicked() {
        isOpretorCliked = true;
        double currentValue = Double.parseDouble(outPutValue);
        double answer = 0;
        if (clickedOpreator.equals("+")) {
            answer = currentValue + previousValue;
        } else if (clickedOpreator.equals("-")) {
            answer = previousValue - currentValue;
        } else if (clickedOpreator.equals("*")) {
            answer = previousValue * currentValue;
        } else if (clickedOpreator.equals("/")) {
            answer = previousValue / currentValue;
        }
        outPutValue=""+answer;
    }

    /*
     BTN ACTION #################################################################
     */
     public void number0Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("0", outPutValue);
    }
    
    public void number1Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("1", outPutValue);
    }

    public void number2Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("2", outPutValue);
    }

    public void number3Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("3", outPutValue);
    }

    public void number4Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("4", outPutValue);
    }

    public void number5Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("5", outPutValue);
    }

    public void number6Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("6", outPutValue);
    }

    public void number7Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("7", outPutValue);
    }

    public void number8Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("8", outPutValue);
    }

    public void number9Clicked() {
        if (isOpretorCliked) {
            outPutValue = "";
            isOpretorCliked = false;
        }
        outPutValue = appendNumber("9", outPutValue);
    }

    private String appendNumber(String number, String outPut) {
        String trim = outPut.trim();
        StringBuilder builder = new StringBuilder(trim);
        builder.append(number);
        return builder.toString();
    }

    /*
     GETTER & SETTER ############################################################
     */
    public String getOutPutValue() {
        return outPutValue;
    }

    public void setOutPutValue(String outPutValue) {
        this.outPutValue = outPutValue;
    }

}
