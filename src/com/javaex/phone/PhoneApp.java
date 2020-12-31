package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		boolean power = true;
		int menu, num;
		String name, hp, company, search;
		Scanner sc = new Scanner(System.in);
		PhoneDao phoneDao = new PhoneDao();
		List<PhoneVo> hpList;
		
		
		
		System.out.println("****************************");
		System.out.println("*      전화번호 관리 프로그램        *");
		System.out.println("****************************");
		
		while(power) {
			System.out.println("1.리스트 2.등록 3.수정 4.삭제 5.검색 6.종료");
			System.out.println("---------------------------------");
			System.out.print(">메뉴번호: ");
			menu = sc.nextInt();
			
			switch (menu){
				case 1: 
					System.out.println("<1.리스트>");

					
					hpList = phoneDao.getList();
					
					for(int i=0; i<hpList.size(); i++) {
						hpList.get(i).listInfo();
					}
					
					break;
				case 2:
					sc.nextLine();
					
					System.out.println("<2.등록>");

					
					System.out.print("이름> ");
					name = sc.nextLine();
					System.out.print("휴대전화> ");
					hp = sc.nextLine();
					System.out.print("회사번호> ");
					company = sc.nextLine();
					
					phoneDao.phoneInsert(name, hp, company);
					
					break;
					
				case 3:
					System.out.println("<3.수정>");
					
					System.out.print("번호> ");
					num = sc.nextInt();
					
					sc.nextLine();
					
					System.out.print("이름> ");
					name = sc.nextLine();
					System.out.print("휴대전화> ");
					hp = sc.nextLine();
					System.out.print("회사번호> ");
					company = sc.nextLine();
					
					phoneDao.getUpdate(num, name, hp, company);
					
					break;
					
				case 4:
					System.out.println("<4.삭제>");
					
					System.out.print(">번호: ");
					num = sc.nextInt();
					
					phoneDao.getDelete(num);
					
					break;
					
				case 5:
					System.out.println("<5.검색>");
					
					sc.nextLine();
					
					System.out.print("검색어> ");
					search = sc.nextLine();
					
					hpList = phoneDao.getSearch(search);
					for(int i=0; i<hpList.size(); i++) {
						hpList.get(i).listInfo();
					}
					
					break;
					
				case 6:
					System.out.println("************************");
					System.out.println("*****    감사합니다    *****");
					System.out.println("************************");

					
					power = false;
			}
		}
		sc.close();
	}

}
