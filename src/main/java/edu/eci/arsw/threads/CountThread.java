/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
	
	private int numero1;
	private int numero2;
	
	public CountThread(int a, int b) {
		numero1=a;
		numero2=b;
	}
	 
	public void run(){  
		for(int x= numero1 ; x<=numero2 ; x++) {
			System.out.println(x);
		} 
	} 
    
}
