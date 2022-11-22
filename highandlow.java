package jp.co.fl.superintro.ch08;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//タイトル
		System.out.println("********************");
		System.out.println("\t*High & Low*");
		System.out.println("********************");
		
		while(true){
			//問題
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\t[問題表示]");
			int num1 = (int)(Math.random()*9)+1;
			System.out.println("＊ ＊ ＊ ＊  ＊ ＊ ＊ ＊");
			System.out.println("＊ 　 　 ＊  ＊ 　 　 ＊");
			System.out.println("＊ 　"+num1+"　 ＊  ＊ 　 　 ＊");
		    System.out.println("＊ 　 　 ＊  ＊ 　 　 ＊");
		    System.out.println("＊ ＊ ＊ ＊  ＊ ＊ ＊ ＊");
		   
		    //選択
		    System.out.print("High  or  Low  ?(h/l))＞");
		    String str = sc.nextLine();
		    
		    if(str.equals("h")){
		    	System.out.println("→High を選択しました。");
		    }else if(str.equals("l")) {
		    	System.out.println("→Low を選択しました。");
		    }else {
		    	System.out.println("「h」or「l」で回答してください。");    	
		    }
		    
		    //結果
		    System.out.println("\n\t[結果表示]");
			int num2 = (int)(Math.random()*9)+1;
		    System.out.println("＊ ＊ ＊ ＊  ＊ ＊ ＊ ＊");
			System.out.println("＊ 　 　 ＊  ＊ 　 　 ＊");
			System.out.println("＊ 　"+num1+"　 ＊  ＊ 　"+num2+"　 ＊");
		    System.out.println("＊ 　 　 ＊  ＊ 　 　 ＊");
		    System.out.println("＊ ＊ ＊ ＊  ＊ ＊ ＊ ＊");
		    
		    
		    if (num1<=num2 && str.equals("h") ) {
		        System.out.println("→You Win!");	
		    }else if (num1>=num2 && str.equals("l")){
		    	System.out.println("→You Win!");	
		    }else {
		    	System.out.println("→You Lose...\n-ゲーム終了-");
		    	break;
		    }
		}
	}

}
