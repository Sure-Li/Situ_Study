package consoleproject;

import java.util.Scanner;

public class TaskHandle {
	private Scanner sc;

	public void menuHandle(int menuNum) {
		switch (menuNum) {
		case 1:
			accountRegistration();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

	public void accountRegistration() {
		System.out.println("任务1");
		sc = new Scanner(System.in);
		System.out.println("请输入您的用户名");
		String user = sc.next();
		System.out.println("请输入您的密码");
		String password = sc.next();
		System.out.println(user);
		System.out.println(password);
	}
}
