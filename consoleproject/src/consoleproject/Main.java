package consoleproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TaskHandle taskhandle = new TaskHandle();
		System.out.println("\t欢迎使用_车库停车管理系统_");
		System.out.println("\t 请按照下面的提示进行操作");
		Scanner sc = new Scanner(System.in);
		int menuChooseNum = 0;
		while (true) {
			System.out.println("\t请进行项目的选择：");
			System.out.println("1.账号开通\t2.账号余额查询\t3.账号续费\t4.账号变更\t0.退出系统");
			menuChooseNum = sc.nextInt();
			taskhandle.menuHandle(menuChooseNum);
			if (0 == menuChooseNum) {
				sc.close();
				System.out.println("退出系统成功");
				break;
			}
		}

	}

}
