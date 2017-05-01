package com.sharyi_dmytro.practice.module10.task02;

class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

     String printExceptionMessage(){
        System.out.println(getMessage());
        return getMessage();
    }
}
