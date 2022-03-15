package product;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 상품 등록, 리스트조회, 개별조회, 수정, 삭제를 데이터베이스를 연동하여 구현하세요
		// 서비스 인터페이스, DAO 인터페이스를 통해 반드시 구현체로 객체를 만드세요
		// 내일 수업 시작과 동시에 풀이 합니다. => 풀이 시간의 속도가 빠를 수 있다라는 의미...
		Scanner sc = new Scanner(System.in);
		Service service = new ProductServiceImple();
		boolean flag = true;
		int menu, price, pno = 0;
		String pname, madeby = null;
		
		while (flag) {
			System.out.println("-------------------- 상품 시스템 --------------------");
			System.out.println("1:상품 등록 2:리스트 조회 3:개별상품 조회 4:수정 5:삭제 0:종료");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("상품 이름 > ");
				pname = sc.next();
				System.out.println("상품 가격 > ");
				price = sc.nextInt();
				System.out.println("만든 사람 > ");
				madeby = sc.next();
				boolean isReg = service.register(new Product(pname, price, madeby));
				System.out.println("데이터 저장" + (isReg ? "성공" : "실패"));
				break;
			case 2:
				List<Product> list = service.getList();
				for (Product product : list) {
					System.out.println("pno:" + product.getPno() +"\tpname:" +
								product.getPname() +"\tprice :" + product.getPrice());
				}
				break;
			case 3:
				System.out.println("조회할 PNO를 입력하세요 > ");
				pno = sc.nextInt();
				Product listPno = service.getDetailPno(pno);
				System.out.println(listPno);
				break;
			case 4:
				Date regdate = null;
				System.out.println("수정할 PNO를 입력하세요 > ");
				pno = sc.nextInt();
				System.out.println("수정할 상품 이름 > ");
				pname = sc.next();
				System.out.println("수정할 상품 가격 > ");
				price = sc.nextInt();
				System.out.println("수정할 만든 사람을 입력하세요 > ");
				madeby = sc.next();
				boolean isUp = service.modify(new Product(pno,pname,price,regdate,madeby));
				System.out.println("데이터 수정" + (isUp ? "완료" : "실패"));
				break;
			case 5:
				System.out.println("삭제할 PNO를 입력하세요 > ");
				pno = sc.nextInt();
				boolean isDel = service.remove(pno);
				System.out.println("데이터 삭제" + (isDel ? "완료" : "실패"));
				break;

			default:
				flag = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
