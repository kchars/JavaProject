package inheritances;

import java.util.Scanner;

public class FriendList {
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {
		// 추가... Scanner 클래스....
		// 1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		while (true) {
			System.out.println("________________________");
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색");
			System.out.println("________________________");
			System.out.println("선택> ");
			menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("친구이름> ");
				String name = scn.nextLine();
				System.out.println("전화번호> ");
				String phone = scn.nextLine();
				new Friend(name, phone);
				saveFriend(friend);

			} else if (menu == 2) {
				saveFriend(new UnivFriend("", "", ""));

			} else if (menu == 3) {
				saveFriend(new ComFriend("", "", ""));

			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.println("찾을 이름 입력>");
				String findName = scn.nextLine();
				for (Friend friend : friends) {
					if (friend != null && friend.name.equals(findName)) {
						System.out.println("친구정보 : " + friend.toString());
					}
				}

			} else if (menu == 6) {
				break;
			}
		} // end of while

//		frieds[0]  = new Friend("임성원","01012345678");
//		frieds[1] = new ComFriend("정준영","01012345678", "총무부");
//		frieds[2] = new UnivFriend("정준영","01012345678","역사학과");

//		for (Friend firend : frieds_1) {
//			if (firend != null) {
//				System.out.println(firend.toString());
//
//			}
//		}
	} // end of main

	public static void saveFriend(Friend friend) {
		for(int i = 0; i < friends.length; i++ ) {
			if(friends[i] == null) {
				friends[i] = friend;
			}
			return;
		}
	}

} // end of class
