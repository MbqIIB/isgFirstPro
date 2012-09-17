package com.isg.ifrend.dao;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collection;

public class Dog extends Animal {

	
	public void speak(){System.out.println("Hello Dog!");}
	
	public static void main(String[] args){
		
		Dog dog = new Dog();
		Animal animal = (Animal)dog;
		animal.speak();
		StringBuffer[] messages = new StringBuffer[5];
		
		try {
			InetAddress ip = InetAddress.getByName("www.ecetera.com.au");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * @param arg 
	 * 
	 */
	static public int send(String arg){ return Integer.SIZE;}
	
	
//	public void hasName(Collection names, String nameToFind) {
//		
//		for (Iterator i = names.iterator(); i.hasNext();) {
//			if (nameToFind.equals((String) i.next())) {
//				System.out.println("Name Found");
//			}
//		}
//	}
	
	public void hasName(Collection<String> names, String nameToFind){
		
		for(String name:names){
			if(nameToFind.equals(name)){
				System.out.println("Name Found");
			}
		}		
	}
	
	
	
	

	
	
	
	
}
