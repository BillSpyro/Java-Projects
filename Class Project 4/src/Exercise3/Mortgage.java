package Exercise3;

import java.util.Scanner;

interface MortgageConstants{
	public static int ShortTerm = 1;
	public static int LongTerm = 5;
	public static int MidTerm = 3;
	public static String bankName = "Big Bank";
	public static int MaxAmount = 300000;
}

abstract class Mortgage implements MortgageConstants{
	static Scanner input = new Scanner(System.in);
	public static int MortNumber = 0;
	public static String MortName = "";
	public static String CustomerName = "";
	public static int MortAmount = 0;
	public static double rate = 0;
	public static int term = 0;
	abstract void getMortgageInfo();
	abstract void SetInfo(int x, String y, String d, int a, double c, int g);
	Mortgage(int MortNumber,String MortName, String CustomerName, int MortAmount, double rate, int term){
	}
	Mortgage(){
	}
}
