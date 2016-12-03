package com.camel.casing;

public class CamelCase {
	
	public static void main(String args[]){
		String name = "234ari!#ndam2@mondal";
		char nameArray[] = name.toCharArray();
		int flag = 1;
		for(int i=0;i<nameArray.length;i++){
			if(Character.isLetter(nameArray[i])){
				if(flag == 1){
					nameArray[i] = Character.toUpperCase(nameArray[i]);
					flag = 0;
				}
			}else{
				flag = 1;
			}
		}
		
		name = String.valueOf(nameArray);
		System.out.println(name);
		
		
	}

}
