package com.java.practise.streams;

public class MultiThreading extends Thread{
public void run(){

  for (int i=0; i< 10; i++){
    System.out.println(i);
  }
}
}
