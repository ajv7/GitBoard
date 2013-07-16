package com.neo.util;

import java.io.UnsupportedEncodingException;

public class UtilityClass {
	private String uId;
	public void setId(String id){
		this.uId = id;
	}
	public String getId(){
		return uId;
	}
	
	public boolean WordFilter(String Content) throws UnsupportedEncodingException{
		String[] Filter = {"개","고양이","욕이다","채팅","funck"};
		for(int i=0; i<Filter.length; i++){
			if(Content.trim().contains(Filter[i])){
 
				return true;	
			}
		}
		/*if(Content.trim().contains(Filter[1])){
			return true;
		}*/
		String str = "dd";
		new String(str.getBytes("UTF-8"),"UTF-8");
		return false;
	}
 
	public String Toto (String str) throws Exception {
		return new String(str.getBytes("8859_1"),"UTF-8");
	}
	public static void main(String[] args) {
		UtilityClass test = new UtilityClass();
		boolean ck = false;
		try {
			ck = test.WordFilter("내다");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ck);
		
	}
}
