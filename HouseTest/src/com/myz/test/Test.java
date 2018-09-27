package com.myz.test;

class House {
	int color = -1;
	int country = -1;
	int drink = -1;
	int cigarette = -1;
	int pet = -1;
}

class Color {
	public static final int Green = 0;
	public static final int Yellow = 1;
	public static final int White = 2;
	public static final int Red = 3;
	public static final int Blue = 4;

	public static String getColor(int index) {
		switch (index) {
		case 0:
			return "Green";
		case 1:
			return "Yellow";
		case 2:
			return "White";
		case 3:
			return "Red";
		case 4:
			return "Blue";
		default:
			return "not find this color";
		}
	}
}

class Country {
	public static final int England = 0;
	public static final int Swedish = 1;
	public static final int Dane = 2;
	public static final int Norwegian = 3;
	public static final int German = 4;

	public static String getCountry(int index) {
		switch (index) {
		case 0:
			return "England";
		case 1:
			return "Swedish";
		case 2:
			return "Dane";
		case 3:
			return "Norwegian";
		case 4:
			return "German";
		default:
			return "not find this country";
		}
	}
}

class Drink {
	public static final int tea = 0;
	public static final int coffee = 1;
	public static final int milk = 2;
	public static final int beer = 3;
	public static final int water = 4;

	public static String getDrink(int index) {
		switch (index) {
		case 0:
			return "tea";
		case 1:
			return "coffee";
		case 2:
			return "milk";
		case 3:
			return "beer";
		case 4:
			return "water";
		default:
			return "not find this drink";
		}
	}
}

class Cigaretee {
	public static final int pallMall = 0;
	public static final int Dunhill = 1;
	public static final int Blends = 2;
	public static final int blueMaster = 3;
	public static final int Prince = 4;

	public static String getCigaretee(int index) {
		switch (index) {
		case 0:
			return "pallMall";
		case 1:
			return "Dunhill";
		case 2:
			return "Blends";
		case 3:
			return "blueMaster";
		case 4:
			return "Prince";
		default:
			return "not find this Cigaretee";
		}
	}
}

class Pet {
	public static final int dog = 0;
	public static final int bird = 1;
	public static final int hourse = 2;
	public static final int fish = 3;
	public static final int cat = 4;

	public static String getPet(int index) {
		switch (index) {
		case 0:
			return "dog";
		case 1:
			return "bird";
		case 2:
			return "hourse";
		case 3:
			return "fish";
		case 4:
			return "cat";
		default:
			return "not find this pet";
		}
	}
}

public class Test {
	public static int[][] sequence = PermAComb.secquence;

	public static void fullBlank(House[] houses, int field, int secquenceIndex) {
		switch (field) {
		case 0:
			for (int i = 0; i < 5; i++) {
				houses[i].color = sequence[secquenceIndex][i];
			}
			break;
		case 1:
			for (int i = 0; i < 5; i++) {
				houses[i].country = sequence[secquenceIndex][i];
			}
			break;
		case 2:
			for (int i = 0; i < 5; i++) {
				houses[i].drink = sequence[secquenceIndex][i];
			}
			break;
		case 3:
			for (int i = 0; i < 5; i++) {
				houses[i].cigarette = sequence[secquenceIndex][i];
			}
			break;
		case 4:
			for (int i = 0; i < 5; i++) {
				houses[i].pet = sequence[secquenceIndex][i];
			}
			break;
		}
	}

	public static boolean Done(House[] houses) {
		boolean flag = false;
		display(houses);
		for (int i = 0; i < 5; i++) {// 英国人住红色房子
			if (houses[i].country == Country.England) {
				if (houses[i].color == Color.Red) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 5; i++) {// 瑞典人养狗
			if (houses[i].country == Country.Swedish) {
				if (houses[i].pet == Pet.dog) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 5; i++) {// 丹麦人喝茶
			if (houses[i].country == Country.Dane) {
				if (houses[i].drink == Drink.tea) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 4; i++) {// 绿色房子在白色房子左面,绿色房子的主人喝咖啡
			if (houses[i].color == Color.Green) {
				if (houses[i + 1].color == Color.White) {
					if (houses[i].drink == Drink.coffee) {
						flag = true;
					} else
						return false;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 5; i++) {// 抽Pall Mall香烟的人养鸟
			if (houses[i].cigarette == Cigaretee.pallMall) {
				if (houses[i].pet == Pet.bird) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		for (int i = 0; i < 5; i++) {// 黄色房子主人抽Dunhill香烟
			if (houses[i].color == Color.Yellow) {
				if (houses[i].cigarette == Cigaretee.Dunhill) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		if (houses[2].drink == Drink.milk) {// 住在中间房子的人喝牛奶
			flag = true;
		} else {
			return false;
		}

		if (houses[0].country == Country.Norwegian) {// 挪威人住第一间房
			flag = true;
		} else {
			return false;
		}

		if (houses[1].color == Color.Blue) {// 挪威人住蓝色房子隔壁
			flag = true;
		} else {
			return false;
		}

		for (int i = 0; i < 5; i++) {// 抽Blue Master的人喝啤酒
			if (houses[i].cigarette == Cigaretee.blueMaster) {
				if (houses[i].drink == Drink.beer) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		for (int i = 0; i < 5; i++) {// 德国人抽Prince香烟
			if (houses[i].country == Country.German) {
				if (houses[i].cigarette == Cigaretee.Prince) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		for (int i = 0; i < 5; i++) {// 抽Blends香烟的人有一个喝水的邻居
			if (houses[i].cigarette == Cigaretee.Blends) {
				if ((i > 0 && houses[i - 1].drink == Drink.water) || (i < 4 && houses[i + 1].drink == Drink.water)) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		if (flag) {
			display(houses);
			System.exit(0);
		}

		return flag;
	}

	public static void display(House[] houses) {
		for (int i = 0; i < 5; i++) {
			System.out.println("第" + (i + 1) + "间房子: " 
					+ "颜色:" + Color.getColor(houses[i].color) 
					+ "国籍:"+ Country.getCountry(houses[i].country) 
					+ "饮料:" + Drink.getDrink(houses[i].drink) 
					+ "香烟:"+ Cigaretee.getCigaretee(houses[i].cigarette) 
					+ "宠物:" + Pet.getPet(houses[i].pet));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long count = 1;
		House[] houses = new House[5];
		for (int p = 0; p < 5; p++)
			houses[p] = new House();
		for (int i = 0; i < 120; i++) {
			fullBlank(houses, 0, i);
			for (int j = 0; j < 120; j++) {
				fullBlank(houses, 1, i);
				for (int k = 0; k < 120; k++) {
					fullBlank(houses, 2, i);
					for (int m = 0; m < 120; m++) {
						fullBlank(houses, 3, i);
						for (int n = 0; n < 120; n++) {

							fullBlank(houses, 4, i);
							System.out.println("正在尝试第" + (count++) + "次");
							if (Done(houses)) {
								System.out.println("找到了!");
								System.exit(0);
							}else {
								System.out.println("不满足条件!");
							}
						}
					}
				}
			}
		}

	}

}
