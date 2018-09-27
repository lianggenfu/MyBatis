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
		for (int i = 0; i < 5; i++) {// Ӣ����ס��ɫ����
			if (houses[i].country == Country.England) {
				if (houses[i].color == Color.Red) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 5; i++) {// ���������
			if (houses[i].country == Country.Swedish) {
				if (houses[i].pet == Pet.dog) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 5; i++) {// �����˺Ȳ�
			if (houses[i].country == Country.Dane) {
				if (houses[i].drink == Drink.tea) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		for (int i = 0; i < 4; i++) {// ��ɫ�����ڰ�ɫ��������,��ɫ���ӵ����˺ȿ���
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
		for (int i = 0; i < 5; i++) {// ��Pall Mall���̵�������
			if (houses[i].cigarette == Cigaretee.pallMall) {
				if (houses[i].pet == Pet.bird) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		for (int i = 0; i < 5; i++) {// ��ɫ�������˳�Dunhill����
			if (houses[i].color == Color.Yellow) {
				if (houses[i].cigarette == Cigaretee.Dunhill) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}
		if (houses[2].drink == Drink.milk) {// ס���м䷿�ӵ��˺�ţ��
			flag = true;
		} else {
			return false;
		}

		if (houses[0].country == Country.Norwegian) {// Ų����ס��һ�䷿
			flag = true;
		} else {
			return false;
		}

		if (houses[1].color == Color.Blue) {// Ų����ס��ɫ���Ӹ���
			flag = true;
		} else {
			return false;
		}

		for (int i = 0; i < 5; i++) {// ��Blue Master���˺�ơ��
			if (houses[i].cigarette == Cigaretee.blueMaster) {
				if (houses[i].drink == Drink.beer) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		for (int i = 0; i < 5; i++) {// �¹��˳�Prince����
			if (houses[i].country == Country.German) {
				if (houses[i].cigarette == Cigaretee.Prince) {
					flag = true;
				} else
					return false;
			} else
				continue;
		}

		for (int i = 0; i < 5; i++) {// ��Blends���̵�����һ����ˮ���ھ�
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
			System.out.println("��" + (i + 1) + "�䷿��: " 
					+ "��ɫ:" + Color.getColor(houses[i].color) 
					+ "����:"+ Country.getCountry(houses[i].country) 
					+ "����:" + Drink.getDrink(houses[i].drink) 
					+ "����:"+ Cigaretee.getCigaretee(houses[i].cigarette) 
					+ "����:" + Pet.getPet(houses[i].pet));
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
							System.out.println("���ڳ��Ե�" + (count++) + "��");
							if (Done(houses)) {
								System.out.println("�ҵ���!");
								System.exit(0);
							}else {
								System.out.println("����������!");
							}
						}
					}
				}
			}
		}

	}

}
